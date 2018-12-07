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

@WebServlet("/views/04wwysh")
public class AdmiUSerAction extends HttpServlet{


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IUserService userservice=new UserServiceimpl();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uName=req.getParameter("uName");
		
//		String uPassword=req.getParameter("uPassword");
		
		List<User> userList = userservice.findAll(uName, null);
		
		req.getSession().setAttribute("userList", userList);
		
		req.getRequestDispatcher("/views/04wwysh.jsp").forward(req, resp);
	}
}
