package com.jxufe.job.db.mapper;

import com.jxufe.job.db.entity.CompanyEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CompanyEntityMapper {
    @Delete({
        "delete from company",
        "where C_id = #{cId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer cId);

    @Insert({
        "insert into company (C_id, Cname, ",
        "CDescription, CLocation, ",
        "Cpassword)",
        "values (#{cId,jdbcType=INTEGER}, #{cname,jdbcType=VARCHAR}, ",
        "#{cdescription,jdbcType=VARCHAR}, #{clocation,jdbcType=VARCHAR}, ",
        "#{cpassword,jdbcType=VARCHAR})"
    })
    int insert(CompanyEntity record);

    @InsertProvider(type=CompanyEntitySqlProvider.class, method="insertSelective")
    int insertSelective(CompanyEntity record);

    @Select({
        "select",
        "C_id, Cname, CDescription, CLocation, Cpassword",
        "from company",
        "where C_id = #{cId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="C_id", property="cId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Cname", property="cname", jdbcType=JdbcType.VARCHAR),
        @Result(column="CDescription", property="cdescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="CLocation", property="clocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="Cpassword", property="cpassword", jdbcType=JdbcType.VARCHAR)
    })
    CompanyEntity selectByPrimaryKey(Integer cId);

    @UpdateProvider(type=CompanyEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CompanyEntity record);

    @Update({
        "update company",
        "set Cname = #{cname,jdbcType=VARCHAR},",
          "CDescription = #{cdescription,jdbcType=VARCHAR},",
          "CLocation = #{clocation,jdbcType=VARCHAR},",
          "Cpassword = #{cpassword,jdbcType=VARCHAR}",
        "where C_id = #{cId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CompanyEntity record);
}