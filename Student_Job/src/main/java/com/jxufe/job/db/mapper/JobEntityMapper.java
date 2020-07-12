package com.jxufe.job.db.mapper;

import com.jxufe.job.db.entity.JobEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface JobEntityMapper {
    @Delete({
        "delete from job",
        "where jobid = #{jobid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer jobid);
    
    @Options(keyColumn = "jobid",keyProperty = "jobid",useGeneratedKeys = true)
    @Insert({
        "insert into job ( jobName, ",
        "jobDescribe)",
        "values ( #{jobname,jdbcType=VARCHAR}, ",
        "#{jobdescribe,jdbcType=VARCHAR})"
    })
    int insert(JobEntity record);

    @InsertProvider(type=JobEntitySqlProvider.class, method="insertSelective")
    int insertSelective(JobEntity record);

    @Select({
        "select",
        "jobid, jobName, jobDescribe",
        "from job",
        "where jobid = #{jobid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="jobid", property="jobid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="jobName", property="jobname", jdbcType=JdbcType.VARCHAR),
        @Result(column="jobDescribe", property="jobdescribe", jdbcType=JdbcType.VARCHAR)
    })
    JobEntity selectByPrimaryKey(Integer jobid);

    @UpdateProvider(type=JobEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(JobEntity record);

    @Update({
        "update job",
        "set jobName = #{jobname,jdbcType=VARCHAR},",
          "jobDescribe = #{jobdescribe,jdbcType=VARCHAR}",
        "where jobid = #{jobid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(JobEntity record);
}