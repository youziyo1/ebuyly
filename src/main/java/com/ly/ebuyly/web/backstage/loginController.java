package com.ly.ebuyly.web.backstage;import com.ly.ebuyly.dao.AdminDao;import org.springframework.stereotype.Controller;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RequestMethod;import javax.servlet.http.HttpServletRequest;@Controllerpublic class loginController {	AdminDao adminDao=new AdminDao();	@RequestMapping(value = "/backstage/login", method = RequestMethod.POST)	public String hello(String username,String password) {	//判断是否登录成功		if(adminDao.login(username, password)){			return "/jsp/backstage/main.jsp";		}else{			return "/jsp/backstage/login.jsp";		}	}}