<template>
  <div>
    <p>'Hello, what should I call you?'</p>
    <form v-if="showForm === true" v-on:submit.prevent="submitNickname">
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
      nickname: "",
      showForm: true,
    };
  },
  /* mounted() {
        
            /* this.messages.push('Hello, what should I call you?'); */
  /*  const userSetNickname = window.prompt('Enter your nick-name');
            return userSetNickname;
        }, */

  methods: {
    submitNickname() {
      this.$emit("passNickname", this.nickname);
      this.showForm = false;
    },
  },
};
</script>

<style scoped>
</style>