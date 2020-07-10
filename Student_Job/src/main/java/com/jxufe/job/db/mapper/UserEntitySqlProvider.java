package com.jxufe.job.db.mapper;

import com.jxufe.job.db.entity.UserEntity;
import org.apache.ibatis.jdbc.SQL;

public class UserEntitySqlProvider {
    public String insertSelective(UserEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("j_user");
        
        if (record.getUserid() != null) {
            sql.VALUES("UserID", "#{userid,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            sql.VALUES("Username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getUserpassword() != null) {
            sql.VALUES("Userpassword", "#{userpassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUsersex() != null) {
            sql.VALUES("Usersex", "#{usersex,jdbcType=CHAR}");
        }
        
        if (record.getUsernation() != null) {
            sql.VALUES("UserNation", "#{usernation,jdbcType=VARCHAR}");
        }
        
        if (record.getUseruniversity() != null) {
            sql.VALUES("UserUniversity", "#{useruniversity,jdbcType=VARCHAR}");
        }
        
        if (record.getUsertelephone() != null) {
            sql.VALUES("UserTelephone", "#{usertelephone,jdbcType=VARCHAR}");
        }
        
        if (record.getUserbrithday() != null) {
            sql.VALUES("UserBrithday", "#{userbrithday,jdbcType=DATE}");
        }
        
        if (record.getUsermojar() != null) {
            sql.VALUES("UserMojar", "#{usermojar,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UserEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("j_user");
        
        if (record.getUsername() != null) {
            sql.SET("Username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getUserpassword() != null) {
            sql.SET("Userpassword = #{userpassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUsersex() != null) {
            sql.SET("Usersex = #{usersex,jdbcType=CHAR}");
        }
        
        if (record.getUsernation() != null) {
            sql.SET("UserNation = #{usernation,jdbcType=VARCHAR}");
        }
        
        if (record.getUseruniversity() != null) {
            sql.SET("UserUniversity = #{useruniversity,jdbcType=VARCHAR}");
        }
        
        if (record.getUsertelephone() != null) {
            sql.SET("UserTelephone = #{usertelephone,jdbcType=VARCHAR}");
        }
        
        if (record.getUserbrithday() != null) {
            sql.SET("UserBrithday = #{userbrithday,jdbcType=DATE}");
        }
        
        if (record.getUsermojar() != null) {
            sql.SET("UserMojar = #{usermojar,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("UserID = #{userid,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}