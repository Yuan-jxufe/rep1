package com.jxufe.job.db.entity;

public class JobEntity {
    private Integer jobid;

    private String jobname;

    private String jobdescribe;

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getJobdescribe() {
        return jobdescribe;
    }

    public void setJobdescribe(String jobdescribe) {
        this.jobdescribe = jobdescribe == null ? null : jobdescribe.trim();
    }
}