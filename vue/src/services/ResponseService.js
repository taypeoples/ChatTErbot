import axios from 'axios';

export default {
/* todo: come back to this and implement greeting based on nickname */
  setNickname(user){
      return axios.put('/', user);
  },

  getBotResponse(category, keyword1, keyword2){
    return axios.get(`/messages/${category}/${keyword1}/${keyword2}`);
  },

  sendMessage(userMessage){
    return axios.post('/messages', userMessage);
  },

  getFirstResponse(){
    return axios.get('/firstResponse');
  },



}