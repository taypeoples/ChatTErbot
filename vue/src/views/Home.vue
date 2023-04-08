<template>
  <div class="home">
    <h1>Home</h1>
    <p>You must be authenticated to see this</p>
    <quote />
  </div>
</template>

<script>
import Quote from '../components/Quote.vue';
export default {
  components: { Quote },
  name: "home"
};
</script>
