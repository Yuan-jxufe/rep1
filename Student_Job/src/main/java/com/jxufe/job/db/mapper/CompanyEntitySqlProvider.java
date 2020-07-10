package com.jxufe.job.db.mapper;

import com.jxufe.job.db.entity.CompanyEntity;
import org.apache.ibatis.jdbc.SQL;

public class CompanyEntitySqlProvider {
    public String insertSelective(CompanyEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("company");
        
        if (record.getcId() != null) {
            sql.VALUES("C_id", "#{cId,jdbcType=INTEGER}");
        }
        
        if (record.getCname() != null) {
            sql.VALUES("Cname", "#{cname,jdbcType=VARCHAR}");
        }
        
        if (record.getCdescription() != null) {
            sql.VALUES("CDescription", "#{cdescription,jdbcType=VARCHAR}");
        }
        
        if (record.getClocation() != null) {
            sql.VALUES("CLocation", "#{clocation,jdbcType=VARCHAR}");
        }
        
        if (record.getCpassword() != null) {
            sql.VALUES("Cpassword", "#{cpassword,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(CompanyEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("company");
        
        if (record.getCname() != null) {
            sql.SET("Cname = #{cname,jdbcType=VARCHAR}");
        }
        
        if (record.getCdescription() != null) {
            sql.SET("CDescription = #{cdescription,jdbcType=VARCHAR}");
        }
        
        if (record.getClocation() != null) {
            sql.SET("CLocation = #{clocation,jdbcType=VARCHAR}");
        }
        
        if (record.getCpassword() != null) {
            sql.SET("Cpassword = #{cpassword,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("C_id = #{cId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}