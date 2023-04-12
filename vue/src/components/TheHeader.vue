<template>
  <nav>
    <div class="nav-container">
      <h1>ChatBot</h1>
      <div class="router-links">
        <router-link v-bind:to="{ name: 'home' }">Home</router-link> 
        <router-link v-bind:to="{ name: 'chatBot' }">ChatBot</router-link> 
        <router-link v-bind:to="{ name: 'login' }" v-if="$store.state.token == ''">Login</router-link>
        <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>
      </div>
    </div>
  </nav>
</template>

<script>
export default {
    name: 'the-header',
    data() {
        return {}
    }
};
</script>

<style scoped>
  h1 {
    color: aliceblue;
    margin: 0;
    padding: 0;
    font-size: 2rem;
    font-weight: bold;
  }

  .nav-container {
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 10px;
    background-color: #1f1f1f1f;
    color: white;
  }

  .router-links {
    display: flex;
    justify-content: space-between;
    align-items: center;
  }

  .router-links router-link,
  .router-links a {
    margin-right: 20px;
    color: white;
    text-decoration: none;
    border: 1px solid #1664b4;
    padding: 5px 10px;
    border-radius: 5px;
  }
</style>