/**
 * 作者：袁群金
 * 时间：2020年7月8日 上午11:07:15
 * 类说明：
 */
package com.jxufe.job.da.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxufe.job.da.bean.Userbean;
import com.jxufe.job.da.dao.UserbeanDao;
import com.jxufe.job.da.mapper.UserbeanMapper;
import com.jxufe.job.db.entity.UserEntity;

@Service
public class UserbeanDaoImpl implements UserbeanDao{
@Autowired UserbeanMapper userbeanMapper;
	
	public String getPassword(int userId) {
		UserEntity user=  userbeanMapper.selectByPrimaryKey(userId);
		
		return user.getUserpassword();
	}
	
	public UserEntity selectBykey(int id) {
		// TODO 自动生成的方法存根
		return userbeanMapper.selectByPrimaryKey(id);
	}

	@Override
	public int inserUser(UserEntity userEntity) {
		
		return userbeanMapper.insertSelective(userEntity);
	}
	
	
	
	
	

}
