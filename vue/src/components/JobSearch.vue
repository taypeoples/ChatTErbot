<template>
<div>
    <form>
        <label for="jtitle">Job Title:</label><br>
        <input type="text" id="jtitle" name="jtitle"><br>
        <label for="location">Location:</label><br>
        <input type="text" id="location" name="location"><br>
        <label for="jtype">Type:</label><br>
        <input type="checkbox" id="jtype" name="jtype"><br>


    </form>
    <div class="job-cards">
      <div v-for="job in jobs" v-bind:key="job.id" class="job-card">
        <div class="card-header">{{ job.employer_name }}</div>
        <div class="card-body">
          <h5 class="card-title">{{ job.job_title }}</h5>
          <p class="card-text">{{ job.job_description }}</p>
          <a v-bind:href="job.job_apply_link" class="btn btn-primary">Apply</a>
        </div>
        <div class="card-footer text-muted">{{ job.job_location }}</div>
      </div>
      <button v-on:click="populateJobsArray">Click here to populate array with jobs</button>
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
.job-cards {
  text-align: center;
}

.job-card {
  margin: 10px;
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  transition: 0.3s;
  border-radius: 5px;
  overflow: auto;
  display: inline-block;
  max-width: 600px;
  max-height: 600px;
}

.job-card:hover {
  box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2);
}

.card-header {
  background-color: #007bff;
  color: white;
  padding: 10px;
}

.card-footer {
  background-color: #f7f7f7;
  padding: 10px;
  text-align: center;
}
</style>