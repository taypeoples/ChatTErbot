<template>
  <div>
  <div class="job-search-form">
    <div class="left">
      <div class="overlay">
        <h1>Job Search</h1>
        <span>
          <p>Find your dream job today</p>
        </span>
      </div>
    </div>
    <div class="right">
      <h5>Search for Jobs</h5>
      <form>
        <div>
          <label for="jtitle" class="text-center"></label><br />
          <input v-model="jobTitle" type="text" id="jtitle" name="jtitle" placeholder="Job Title" />
        </div>
        <div>
          <label for="location" class="text-center"></label><br />
          <input v-model="location" type="text" id="location" name="location" placeholder="Location" />
        </div>
        <div>
          <p>Job Type:</p>
          <div class="checkbox-group">
            <input v-model="jobType" type="checkbox" id="ftime" name="ftime" value="Full-time" />
            <label for="ftime">Full-time</label>
            <input v-model="jobType" type="checkbox" id="ptime" name="ptime" value="Part-time" />
            <label for="ptime">Part-time</label>
            <input v-model="jobType" type="checkbox" id="internship" name="internship" value="Internship" />
            <label for="internship">Internship</label>
            <input v-model="jobType" type="checkbox" id="contract" name="contract" value="Contractor" />
            <label for="contract">Contractor</label>
          </div>
        </div>
        <div>
          <label for="remote">Remote-Only:</label>
          <input v-model="remote" type="checkbox" id="remote" />
        </div>
      </form>
    </div>
    <div class="right2">
      <button v-on:click="populateJobsArray">
        Click here to view jobs
      </button>
    </div>
  </div>
  <br />
  <div class="job-cards-container">
      <div v-for="job in jobs" :key="job.id" class="job-card">
        <div class="card-header">{{ job.employer_name }}</div>
        <div class="card-body">
          <h5 class="card-title">{{ job.job_title }}</h5>
          <pre class="card-text">{{ job.job_description }}</pre>
          <a :href="job.job_apply_link" target="_blank" class="btn btn-primary">Apply</a>
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
      updatedDescription:"",
    };
  },

  created() {
    // turned this off because we only get so many calls per month, can turn back on if we decide to go this way with design implemented button instead.
    //Can also create second account if we hit too many calls lol
    /* this.populateJobsArray(); */
  },
  computed: {
    moddedDescription(){
      let string = this.job.job_description;
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

pre{
  white-space: pre-wrap;
  padding: 10px;

}

.card-header {
  background-color: #6a87cc;
  color: white;
  padding: 10px;
}

.card-footer {
  background-color: #f7f7f7;
  padding: 10px;
  text-align: center;
}

 /* Form Styling */
body {
  background-image: linear-gradient(135deg, #FAB2FF 10%, #1904E5 100%);
  background-size: cover;
  background-repeat: no-repeat;
  background-attachment: fixed;
  font-family: "Open Sans", sans-serif;
  color: #333333;
}

.right2 {
  display: flex;
  justify-content: flex-end;
  align-items: flex-end;
  margin-top: auto;
  padding: 30px 30px;
}

button {
  background-color:#3b5998;
  color: white;
  padding: 10px 20px;
  border: none;
  border-radius: 10px;
  cursor: pointer;
}

button:hover {
  background-color: #237aec;
  color: white;
  padding: 10px 20px;
  border: none;
  border-radius: 10px;
  cursor: pointer;
}

.job-search-form {
  padding-top: 30px;
  margin: 0 auto;
  width: 30%;
  background: #ffffffd0;
  border-radius: 10px;
  overflow: hidden;
  display: flex;
  flex: 1 1 100%;
  align-items: stretch;
  justify-content: space-between;
  box-shadow: 0 0 20px 6px #2759c585;
  
}

.job-search-form .overlay {
  padding: 30px;
  width: 100%;
  height: 100%;
  overflow: hidden;
  box-sizing: border-box;
}
.job-search-form .left {
  width: 0px;
}


@media (max-width: 980px) {
  .job-search-form {
    flex-flow: wrap;
    text-align: center;
    align-content: center;
    align-items: center;
  
  }
}

.job-search-form div {
  height: auto;
}

.job-search-form .left {
  color: #FFFFFF;
  background-size: 100%;
  background-repeat: no-repeat;
  background-image: url('/pictures/Capture3.PNG');
  
}

.job-search-form .left .overlay {
  padding: 30px;
  width: 100%;
  height: 100%;
  overflow: hidden;
  box-sizing: border-box;
}

.job-search-form .left .overlay h1 {
  font-size: 8vmax;
  line-height: 1;
  font-weight: 800;
  margin-top: 40px;
  margin-bottom: 20px;
}

.job-search-form .left .overlay span p {
  margin-top: 30px;
  font-weight: 900;
}


.job-search-form .left .overlay span a {
  background: #3b5998;
  color: #FFFFFF;
  margin-top: 10px;
  padding: 14px 50px;
  border-radius: 100px;
  display: inline-block;
  box-shadow: 0 3px 6px 1px #042d4657;
}

.job-search-form .left .overlay span a:last-child {
  background: #1dcaff;
  margin-left: 30px;
}

.job-search-form .right {
  padding: 20px;
  overflow: hidden;
}

@media (max-width: 480px) {
  .job-search-form{
    height: 40%;
  }
  .job-search-form .right {
    width: 100%;
    
  }
}

  .job-search-form .right h5 {
  font-size: 5vmax;
  line-height: 1;
  background-image: url('/pictures/Capture3.PNG');
  background-clip: text;
  -webkit-background-clip: text;
  color: transparent;
  margin-top: 30px;
  margin-bottom: 30px;
}


.job-search-form .right p {
  font-size: 14px;
  color: #B0B3B9;
}

.job-search-form .right .inputs {
  overflow: hidden;
}

.job-search-form .right input[type="text"] {
  border: none;
  outline: none;
  border-bottom: 2px solid #B0B3B9;
  width: 100%;
  padding: 10px 0;
  font-size: 18px;
  margin-bottom: 30px;
}
.job-search-form .right input[type="submit"] {
  background: #3b5998;
  color: #FFFFFF;
  border: none;
  outline: none;
  padding: 10px 20px;
  border-radius: 50px;
  font-size: 18px;
  cursor: pointer;
  box-shadow: 0 3px 6px
}

</style>