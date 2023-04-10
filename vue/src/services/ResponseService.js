import axios from 'axios';

export default {
/* todo: come back to this and implement greeting based on nickname */
  setNickname(user){
      return axios.put('/', user);
  }

}