/**
 * 作者：袁群金
 * 时间：2020年7月8日 下午6:15:40
 * 类说明：
 */
package com.jxufe.job.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/")	
	public String home() {
		System.out.println("!!!home !!!!");
		return "home";
	}	
	
@RequestMapping("/login")	
public String userLogin() {
	System.out.println("!!!登入界面 !!!!");
	return "denglu";
}

@RequestMapping("/register")
public String userRegister() {
	System.out.println("!!!注册!!!!");
	return"zhuce";
}
@RequestMapping("/change")
public String userchange() {
	System.out.println("!!!修改!!!!");
	return"changeUser";
}
@RequestMapping("/table")
public String table() {
	return  "table";
}

@RequestMapping("/companyLoginpage")
public String companyLogin() {
	return"CompanyLogin";
}

@RequestMapping("/publishPage")
public String publishpage() {
	return "publish";
}
}
