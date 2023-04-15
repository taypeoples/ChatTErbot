import axios from "axios";

const options = {
  method: 'GET',
  url: 'https://jsearch.p.rapidapi.com/search',
  params: {query: 'Junior software developer in Ohio, USA', page: '1', num_pages: '1'},
  headers: {
    'X-RapidAPI-Key': '14fe3c00dfmsh014a33ce133cd06p1d9bc9jsna547623318d1',
    'X-RapidAPI-Host': 'jsearch.p.rapidapi.com'
  }
};

export default {

  getJobs(){
    return axios.request(options)
  }

}