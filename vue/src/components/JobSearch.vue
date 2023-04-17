<template>
  <div>
    <form>
      <br />
      <label for="jtitle">Job Title:</label><br />
      <input v-model="jobTitle" type="text" id="jtitle" name="jtitle" /><br />
      <label for="location">Location:</label><br />
      <input
        v-model="location"
        type="text"
        id="location"
        name="location"
      /><br />
      <p>Job Type:</p>
      <input
        v-model="jobType"
        type="checkbox"
        id="ftime"
        name="ftime"
        value="Full-time"
      />
      <label for="ftime">Full-time</label>
      <input
        v-model="jobType"
        type="checkbox"
        id="ptime"
        name="ptime"
        value="Part-time"
      />
      <label for="ptime">Part-time</label>
      <input
        v-model="jobType"
        type="checkbox"
        id="internship"
        name="internship"
        value="Internship"
      />
      <label for="internship">Internship</label>
      <input
        v-model="jobType"
        type="checkbox"
        id="contract"
        name="contract"
        value="Contractor"
      />
      <label for="contract">Contractor</label>
      <br>

      <label for="remote">Remote-Only:</label>
      <input v-model="remote" type="checkbox" id="remote" />
      <br />

        

    </form>
    <div class="job-cards">
      <button v-on:click="populateJobsArray">
        Click here to populate array with jobs
      </button>
      <br />
      <div v-for="job in jobs" v-bind:key="job.id" class="job-card">
        <div class="card-header">{{ job.employer_name }}</div>
        <div class="card-body">
          <h5 class="card-title">{{ job.job_title }}</h5>
          <p class="card-text">{{ job.job_description }}</p>
          <a
            v-bind:href="job.job_apply_link"
            target="_blank"
            class="btn btn-primary"
            >Apply</a
          >
        </div>
        <div class="card-footer text-muted">{{ job.job_location }}</div>
      </div>
    </div>
  </div>
</template>
  
<script>
import JobService from "../services/JobService.js";
export default {
  data() {
    return {
      jobs: [],
      jobTitle: "",
      location: "",
      jobType: [],
      remote: false,
    };
  },

  created() {
    // turned this off because we only get so many calls per month, can turn back on if we decide to go this way with design implemented button instead.
    //Can also create second account if we hit too many calls lol
    /* this.populateJobsArray(); */
  },

  methods: {
    populateJobsArray() {
      JobService.getJobs(
        this.jobTitle,
        this.location,
        this.jobType,
        this.remote
      ).then((response) => {
        this.jobs = response.data.data;
      });
    },
    sortBybullets(string){
        let array = string.split(" ");
        array.forEach(element => {
          if(element == "U+2022"){
            element = "\n" + element;
          }
          string = element + " ";
        });
        return string;
      }
  },
};
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