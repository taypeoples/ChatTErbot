<template>
  <div id="app">
    <the-header/>   
    <div id="nav">
    </div>
    <router-view />
   <!--  <div id="footer">
    <the-footer/>
    </div> -->
  </div>
</template>


<script>
import TheHeader from './components/TheHeader.vue';
/* import TheFooter from './components/TheFooter.vue'; */
export default {
  components: { 
    TheHeader,
    /* TheFooter, */

  
  },
};
</script>

<style scoped>
nav{
background: #131313;
}

</style>