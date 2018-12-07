package com.cx.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cx.service.IUserService;
import com.cx.service.impl.UserServiceimpl;

@WebServlet(urlPatterns="/userdel")
public class AdmiDel extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3643967224242906785L;


	private  IUserService ord=new UserServiceimpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		String id = req.getParameter("id");
	
		Integer s=Integer.valueOf(id);
			
//		ord.delById(s);
		
		req.getRequestDispatcher("/views/user_order").forward(req, resp);
	}
}
