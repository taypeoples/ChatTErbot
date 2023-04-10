<template>
  <div>
    
    <p>Whatever the chat bot is communicating</p><p>Chatbot</p>




    <form v-on:submit.prevent = "handleSubmit">
    <input id="chatEntry" type="text" class="" v-model="message" placeholder="Type your message here" />
    <button>Submit</button>
    </form>
    <p> Current User: {{this.$store.state.user.id}}</p>
  </div>
</template>

<script>
/* import QuoteService from '../services/QuoteService.js' */

export default {

    data(){
        return {
            message: '',



            }

        }
    },

    computed: {
        /* todo: come back to this and implement greeting based on nickname */
        setNickname(){
            return null;
        }
    },


    methods: {
        handleSubmit(){
            console.log('Submitted message:', this.message)
            this.message = '';
        },
        greetUser(){
            
        }
        
    },


};
</script>

<style scoped>
</style>