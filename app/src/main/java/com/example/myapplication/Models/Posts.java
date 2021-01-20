package com.example.myapplication.Models;

import com.google.gson.annotations.SerializedName;

public class Posts {
    String JobsTitle;
    String salary;
    String details;

    public Posts(String Jobstitle, String salary, String details) {
        this.JobsTitle = JobsTitle;
        this.salary = salary;
        this.details = details;

    }

    public Posts() {
    }

    public String getJobsTitle() {
        return JobsTitle;
    }

    public void setJobsTitle(String jobsTitle) {
        this.JobsTitle = jobsTitle;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
