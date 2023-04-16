<template>
  <div>
      <div v-for="job in jobs" v-bind:key="job.id"> 
          
          <div>Comapny Name: {{job.employer_name}}</div>
          <div>Application Link: {{job.job_apply_link}}</div>
          <!-- <div> <p> Pay Range: {{job.job_max_salary}}</p> <p> {{job.job_min_salary}}</p></div> -->
          <!-- <div>{{jobs}}</div> -->




      </div>


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
    this.populateJobsArray();
   
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