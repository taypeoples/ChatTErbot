<template>
  <nav>
    <!-- Image later for logo -->
    <li>ChatBot Name</li>
    <router-link v-bind:to="{ name: 'home' }">Home |</router-link> 
    <router-link v-bind:to="{ name: 'chatBot' }">ChatBot |</router-link> 
    <a href=""> </a>
    <router-link v-bind:to="{ name: 'login' }" v-if="$store.state.token == ''">Login |</router-link>
    <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout |</router-link>
  </nav>
</template>

<script>
export default {
    name: 'the-header',
    data() {
        return {

        }
    }
};
</script>

<style scoped>
</style>