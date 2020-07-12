package com.jxufe.job.db.entity;

public class CompanyrequireEntityKey {
    private Integer jobid;

    private Integer cId;

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

	@Override
	public String toString() {
		return "CompanyrequireEntityKey [jobid=" + jobid + ", cId=" + cId + "]";
	}
}