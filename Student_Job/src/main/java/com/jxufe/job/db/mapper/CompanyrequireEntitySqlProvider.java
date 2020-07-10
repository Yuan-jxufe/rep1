package com.jxufe.job.db.mapper;

import com.jxufe.job.db.entity.CompanyrequireEntity;
import org.apache.ibatis.jdbc.SQL;

public class CompanyrequireEntitySqlProvider {
    public String insertSelective(CompanyrequireEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("companyrequire");
        
        if (record.getJobid() != null) {
            sql.VALUES("jobid", "#{jobid,jdbcType=INTEGER}");
        }
        
        if (record.getcId() != null) {
            sql.VALUES("C_id", "#{cId,jdbcType=INTEGER}");
        }
        
        if (record.getNumber() != null) {
            sql.VALUES("Number", "#{number,jdbcType=INTEGER}");
        }
        
        if (record.getPublishtime() != null) {
            sql.VALUES("Publishtime", "#{publishtime,jdbcType=DATE}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(CompanyrequireEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("companyrequire");
        
        if (record.getNumber() != null) {
            sql.SET("Number = #{number,jdbcType=INTEGER}");
        }
        
        if (record.getPublishtime() != null) {
            sql.SET("Publishtime = #{publishtime,jdbcType=DATE}");
        }
        
        sql.WHERE("jobid = #{jobid,jdbcType=INTEGER}");
        sql.WHERE("C_id = #{cId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}