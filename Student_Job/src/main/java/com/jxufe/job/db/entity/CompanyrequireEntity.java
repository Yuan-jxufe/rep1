package com.jxufe.job.db.entity;

import java.util.Date;

public class CompanyrequireEntity extends CompanyrequireEntityKey {
    private Integer number;

    private Date publishtime;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

	@Override
	public String toString() {
		return "CompanyrequireEntity [number=" + number + ", publishtime=" + publishtime + ", toString()="
				+ super.toString() + "]";
	}
}