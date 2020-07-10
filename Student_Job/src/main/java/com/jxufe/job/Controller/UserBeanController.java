/**
 * 作者：袁群金
 * 时间：2020年7月8日 下午5:40:24
 * 类说明：
 */
package com.jxufe.job.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jxufe.job.Service.UserService;
import com.jxufe.job.da.dao.UserbeanDao;
import com.jxufe.job.db.entity.UserEntity;

@Controller
public class UserBeanController {
@Autowired UserService service;

@ResponseBody
@RequestMapping("/userlogin")
	public String  UserLogin(String id,String password) {
	System.out.println(id+" "+password);
	System.out.println(service.UserLogin(Integer.parseInt(id),password));
	return service.UserLogin(Integer.parseInt(id),password);
		
	}

@ResponseBody
@RequestMapping("/userRegister")
	public int UserRegister(UserEntity userEntity ,String year,String month,String day) throws ParseException {
	String dateString = year+"-"+month+"-"+day;
	//System.out.println(userEntity);
	System.out.println(year +month+day);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date date = sdf.parse(dateString);
	userEntity.setUserbrithday(date);
	System.out.println(userEntity);
	return service.userRegister(userEntity);
}
}
