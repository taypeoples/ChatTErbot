<template>
  <div>
      <div v-for="job in jobs" v-bind:key="job.id"> 
          
          <div>{{job.employer_name}}</div>
          <div>{{job.job_description}}</div>




      </div>


  </div>
</template>

<script>
import JobService from '../services/JobService.js'
export default {

data () {
    return {
        jobs: []
    }
},

created() {
    this.populateJobsArray();
   
},

methods: {
    populateJobsArray(){
        JobService.getJobs().then((response) => {
         this.jobs = (response.data.data);
        })
    }

}


}
</script>

<style scoped>

</style>