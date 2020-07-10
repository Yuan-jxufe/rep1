package com.jxufe.job.db.entity;

public class CompanyEntity {
    private Integer cId;

    private String cname;

    private String cdescription;

    private String clocation;

    private String cpassword;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCdescription() {
        return cdescription;
    }

    public void setCdescription(String cdescription) {
        this.cdescription = cdescription == null ? null : cdescription.trim();
    }

    public String getClocation() {
        return clocation;
    }

    public void setClocation(String clocation) {
        this.clocation = clocation == null ? null : clocation.trim();
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword == null ? null : cpassword.trim();
    }
}