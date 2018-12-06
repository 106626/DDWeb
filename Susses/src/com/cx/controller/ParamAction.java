package com.cx.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cx.dao.IUserDao;
import com.cx.dao.impl.UserDaoimpl;
import com.cx.entity.User;

@WebServlet(urlPatterns="/test/param")
public class ParamAction extends HttpServlet{
	
		private static final long serialVersionUID = 2443671584233462363L;

		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取Url的参数.
		//http://localhost:8888/SuccessManager/test/param?name=tom&age=23&gender=f
		String name = req.getParameter("name");
		
		String password = req.getParameter("password");
		
		String phone=req.getParameter("phone");
		
		//需要将字符串转换成Integer类型
		
		IUserDao userdao=new UserDaoimpl();
		
		User user=new User();
		
		user.setuName(name);
		
		user.setuPassword(password);
		
		user.setuPhone(phone);
		
		userdao.save(user);
		
	}
}
