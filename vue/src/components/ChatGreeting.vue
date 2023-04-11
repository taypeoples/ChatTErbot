<template>
  <div>
      <p> 'Hello, what should I call you?'</p>
      <form v-on:submit.prevent="handleNickname">
      <input
        id="chatEntry"
        type="text"
        class=""
        v-model="nickname"
        placeholder="Type your message here"
      />
      <button>Submit</button>
    </form>

  </div>
</template>

<script>
export default {
    data() {
        return {
           
        }
        
    }, 
    mounted() {
        
            this.messages.push('Hello, what should I call you?');
            const userSetNickname = window.prompt('Enter your nick-name');
            return userSetNickname;
        },
      
    
     methods: {
         handleNickname(nickname) {
             this.$store.commit("SET_NICKNAME", nickname);
         }
     },

}
</script>

<style scoped>

</style>