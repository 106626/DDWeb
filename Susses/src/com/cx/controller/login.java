package com.cx.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cx.dao.IUserDao;
import com.cx.dao.impl.UserDaoimpl;
import com.cx.entity.User;
import com.cx.service.IUserService;
import com.cx.service.impl.UserServiceimpl;

@WebServlet(urlPatterns="/login")
public class login extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		String name=req.getParameter("name");
		
		String password=req.getParameter("password");
		
		IUserDao s=new UserDaoimpl();
		
		List<User> list=s.findAll();
		
		int i=0;
		
		for(User user:list){
			if(user.getuName().equals(name)&&(user.getuPassword().equals(password))){
				i=1;
				resp.sendRedirect("/Susses/views/user_index.jsp");
			}
		}
		if(0==i){
				String msg="手机号或密码错误，请重新输入";
				req.setAttribute("msg", msg);
				req.getRequestDispatcher("/views/user_log.jsp").forward(req,resp);
			}
	}

}
