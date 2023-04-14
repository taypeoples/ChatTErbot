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
    <ul>
      <li>Type "Home" to be returned to the beginning of the chatbot</li>
      <li>Type "Back" to be returned to the previous prompt selection</li>
      <li>Type "Assistance" if you are stuck or unsure what to do</li>
    </ul>
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
      } else if (this.userMessage.includes("assistance")) {
        this.getHelp();
      } else {
        let messageToSend = {
          messageId: 0,
          messageBody: this.userMessage,
        };
        ResponseService.sendMessage(messageToSend).then((response) => {
          this.responseMessage = response.data.messageBody;
          if (this.responseMessage != null) {
            this.messages.push(this.responseMessage);
          } else {
            this.messages.push(
              "Sorry, I'm not sure how to help you, please type your response again or type a command to let me know what I should do."
            );
          }
        });
      }
      this.userMessage = "";
    },

    /* assistanceResponse() {
      let inputArray = userMessage.split("");
      let wordFound = false;
      inputArray.forEach((word) => {
        if (this.$store.state.allKeywords.includes(word)) {
          wordFound = true;
        }
      });
      if (wordFound == false) {
        this.messages.push(
          "Sorry, I'm not sure how to help you, please type your response again or type a command to let me know what I should do."
        );
      }
    }, */

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

ul {
  list-style: none;
  margin-top: 40px;
  padding: 0;
}

li {
  font-size: 16px;
  line-height: 1.5;
  margin-bottom: 3px;
}

#chatEntry {
  width: 400px;
}
</style>
