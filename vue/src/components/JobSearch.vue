<template>
  <div>{{jobs}}</div>
</template>

<script>
import JobService from '../services/JobService.js'
export default {

data () {
    return {
        jobs: []
    }
},

computed: {
   populateArray(){
       return this.populateJobsArray();
   }
},

methods: {
    populateJobsArray(){
        JobService.jobSearch().then((response) => {
         this.jobs = response.data;
        })
       /*  this.jobs.push(JobService.jobSearch); */
    }

}


}
</script>

<style scoped>

</style>