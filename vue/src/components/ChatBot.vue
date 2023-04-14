<template>
  <div>
    <chat-greeting v-on:passNickname="getNickname($event)" />
    <div
      id="messageBox"
      v-for="message in messages"
      v-bind:key="message.id"
      class="textbox"
    >
      <div class="msgbox">
        <span v-html="message"></span>
      </div>
    </div>
    <div id="chatContainer"></div>

    <form v-if="showForm === true" v-on:submit.prevent="handleSubmit">
      <input
        id="chatEntry"
        type="text"
        class=""
        v-model="userMessage"
        placeholder="Type your message here"
      />
      <button>Submit</button>
    </form>
  </div>
</template>
<script>
import QuoteService from "../services/QuoteService.js";
import ResponseService from "../services/ResponseService.js";
import ChatGreeting from "./ChatGreeting.vue";

export default {
  components: {
    ChatGreeting,
  },
  data() {
    return {
      userMessage: "",
      responseMessage: {},
      messages: [],
      nickname: "",
      showForm: false,
      link: "",
      needHelp: false,
      assistanceBoolean: false,
      isQuote: false,
    };
  },

  methods: {
    handleSubmit() {
      this.messages.push(this.userMessage);

      if (this.userMessage.includes("quote")) {
        QuoteService.quote().then((response) => {
          let quote = response.data.quoteText + " -" + response.data.author;
          this.messages.push(quote);
        });
      } else {
        let messageToSend = {
          messageId: 0,
          messageBody: this.userMessage,
        };
        ResponseService.sendMessage(messageToSend).then((response) => {
          this.responseMessage = response.data.messageBody;
          this.messages.push(this.responseMessage);
        });
      }

      this.userMessage = "";
    },

    assistanceResponse(inputArray) {
      let wordFound = false;
      inputArray.forEach((word) => {
        if (this.$store.state.allKeywords.includes(word)) {
          wordFound = true;
        }
      });

      if (wordFound == false) {
        //bot response
        this.messages.push(
          //maybe add more layers for each category vs only using main help message
          "Sorry, I'm not sure how to help you, please type your response again or type 'assistance' to see your options"
        );
        this.assistanceBoolean = true;
      }
    },

    filterHelp(inputArray) {
      inputArray.forEach((word) => {
        if (word == "assistance") {
          this.needHelp = true;
          this.getHelp();
        }
      });
    },

   
    getNickname(nickname) {
      this.nickname = nickname;
      this.messages.push(nickname);
      //working on making this push to messages again
      ResponseService.getBotResponse("default", "default", "default").then(
        (response) => {
          const firstResponse = response.data.messageBody;

          this.messages.push(firstResponse + " " + nickname + "?");
        }
      );
      this.showForm = true;
    },
    getHelp() {
      ResponseService.getBotResponse("default", "default", "default").then(
        (response) => {
          const firstResponse =
            response.data.messageText + " " + this.nickname + "?";
          this.messages.push(firstResponse);
        }
      );
    },
  },
};
</script>

<style scoped>
.msgbox {
  border-width: 3px;
  border-style: solid;
  border-color: #287ec7;
  border-radius: 5px;
  padding: 20px;
  border-width: 80%;
  margin-top: 20px;
  margin-bottom: 20px;
}

button:hover {
  background-color: rgb(212, 212, 212);
  box-shadow: 3px 3px lightgray;
}
</style>
