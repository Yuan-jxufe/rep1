package com.jxufe.job.db.mapper;

import com.jxufe.job.db.entity.UserEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UserEntityMapper {
    @Delete({
        "delete from j_user",
        "where UserID = #{userid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userid);

    @Insert({
        "insert into j_user (UserID, Username, ",
        "Userpassword, Usersex, ",
        "UserNation, UserUniversity, ",
        "UserTelephone, UserBrithday, ",
        "UserMojar)",
        "values (#{userid,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
        "#{userpassword,jdbcType=VARCHAR}, #{usersex,jdbcType=CHAR}, ",
        "#{usernation,jdbcType=VARCHAR}, #{useruniversity,jdbcType=VARCHAR}, ",
        "#{usertelephone,jdbcType=VARCHAR}, #{userbrithday,jdbcType=DATE}, ",
        "#{usermojar,jdbcType=VARCHAR})"
    })
    int insert(UserEntity record);

    @InsertProvider(type=UserEntitySqlProvider.class, method="insertSelective")
    int insertSelective(UserEntity record);

    @Select({
        "select",
        "UserID, Username, Userpassword, Usersex, UserNation, UserUniversity, UserTelephone, ",
        "UserBrithday, UserMojar",
        "from j_user",
        "where UserID = #{userid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="UserID", property="userid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="Userpassword", property="userpassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="Usersex", property="usersex", jdbcType=JdbcType.CHAR),
        @Result(column="UserNation", property="usernation", jdbcType=JdbcType.VARCHAR),
        @Result(column="UserUniversity", property="useruniversity", jdbcType=JdbcType.VARCHAR),
        @Result(column="UserTelephone", property="usertelephone", jdbcType=JdbcType.VARCHAR),
        @Result(column="UserBrithday", property="userbrithday", jdbcType=JdbcType.DATE),
        @Result(column="UserMojar", property="usermojar", jdbcType=JdbcType.VARCHAR)
    })
    UserEntity selectByPrimaryKey(Integer userid);

    @UpdateProvider(type=UserEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserEntity record);

    @Update({
        "update j_user",
        "set Username = #{username,jdbcType=VARCHAR},",
          "Userpassword = #{userpassword,jdbcType=VARCHAR},",
          "Usersex = #{usersex,jdbcType=CHAR},",
          "UserNation = #{usernation,jdbcType=VARCHAR},",
          "UserUniversity = #{useruniversity,jdbcType=VARCHAR},",
          "UserTelephone = #{usertelephone,jdbcType=VARCHAR},",
          "UserBrithday = #{userbrithday,jdbcType=DATE},",
          "UserMojar = #{usermojar,jdbcType=VARCHAR}",
        "where UserID = #{userid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserEntity record);
}