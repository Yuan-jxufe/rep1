package com.jxufe.job.db.entity;

public class User_statusEntity extends User_statusEntityKey {
    private Integer jobid;

    private Integer status;

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}