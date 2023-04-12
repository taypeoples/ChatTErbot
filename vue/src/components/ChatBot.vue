<template>
  <div>
    <chat-greeting v-on:passNickname="getNickname($event)" />
    <div
      id="messageBox"
      v-for="message in messages"
      v-bind:key="message.id"
      class="textbox"
    >
      <p>{{ message }}</p>
      <!-- <div v-if="link != ''" >
        <a :href="link">Open Link</a>
      </div> -->
    </div>

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
      isQuote: false
    };
  },
 
  methods: {
    handleSubmit() {
      this.messages.push(this.userMessage);
      let inputArray = this.userMessage.toLowerCase().split(" ");
      this.filterHelp(inputArray);
      if (this.needHelp == false) {
        this.assistanceResponse(inputArray);
      }
      if (this.needHelp == false && this.assistanceBoolean == false) {
        this.filterKeywords(inputArray);
        if(this.isQuote == false){
        this.handleResponse(this.userMessage);
        }
      }
      this.userMessage = "";
      this.needHelp = false;
      this.assistanceBoolean = false;
      this.isQuote = false;
    },

    assistanceResponse(inputArray) {
      let wordFound = false;
      inputArray.forEach((word) => {
        if (this.$store.state.allKeywords.includes(word)) {
          wordFound = true;
        }
      });

      if (wordFound == false) {
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

        if (word == "pathway") {
          this.$store.commit("SET_NEED_CATEGORY", word);
        }

        if (word == "resume") {
          this.$store.commit("SET_KEYWORD1", word);
        } else if (word == "interview") {
          this.$store.commit("SET_KEYWORD1", word);
        } else if (word == "cover") {
          this.$store.commit("SET_KEYWORD1", word);
        }

        if (word == "parts") {
          this.$store.commit("SET_KEYWORD2", word);
        } else if (word == "links") {
          this.$store.commit("SET_KEYWORD2", word);
        } else if (word == "prep") {
          this.$store.commit("SET_KEYWORD2", word);
        } else if (word == "outfit") {
          this.$store.commit("SET_KEYWORD2", word);
        } else if (word == "star") {
          this.$store.commit("SET_KEYWORD2", word);
        }
      });
    },

    handleResponse() {
      ResponseService.getBotResponse(
        this.$store.state.needCategory,
        this.$store.state.keyword1,
        this.$store.state.keyword2
      ).then((response) => {
        const responseMessage = response.data.messageText;
        if (response.data.url != null) {
          //adding element for url
          const linkItem = document.getElementById("messageBox");

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
      ResponseService.getBotResponse("default", "default", "default").then(
        (response) => {
          const firstResponse = response.data.messageText;

          this.messages.push(firstResponse + " " + nickname + "?");
        }
      );
      this.showForm = true;
    },
    getHelp() {
      ResponseService.getBotResponse("default", "default", "default").then(
        (response) => {
          const firstResponse = response.data.messageText;
          this.messages.push(firstResponse + " " + this.nickname + "?");
        }
      );
    },
  },
};
</script>

<style scoped>
.textbox {
  border-width: 3px;
  border-style: solid;
  border-color: #287ec7;
  border-radius: 5px;
  padding: 20px;
  border-width: 80%;
}

button:hover {
  background-color: rgb(212, 212, 212);
  box-shadow: 3px 3px lightgray;
}
</style>