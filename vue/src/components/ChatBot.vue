<template>
  <div>
    <p v-for="message in messages" v-bind:key="message.id" >{{message}}</p>

    <form v-on:submit.prevent="handleSubmit">
      <input
        id="chatEntry"
        type="text"
        class=""
        v-model="userMessage"
        placeholder="Type your message here"
      />
      <button>Submit</button>
    </form>
    <p>Current User: {{ this.$store.state.user.id }}</p>
  </div>
</template>

<script>
/* import QuoteService from '../services/QuoteService.js' */
import ResponseService from '../services/ResponseService.js'

export default {
    data(){
        return {
            userMessage: '',
            messages: [],
            };
        },

    computed: {
        /* todo: come back to this and implement greeting based on nickname */
        setNickname(){
            return null;
        },
    },


    methods: {
        handleSubmit(){
            this.messages.push(this.userMessage);
            this.handleResponse(this.userMessage);
            this.message = '';
        },
        greetUser(){
            return null;
        },
        handleResponse(userMessage){
            ResponseService.getBotMessage(userMessage).then( response =>{
                return response;
            })
        }
        
    },


};
</script>

<style scoped>
</style>