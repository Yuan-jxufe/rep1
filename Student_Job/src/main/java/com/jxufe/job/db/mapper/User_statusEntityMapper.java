package com.jxufe.job.db.mapper;

import com.jxufe.job.db.entity.User_statusEntity;
import com.jxufe.job.db.entity.User_statusEntityKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface User_statusEntityMapper {
    @Delete({
        "delete from user_status",
        "where C_id = #{cId,jdbcType=INTEGER}",
          "and UserID = #{userid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(User_statusEntityKey key);

    @Insert({
        "insert into user_status (C_id, UserID, ",
        "jobid, status)",
        "values (#{cId,jdbcType=INTEGER}, #{userid,jdbcType=INTEGER}, ",
        "#{jobid,jdbcType=INTEGER}, #{status,jdbcType=INTEGER})"
    })
    int insert(User_statusEntity record);

    @InsertProvider(type=User_statusEntitySqlProvider.class, method="insertSelective")
    int insertSelective(User_statusEntity record);

    @Select({
        "select",
        "C_id, UserID, jobid, status",
        "from user_status",
        "where C_id = #{cId,jdbcType=INTEGER}",
          "and UserID = #{userid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="C_id", property="cId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="UserID", property="userid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="jobid", property="jobid", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    User_statusEntity selectByPrimaryKey(User_statusEntityKey key);

    @UpdateProvider(type=User_statusEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User_statusEntity record);

    @Update({
        "update user_status",
        "set jobid = #{jobid,jdbcType=INTEGER},",
          "status = #{status,jdbcType=INTEGER}",
        "where C_id = #{cId,jdbcType=INTEGER}",
          "and UserID = #{userid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User_statusEntity record);
}