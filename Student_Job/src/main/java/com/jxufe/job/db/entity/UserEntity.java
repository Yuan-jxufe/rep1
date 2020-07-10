package com.jxufe.job.db.entity;

import java.util.Date;

public class UserEntity {
    private Integer userid;

    private String username;

    private String userpassword;

    private String usersex;

    private String usernation;

    private String useruniversity;

    private String usertelephone;

    private Date userbrithday;

    private String usermojar;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex == null ? null : usersex.trim();
    }

    public String getUsernation() {
        return usernation;
    }

    public void setUsernation(String usernation) {
        this.usernation = usernation == null ? null : usernation.trim();
    }

    public String getUseruniversity() {
        return useruniversity;
    }

    public void setUseruniversity(String useruniversity) {
        this.useruniversity = useruniversity == null ? null : useruniversity.trim();
    }

    public String getUsertelephone() {
        return usertelephone;
    }

    public void setUsertelephone(String usertelephone) {
        this.usertelephone = usertelephone == null ? null : usertelephone.trim();
    }

    public Date getUserbrithday() {
        return userbrithday;
    }

    public void setUserbrithday(Date userbrithday) {
        this.userbrithday = userbrithday;
    }

    public String getUsermojar() {
        return usermojar;
    }

    public void setUsermojar(String usermojar) {
        this.usermojar = usermojar == null ? null : usermojar.trim();
    }

	@Override
	public String toString() {
		return "UserEntity [userid=" + userid + ", username=" + username + ", userpassword=" + userpassword
				+ ", usersex=" + usersex + ", usernation=" + usernation + ", useruniversity=" + useruniversity
				+ ", usertelephone=" + usertelephone + ", userbrithday=" + userbrithday + ", usermojar=" + usermojar
				+ "]";
	}
}