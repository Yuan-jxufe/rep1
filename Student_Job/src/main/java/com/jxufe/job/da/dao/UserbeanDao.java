/**
 * 作者：袁群金
 * 时间：2020年7月8日 上午11:05:32
 * 类说明：
 */
package com.jxufe.job.da.dao;

import com.jxufe.job.db.entity.UserEntity;

public interface UserbeanDao {

	public String getPassword(int userId);
	
	public UserEntity selectBykey(int id);
	
	public int inserUser(UserEntity userEntity);
}

