<template>
  <div class="home">
    <h1>TE Chat Bot</h1>
    <div class="floating-card">
      <p>Click Here To Access The Chatbot</p>
      <a href="/chatbot">Get Chatting</a>
    </div>
  </div>
</template>

<script>
export default {
  name: "home"
};
</script>

<style scoped>

body {
  font-family: fantasy;
  margin: 0;
}


.home {
  font-family: Arial, "Helvetica Neue", Helvetica, sans-serif;
  background: #131313;
  display: flex;
  flex-direction: column;
  align-items: center;
  height: 100vh;
}

.home h1 {
  background-color: #ffffff;
  background-image: linear-gradient(to top, #5ec2e0 0%, #60aae6 21%, #4ea9e6 22%, #e7e3e477 78%, #ffffff 100%);
  background-size: 100%;
  margin-bottom: 5rem;
  font-size: 2.5rem;
  -webkit-background-clip: text;
  -moz-background-clip: text;
  -webkit-text-fill-color: transparent;
  -moz-text-fill-color: transparent;
}
.floating-card:hover {
  transform: scale(1.05);
}

.floating-card {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  margin-top: 2rem;
  height: 525px;
  width: 400px;
  border-radius: 20px;
  background-image: linear-gradient(to bottom, rgba(255, 255, 255rgba(255, 255, 255, 0.6)7,17,0.6) 100%);
  background-size: cover;
  position: relative;
  color: #fff;
  background-position: center;
  background-image: url('/pictures/Capture1.PNG');
  background-size: 250%;
  transition: transform 0.2s ease-in-out;
  text-align: center;

}

.floating-card p {
  margin-bottom: 2rem;
  font-size: 2.5rem;
  background: linear-gradient(to bottom, #6388ec 0%, #ffffff 100%);
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  -webkit-text-stroke: .2px rgb(0, 0, 0);
}

.floating-card a {
  display: block;
  background-color: #1d1d1d;
  color: rgb(255, 255, 255);
  padding: 1rem 2rem;
  border-radius: 4px;
  text-decoration: none;
  font-weight: bold;
  transition: background-color 0.2s ease-in-out;
  margin-top: 2rem;
}

.floating-card a:hover {
  background-color: #4298df;
}
</style>