import axios from "axios";



export default {


  //jsearch api good but may need to pay for 1 month so that we can do all the searches we need while working on this
  getJobs(jobTitle, state) {

    const options = {
      method: 'GET',
      url: 'https://jsearch.p.rapidapi.com/search',
      params: { query: `${jobTitle} in ${state}, USA`, page: '1', num_pages: '1' },
      headers: {
        'X-RapidAPI-Key': '14fe3c00dfmsh014a33ce133cd06p1d9bc9jsna547623318d1',
        'X-RapidAPI-Host': 'jsearch.p.rapidapi.com'
      }
    };

    return axios.request(options)
  },


}