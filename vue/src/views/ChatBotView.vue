<template>
  <div>
    <chat-greeting/>
      <chat-bot/>

  </div>
</template>

<script>

import ChatBot from '../components/ChatBot.vue'
import ChatGreeting from '../components/ChatGreeting.vue'
export default {
  components: { 
      ChatBot,
    ChatGreeting, 
      },

}
</script>

<style scoped>

</style>