<template>
  <div>
      <div v-for="job in jobs" v-bind:key="job.id"> 
          
          <div>Comapny Name: {{job.employer_name}}</div>
          <div>Application Link: {{job.job_apply_link}}</div>
          <button>Click here to </button>
          <div>Pay Range: {{job.job_min_salary}} - {{job.job_max_salary}}</div>
          <!-- <div>{{jobs}}</div> -->




      </div>
    <button v-on:click = "populateJobsArray">Click here to poulate array with jobs</button>

  </div>
</template>

<script>
import JobService from '../services/JobService.js'
export default {

data () {
    return {
        jobs: [],
        jobTitle: "junior software developer",
        state: "Ohio"
    }
},

created() {
    // turned this off because we only get so many calls per month, can turn back on if we decide to go this way with design implemented button instead.
    //Can also create second account if we hit too many calls lol
    /* this.populateJobsArray(); */
   
},

methods: {
    populateJobsArray(){
        JobService.getJobs(this.jobTitle, this.state).then((response) => {
         this.jobs = (response.data.data);
        })
    }

}


}
</script>

<style scoped>

</style>