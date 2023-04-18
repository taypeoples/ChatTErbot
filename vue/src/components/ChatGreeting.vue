<template>
  <div>
  <img class ="ava" src ="https://imagizer.imageshack.com/img924/5237/mTr9vv.png" /> ChatTErbot:
    <p id = "openingMessage">Welcome! What should I call you?</p> 

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
button:hover {
  background-color: rgb(212, 212, 212);
  box-shadow: 3px 3px lightgray;
}

#openingMessage {
  font-family: "Lucida Console", Monaco, monospace;
  font-size: large;
  border-width: 3px;
  background: #eefdff;
  border-style: solid;
  border-color: #287ec7;
  border-radius: 5px;
  padding: 20px;
  border-width: 80%;
  margin-top: 5px;
  margin-bottom: 20px;
  margin-right: 25%;
}

.ava {
  width: 20px;
  height: 20px;
  font-size: small;
  text-align: center;
  vertical-align: middle;
  padding: 5px;
}

</style>