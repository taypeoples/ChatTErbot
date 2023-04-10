<template>
  <div id="app">
    <the-header/>   
    <div id="nav">
      <!--   &nbsp;|&nbsp;
      <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>-->
    </div>
    <router-view />
    <the-footer/>
  </div>
</template>


<script>
import TheHeader from './components/TheHeader.vue';
import TheFooter from './components/TheFooter.vue';
export default {
  components: { 
    TheHeader,
    TheFooter,

  
  },
};
</script>