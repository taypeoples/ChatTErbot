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
    // createUserMessage(userInput) {
    //   const container = document.getElementById("chatContainer");
    //   const newMessage = document.createElement("p");
    //   newMessage.setAttribute("class", "user");
    //   newMessage.innerText = userInput;
    //   container.appendChild(newMessage);
    //   this.forceRerender();
    // },

    // createBotMessage(botInput) {
    //   const container = document.getElementById("chatContainer");
    //   const newMessage = document.createElement("p");
    //   newMessage.setAttribute("class", "bot");
    //   newMessage.innerText = botInput;
    //   container.appendChild(newMessage);
    // },

    handleSubmit() {
      this.messages.push(this.userMessage);
      let messageToSend = {
        messageId: 0,
        messageBody: this.userMessage
      };
      ResponseService.sendMessage(messageToSend).then((response) => {
        this.responseMessage = response.data.messageBody;
        this.messages.push(this.responseMessage);
      });
      this.userMessage = "";

      /* let inputArray = this.userMessage.toLowerCase().split(" ");
      this.filterHelp(inputArray);
      if (this.needHelp == false) {
        this.assistanceResponse(inputArray);
      }
      if (this.needHelp == false && this.assistanceBoolean == false) {
        this.filterKeywords(inputArray);
        if (this.isQuote == false) {
          this.handleResponse(this.userMessage);
        }
      }
      this.userMessage = "";
      this.needHelp = false;
      this.assistanceBoolean = false;
      this.isQuote = false; */

      //possible future formatting
      // ResponseService.sendMessage(this.userMessage).then(message => {
      //   this.responseMessage =message.data.responseText
      //   this.messages.push(this.responseMessage)
      // })
      // this.userMessage = '';
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

    filterKeywords(inputArray) {
      inputArray.forEach((word) => {
        if (word == "quote") {
          let quote = "";
          this.isQuote = true;
          QuoteService.quote().then((response) => {
            quote = response.data.quoteText + " -" + response.data.author;
            this.messages.push(quote);
          });
        }
        // updated filtering logic
        //first layer
        if (
          this.$store.state.needCategory == "default" &&
          this.$store.state.keyword1 == "default" &&
          this.$store.state.keyword2 == "default"
        ) {
          if (word == "pathway") {
            this.$store.commit("SET_NEED_CATEGORY", word);
          }
          // second layer
        } else if (
          this.$store.state.needCategory == "pathway" &&
          this.$store.state.keyword1 == "default" &&
          this.$store.state.keyword2 == "default"
        ) {
          if (word == "resume") {
            this.$store.commit("SET_KEYWORD1", word);
          } else if (word == "interview") {
            this.$store.commit("SET_KEYWORD1", word);
          } else if (word == "cover") {
            this.$store.commit("SET_KEYWORD1", word);
          } else if (word == "back" || word == "home") {
            this.$store.commit("SET_NEED_CATEGORY", "default");
          }

          //third layer
        } else if (
          this.$store.state.needCategory == "pathway" &&
          this.$store.state.keyword1 == "resume" &&
          this.$store.state.keyword2 == "default"
        ) {
          if (word == "parts") {
            this.$store.commit("SET_KEYWORD2", word);
          } else if (word == "links") {
            this.$store.commit("SET_KEYWORD2", word);
          } else if (word == "back") {
            this.$store.commit("SET_KEYWORD1", "default");
          } else if (word == "home") {
            this.$store.commit("SET_KEYWORD1", "default");
            this.$store.commit("SET_KEYWORD2", "default");
            this.$store.commit("SET_NEED_CATEGORY", "default");
          }
        } else if (
          this.$store.state.needCategory == "pathway" &&
          this.$store.state.keyword1 == "cover" &&
          this.$store.state.keyword2 == "default"
        ) {
          if (word == "parts") {
            this.$store.commit("SET_KEYWORD2", word);
          } else if (word == "links") {
            this.$store.commit("SET_KEYWORD2", word);
          } else if (word == "back") {
            this.$store.commit("SET_KEYWORD1", "default");
          } else if (word == "home") {
            this.$store.commit("SET_KEYWORD1", "default");
            this.$store.commit("SET_KEYWORD2", "default");
            this.$store.commit("SET_NEED_CATEGORY", "default");
          }
        } else if (
          this.$store.state.needCategory == "pathway" &&
          this.$store.state.keyword1 == "interview" &&
          this.$store.state.keyword2 == "default"
        ) {
          if (word == "prep") {
            this.$store.commit("SET_KEYWORD2", word);
          } else if (word == "follow") {
            this.$store.commit("SET_KEYWORD2", word);
          } else if (word == "outfit") {
            this.$store.commit("SET_KEYWORD2", word);
          } else if (word == "star") {
            this.$store.commit("SET_KEYWORD2", word);
          } else if (word == "back") {
            this.$store.commit("SET_KEYWORD1", "default");
          } else if (word == "home") {
            this.$store.commit("SET_KEYWORD1", "default");
            this.$store.commit("SET_KEYWORD2", "default");
            this.$store.commit("SET_NEED_CATEGORY", "default");
          }
        }
        // fourth layer
        else if (
          this.$store.state.needCategory == "pathway" &&
          this.$store.state.keyword1 == "resume" &&
          this.$store.state.keyword2 == "parts"
        ) {
          if (word == "back") {
            this.$store.commit("SET_KEYWORD2", "default");
          } else if (word == "home") {
            this.$store.commit("SET_KEYWORD1", "default");
            this.$store.commit("SET_KEYWORD2", "default");
            this.$store.commit("SET_NEED_CATEGORY", "default");
          }
        } else if (
          this.$store.state.needCategory == "pathway" &&
          this.$store.state.keyword1 == "resume" &&
          this.$store.state.keyword2 == "links"
        ) {
          if (word == "back") {
            this.$store.commit("SET_KEYWORD2", "default");
          } else if (word == "home") {
            this.$store.commit("SET_KEYWORD1", "default");
            this.$store.commit("SET_KEYWORD2", "default");
            this.$store.commit("SET_NEED_CATEGORY", "default");
          }
        } else if (
          this.$store.state.needCategory == "pathway" &&
          this.$store.state.keyword1 == "cover" &&
          this.$store.state.keyword2 == "parts"
        ) {
          if (word == "back") {
            this.$store.commit("SET_KEYWORD2", "default");
          } else if (word == "home") {
            this.$store.commit("SET_KEYWORD1", "default");
            this.$store.commit("SET_KEYWORD2", "default");
            this.$store.commit("SET_NEED_CATEGORY", "default");
          }
        } else if (
          this.$store.state.needCategory == "pathway" &&
          this.$store.state.keyword1 == "cover" &&
          this.$store.state.keyword2 == "links"
        ) {
          if (word == "back") {
            this.$store.commit("SET_KEYWORD2", "default");
          } else if (word == "home") {
            this.$store.commit("SET_KEYWORD1", "default");
            this.$store.commit("SET_KEYWORD2", "default");
            this.$store.commit("SET_NEED_CATEGORY", "default");
          }
        } else if (
          this.$store.state.needCategory == "pathway" &&
          this.$store.state.keyword1 == "interview" &&
          this.$store.state.keyword2 == "prep"
        ) {
          if (word == "back") {
            this.$store.commit("SET_KEYWORD2", "default");
          } else if (word == "home") {
            this.$store.commit("SET_KEYWORD1", "default");
            this.$store.commit("SET_KEYWORD2", "default");
            this.$store.commit("SET_NEED_CATEGORY", "default");
          }
        } else if (
          this.$store.state.needCategory == "pathway" &&
          this.$store.state.keyword1 == "interview" &&
          this.$store.state.keyword2 == "follow"
        ) {
          if (word == "back") {
            this.$store.commit("SET_KEYWORD2", "default");
          } else if (word == "home") {
            this.$store.commit("SET_KEYWORD1", "default");
            this.$store.commit("SET_KEYWORD2", "default");
            this.$store.commit("SET_NEED_CATEGORY", "default");
          }
        } else if (
          this.$store.state.needCategory == "pathway" &&
          this.$store.state.keyword1 == "interview" &&
          this.$store.state.keyword2 == "outfit"
        ) {
          if (word == "back") {
            this.$store.commit("SET_KEYWORD2", "default");
          } else if (word == "home") {
            this.$store.commit("SET_KEYWORD1", "default");
            this.$store.commit("SET_KEYWORD2", "default");
            this.$store.commit("SET_NEED_CATEGORY", "default");
          }
        } else if (
          this.$store.state.needCategory == "pathway" &&
          this.$store.state.keyword1 == "interview" &&
          this.$store.state.keyword2 == "star"
        ) {
          if (word == "back") {
            this.$store.commit("SET_KEYWORD2", "default");
          } else if (word == "home") {
            this.$store.commit("SET_KEYWORD1", "default");
            this.$store.commit("SET_KEYWORD2", "default");
            this.$store.commit("SET_NEED_CATEGORY", "default");
          }
        }
        this.assistanceBoolean = false;
      });
    },

    handleResponse() {
      ResponseService.getBotResponse(
        this.$store.state.needCategory,
        this.$store.state.keyword1,
        this.$store.state.keyword2
      ).then((response) => {
        const responseMessage = response.data.messageBody;
        if (response.data.url != null) {
          //adding element for url
          const linkItem = document.getElementById("chatContainer");
          const content = document.createElement("a");
          content.setAttribute("href", response.data.url);
          content.innerText = "Open Link";
          linkItem.insertAdjacentElement("afterend", content);

          this.link = response.data.url;
        }
        this.messages.push(responseMessage);
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
