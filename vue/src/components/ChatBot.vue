<template>
  <div id= "main" class="main">
    <chat-greeting v-on:passNickname="getNickname($event)" />
    <div id="messages" v-for="message in messages" v-bind:key="message.id">
      <!-- :class="isBot ? 'active' : 'textbox'" -->
      <div>
        <div class="textbox" v-html="message"></div>
      </div>
    </div>

    <div>
      <form v-if="showForm === true" v-on:submit.prevent="handleSubmit">
        <input
          class="chat-entry"
          type="text"
          v-model="userMessage"
          placeholder="Type your message here"
        />
        <button>Submit</button>
      </form>
      <ul id="commands" class="commands">
        <li>Type "Home" to be returned to the beginning of the chatbot</li>
        <li>Type "Back" to be returned to the previous prompt selection</li>
        <li>Type "Assistance" if you are stuck or unsure what to do</li>
      </ul>
    </div>
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
      botResponseMessage: {},
      messages: [],
      nickname: "",
      showForm: false,
      isBot: false,
      jobHelp: false,
      botStyle: '<img class ="ava" src ="https://coursereport-production.imgix.net/uploads/school/logo/259/original/mark.png?w=72&amp;h=72">  ChatTErbot:</img><div class = "bot">',
      userStyle: '<div class = "user">',
    };
  },

  methods: {
    handleSubmit() {
      this.isBot = false;
      this.messages.push(this.userStyle + this.userMessage + "</div>");
      if (this.userMessage.includes("quote")) {
        this.isBot = true;
        QuoteService.quote().then((response) => {
          let quote = response.data.quoteText + " -" + response.data.author;
          this.messages.push(this.botStyle + quote + "</div>");
        });
      } else if (this.userMessage.includes("assistance")) {
        this.getAssistance();
      }
       else if (this.userMessage.includes("job search") || this.userMessage.includes("open positions") || this.userMessage.includes("jobs")){
        this.messages.push(this.botStyle + '<a href="http://localhost:8080/jobSearch" target= "_blank">Open Job Search</a></div>');
      } 
      else {
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
      // this.autoscroll();
      this.userMessage = "";
    },

    getNickname(nickname) {
      this.nickname = nickname;
      this.messages.push(this.userStyle + nickname + "</div>");
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
      this.showForm = true;
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
    getJobSearch(){
      this.messages.push('<router-link');
    },
/*     autoscroll(){
      const scrollDiv = document.getElementById("commands");
      scrollDiv.scrollIntoView(false);
  }, */
  }
};
</script>

<style scoped>
.main {
  font-family: Arial, "Helvetica Neue", Helvetica, sans-serif;
}

.textbox {
  font-size: large;
  border-width: 80%;
  margin-top: 20px;
  margin-bottom: 20px;
}

.textbox >>> .bot {
  font-family: Georgia, serif;
  background: #eefdff;
  border-width: 3px;
  border-style: solid;
  border-radius: 5px;
  border-color: #287ec7;
  padding: 20px;
  margin-right: 25%;
}

.textbox >>> .user {
  background:  #ebfaeb;
  border-width: 3px;
  border-style: solid;
  border-radius: 5px;
  border-color: #29a329;
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

.commands{
  bottom:0;
  position: absolute;
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
