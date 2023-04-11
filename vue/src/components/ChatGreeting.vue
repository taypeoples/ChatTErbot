<template>
  <div>
    <p>'Hello, what should I call you?'</p>
    <form v-on:submit.prevent="submitNickname">
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
  data(){
    return{
      nickname: ''
    }
  },
  /* mounted() {
        
            /* this.messages.push('Hello, what should I call you?'); */
  /*  const userSetNickname = window.prompt('Enter your nick-name');
            return userSetNickname;
        }, */

  methods: {
    submitNickname() {
      this.$emit('passNickname', this.nickname);
    },
  },
};
</script>

<style scoped>
</style>