package com.jxufe.job.db.mapper;

import com.jxufe.job.db.entity.CompanyrequireEntity;
import com.jxufe.job.db.entity.CompanyrequireEntityKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CompanyrequireEntityMapper {
    @Delete({
        "delete from companyrequire",
        "where jobid = #{jobid,jdbcType=INTEGER}",
          "and C_id = #{cId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CompanyrequireEntityKey key);

    @Insert({
        "insert into companyrequire (jobid, C_id, ",
        "Number, Publishtime)",
        "values (#{jobid,jdbcType=INTEGER}, #{cId,jdbcType=INTEGER}, ",
        "#{number,jdbcType=INTEGER}, #{publishtime,jdbcType=DATE})"
    })
    int insert(CompanyrequireEntity record);

    @InsertProvider(type=CompanyrequireEntitySqlProvider.class, method="insertSelective")
    int insertSelective(CompanyrequireEntity record);

    @Select({
        "select",
        "jobid, C_id, Number, Publishtime",
        "from companyrequire",
        "where jobid = #{jobid,jdbcType=INTEGER}",
          "and C_id = #{cId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="jobid", property="jobid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_id", property="cId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Number", property="number", jdbcType=JdbcType.INTEGER),
        @Result(column="Publishtime", property="publishtime", jdbcType=JdbcType.DATE)
    })
    CompanyrequireEntity selectByPrimaryKey(CompanyrequireEntityKey key);

    @UpdateProvider(type=CompanyrequireEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CompanyrequireEntity record);

    @Update({
        "update companyrequire",
        "set Number = #{number,jdbcType=INTEGER},",
          "Publishtime = #{publishtime,jdbcType=DATE}",
        "where jobid = #{jobid,jdbcType=INTEGER}",
          "and C_id = #{cId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CompanyrequireEntity record);
}