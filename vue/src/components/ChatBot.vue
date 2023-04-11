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
    <!-- <p>Current User: {{ this.$store.state.user.id }}</p> -->
  </div>
</template>
<script>
/* import QuoteService from '../services/QuoteService.js' */
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
      showForm: false
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
      this.handleResponse(this.userMessage);
      this.userMessage = "";
    },
    handleResponse(userMessage) {
      ResponseService.getBotMessage(userMessage).then((response) => {
        const responseMessage = response.data.messageText;
        this.messages.push(responseMessage);
      });
    },
    getNickname(nickname) {
      this.nickname = nickname;
      this.messages.push(nickname);
      this.messages.push('What can I help you with, ' + nickname + '?');
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