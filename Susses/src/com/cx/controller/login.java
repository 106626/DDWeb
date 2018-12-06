package com.cx.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cx.entity.User;
import com.cx.service.IUserService;
import com.cx.service.impl.UserServiceimpl;

@WebServlet(urlPatterns="/login")
public class login extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IUserService service=new UserServiceimpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		String name=req.getParameter("name");
		
		String password=req.getParameter("password");
		
		List<User> list=service.findAll(name,password);
	}

}
