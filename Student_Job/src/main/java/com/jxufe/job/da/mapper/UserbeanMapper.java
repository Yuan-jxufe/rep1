/**
 * 作者：袁群金
 * 时间：2020年7月8日 上午11:13:36
 * 类说明：
 */
package com.jxufe.job.da.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.jxufe.job.db.entity.CompanyEntity;
import com.jxufe.job.db.entity.UserEntity;
import com.jxufe.job.db.mapper.UserEntityMapper;
@Mapper
public interface UserbeanMapper extends UserEntityMapper{

	  @Select("select * from J_user")
	  public List<UserEntity> listUser();
	  
	  
	  @Select("select * from company")
	  public List<CompanyEntity> listcompany();
	  
	  
}
