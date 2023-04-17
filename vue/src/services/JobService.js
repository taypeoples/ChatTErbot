import axios from "axios";



export default {


  //jsearch api 
  // good but may need to pay for 1 month so that we can do all the searches we need while working on this 
  // or create a bunch of fake email addresses and swap out the key
  // key for secondary account when we want to test:
  // 1b4f580bcdmshdfcfba45a52a733p157bcfjsn6f674d11d064
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