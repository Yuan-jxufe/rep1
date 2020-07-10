/**
 * 作者：袁群金
 * 时间：2020年7月8日 上午10:54:49
 * 类说明：
 */
package com.jxufe.job.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

import com.jxufe.job.da.dao.UserbeanDao;
import com.jxufe.job.db.entity.UserEntity;
@Service
public class UserService {
	@Autowired UserbeanDao userbeanDao;
	@Autowired HttpServletRequest request;
	public String UserLogin(int userId,String userPassword) {
		if (userbeanDao.selectBykey(userId)!=null) {
			if (userPassword.equals(userbeanDao.getPassword(userId))) {
			UserEntity user=userbeanDao.selectBykey(userId);	
			HttpSession session=request.getSession();
			session.setAttribute("user", user );//保持客户登入状态
				System.out.println("登入成功");
				return "OK";
			}
			return "密码错误";
		}
		
		return "用户不存在";
	}
	
	public int userRegister(UserEntity userEntity) {
		if (userbeanDao.selectBykey(userEntity.getUserid())==null) {//用户不存在
		return	userbeanDao.inserUser(userEntity);
		}
		return -1; //用户已存在
	}
	

}
