import axios from 'axios';

export default {
/* todo: come back to this and implement greeting based on nickname */
  setNickname(user){
      return axios.put('/', user);
  },

  //remove after work is done on chabot CSS, will break handleresponse in Chatbot component
  getBotMessage(userMessage){
      return axios.post('/messages', userMessage);
  },

  getBotResponse(category, keyword1, keyword2){
    return axios.get(`/messages/${category}/${keyword1}/${keyword2}`);
  }



}