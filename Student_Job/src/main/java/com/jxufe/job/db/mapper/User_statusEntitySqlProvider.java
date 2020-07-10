package com.jxufe.job.db.mapper;

import com.jxufe.job.db.entity.User_statusEntity;
import org.apache.ibatis.jdbc.SQL;

public class User_statusEntitySqlProvider {
    public String insertSelective(User_statusEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user_status");
        
        if (record.getcId() != null) {
            sql.VALUES("C_id", "#{cId,jdbcType=INTEGER}");
        }
        
        if (record.getUserid() != null) {
            sql.VALUES("UserID", "#{userid,jdbcType=INTEGER}");
        }
        
        if (record.getJobid() != null) {
            sql.VALUES("jobid", "#{jobid,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(User_statusEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("user_status");
        
        if (record.getJobid() != null) {
            sql.SET("jobid = #{jobid,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        sql.WHERE("C_id = #{cId,jdbcType=INTEGER}");
        sql.WHERE("UserID = #{userid,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}