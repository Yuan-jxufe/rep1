package com.jxufe.job.db.mapper;

import com.jxufe.job.db.entity.JobEntity;
import org.apache.ibatis.jdbc.SQL;

public class JobEntitySqlProvider {
    public String insertSelective(JobEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("job");
        
        if (record.getJobid() != null) {
            sql.VALUES("jobid", "#{jobid,jdbcType=INTEGER}");
        }
        
        if (record.getJobname() != null) {
            sql.VALUES("jobName", "#{jobname,jdbcType=VARCHAR}");
        }
        
        if (record.getJobdescribe() != null) {
            sql.VALUES("jobDescribe", "#{jobdescribe,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(JobEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("job");
        
        if (record.getJobname() != null) {
            sql.SET("jobName = #{jobname,jdbcType=VARCHAR}");
        }
        
        if (record.getJobdescribe() != null) {
            sql.SET("jobDescribe = #{jobdescribe,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("jobid = #{jobid,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}