<template>
  <nav>
    <div class="nav-container">
      <h1>ChatTErbot</h1>
      <div class="router-links">
        <router-link v-bind:to="{ name: 'home' }">Home</router-link> 
        <router-link v-bind:to="{ name: 'chatBot' }">ChatTErbot</router-link> 
        <router-link v-bind:to="{ name: 'jobSearch' }">jobSearch</router-link> 
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
    font-family: Arial, "Helvetica Neue", Helvetica, sans-serif;
    color: aliceblue;
    margin: 0;
    padding: 0;
    font-size: 2rem;
    font-weight: bold;
    background: linear-gradient(to bottom, #ffffff, #4e9be4);
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent;
  }

  .nav-container {
    font-family: Arial, "Helvetica Neue", Helvetica, sans-serif;
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

  .router-links router-link:hover,
.router-links a:hover {
  box-shadow: 0 0 15px rgba(59, 151, 236, 0.842);
}
</style>