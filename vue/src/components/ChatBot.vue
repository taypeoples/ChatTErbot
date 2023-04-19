<template>
  <div id="main" class="main">
    <div id="chat-app">
      <div class="nav">
        <the-header />
      </div>
      <div ref="chatContainer" class="chat-container">
        <div id="messages">
          <div v-for="message in messages" v-bind:key="message.id">
            <div class="textbox" v-html="message"></div>
          </div>
        </div>
      </div>

      <div class="user-input">
        <form v-if="!firstMessage" v-on:submit.prevent="handleSubmit">
          <input
            class="chat-entry"
            type="text"
            v-model="userMessage"
            placeholder="Type your message here"
          />
          <button>Submit</button>
        </form>

        <form v-if="firstMessage" v-on:submit.prevent="getNickname">
          <input
            class="chat-entry"
            type="text"
            v-model="nickname"
            placeholder="Type your message here"
          />
          <button>Submit</button>
        </form>

        <ul id="commands" class="commands">
          <li>Type "Home" to be returned to the beginning of the chatbot</li>
          <li>Type "Back" to be returned to the previous prompt selection</li>
          <li>Type "Assistance" if you are stuck or unsure what to do</li>
        </ul>
        <br />
        <p>&#169; Copyright 2023 Tech Elevator</p>
      </div>
    </div>
  </div>
</template>
<script>
// import JobService from '../services/JobService.js';
import QuoteService from "../services/QuoteService.js";
import ResponseService from "../services/ResponseService.js";
import TheHeader from "./TheHeader.vue";

export default {
  components: {
    
    TheHeader,
  },
  data() {
    return {
      userMessage: "",
      botResponseMessage: {},
      messages: [],
      nickname: "",
      firstMessage: true,
      jobHelp: false,
      botStyle:
        '<img class ="ava" src ="https://imagizer.imageshack.com/img924/5237/mTr9vv.png" > ChatTErbot:</img><div class = "bot">',
      usertag:
        '<img class ="user-ava" src ="https://pic.onlinewebfonts.com/svg/img_561543.png" />',
      userStyle: '<div class = "user">',
      jobs: [],
    };
  },

  created(){
    this.messages.push(this. botStyle + "Hey there, my name is ChatTErbot! What should I call you?")
  },

  methods: {
    handleSubmit() {
      this.messages.push(
        this.usertag +
          this.nickname +
          " :" +
          this.userStyle +
          this.userMessage +
          "</div>"
      );
      if (this.userMessage.includes("quote")) {
        this.isBot = true;
        QuoteService.quote().then((response) => {
          let quote = response.data.quoteText + " -" + response.data.author;
          this.messages.push(this.botStyle + quote + "</div>");
        });
      } else if (this.userMessage.includes("assistance")) {
        this.getAssistance();
      } else if (
        this.userMessage.includes("job search") ||
        this.userMessage.includes("open positions") ||
        this.userMessage.includes("jobs") ||
        this.userMessage.includes("job")
      ) {
        this.messages.push(
          this.botStyle +
            '<a href="http://localhost:8080/jobSearch" target= "_blank">Open Job Search</a></div>'
        );
      } else {
        let messageToSend = {
          messageId: 0,
          messageBody: this.userMessage,
        };
        ResponseService.sendMessage(messageToSend).then((response) => {
          this.responseMessage = response.data.messageBody;
          if (this.responseMessage == null) {
            this.messages.push(
              this.botStyle +
                "Sorry, I'm not sure how to help you, " +
                this.nickname +
                ". Please type your response again or type a command to let me know what I should do. </div>"
            );
          } else {
            this.messages.push(this.botStyle + this.responseMessage + "</div>");
          }
        });
      }
      this.userMessage = "";
      this.$nextTick(()=> {
        this.$refs.chatContainer.scrollTop = this.$refs.chatContainer.scrollHeight;
      })
    },

    getNickname() {
      let nickname = this.nickname ;
      this.messages.push(this.usertag + this.userStyle + nickname + "</div>");
      ResponseService.getFirstResponse().then((response) => {
        this.responseMessage = response.data.messageBody;
        this.messages.push(
          this.botStyle + this.responseMessage + nickname + "? </div>"
        );
      });
      /* this.messages.push(
        "<p>I can help you with:</p><ul><li>Pathway information</li><li>Curriculum</li><li>Get a motivational quote</li>Which would you like, " +
          nickname +
          "?"
      ); */
      this.firstMessage = false;
    },
    getAssistance() {
      ResponseService.getBotResponse("help", "assistance", "default").then(
        (response) => {
          this.messages.push(
            this.botStyle +
              "Sorry you're stuck, " +
              this.nickname +
              ". " +
              response.data.messageBody +
              "</div>"
          );
        }
      );
    },
  },
};
</script>

<style scoped>
.main {
  font-family: Arial, "Helvetica Neue", Helvetica, sans-serif;
  margin: 0;
}

#chat-app {
  height: 100vh;
  display: grid;
  grid-template-columns: 1fr;
  grid-template-rows: auto 1fr auto;
  grid-template-areas:
    "nav"
    "chat-container"
    "user-input";
}

#chat-app > .nav {
  grid-area: nav;
}

#chat-app > .chat-container {
  background: url("C:\Users\Student\source\repos\pair programming\team-quebec\vue\pictures\chatbgd.png");
  grid-area: chat-container;
  overflow-y: auto;
  max-height: 100%;
  padding: 15px 5px 10px 5px;
}

#chat-app > .user-input {
  grid-area: user-input;
}

.textbox {
  font-size: large;
  border-width: 80%;
  margin-top: 20px;
}

.textbox >>> .bot {
  font-family: "Lucida Console", Monaco, monospace;
  background: #eefdff;
  border-width: 3px;
  border-style: solid;
  border-radius: 5px;
  border-color: #287ec7;
  padding: 20px;
  margin-right: 25%;
  margin-left: 20px;
}

.textbox >>> .user {
  background: #e1eaed;
  border-width: 3px;
  border-style: solid;
  border-radius: 5px;
  border-color: #000000;
  padding: 20px;
  margin-left: 25%;
}

.textbox >>> .ava {
  width: 20px;
  height: 20px;
  font-size: small;
  text-align: center;
  vertical-align: middle;
  padding: 5px;
}

.textbox >>> img.user-ava {
  width: 20px;
  height: 20px;
  font-size: small;
  text-align: center;
  vertical-align: middle;
  padding: 5px;
  margin-left: 25%;
}

button:hover {
  background-color: rgb(212, 212, 212);
  box-shadow: 3px 3px lightgray;
}

ul {
  list-style: none;
  margin-top: 15px;
  padding: 0;
}

li {
  font-size: 16px;
  line-height: 1.5;
  margin-bottom: 3px;
}
</style>
