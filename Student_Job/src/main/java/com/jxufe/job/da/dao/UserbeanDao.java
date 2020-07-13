/**
 * 作者：袁群金
 * 时间：2020年7月8日 上午11:05:32
 * 类说明：
 */
package com.jxufe.job.da.dao;

import java.util.List;

import com.jxufe.job.db.entity.UserEntity;
import com.jxufe.job.db.entity.User_statusEntity;

public interface UserbeanDao {

	public String getPassword(int userId);
	
	public UserEntity selectBykey(int id);
	
	public int inserUser(UserEntity userEntity);
	
	 public List<UserEntity> listUser();
	 
	 public int updateByUser(UserEntity userEntity);
	 
	 public int insertUserStatus(User_statusEntity user_statusEntity);
}

