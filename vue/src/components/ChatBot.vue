<template>
  <div>
    <chat-greeting v-on:passNickname="getNickname($event)" />
    <p v-for="message in messages" v-bind:key="message.id">{{ message }}</p>
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
      responseMessage: "",
      messages: [],
      nickname: "",
      showForm: false,
    };
  },
  // computed: {
  //     /* todo: come back to this and implement greeting based on nickname */
  //     // grabStoredNickName(){
  //     //     if (this.$store.state.user.nickname != null){
  //     //         return this.$store.user.nickname;
  //     //     }
  //     //      return null ;
  //     // },
  // },
  methods: {
    handleSubmit() {
      this.messages.push(this.userMessage);
      let inputArray = this.userMessage.toLowerCase().split(" ");
      this.filterKeywords(inputArray);
      this.handleResponse(this.userMessage);
      this.userMessage = "";
    },

    filterKeywords(inputArray){
      inputArray.forEach((word) => {
        if (word == "quote") {
          let quote = "";
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
    // pageOpen(){
    //     let Greeting = '';
    //     if(this.$store.user.nickname != null){
    //         Greeting = ` Hello ${this.$store.user.nickname}`;
    //     } else {
    //        let nickname = this.promptForNickname();
    //         Greeting = ` Hello ${nickname}`;
    //     }
    // this.messages.push(Greeting);
  },
  // promptForNickname(){
  //     this.messages.push('Hello, what should I call you?');
  //     const userSetNickname = window.prompt('Enter your nick-name');
  //     return userSetNickname;
  // }
};
</script>
<style scoped>
</style>