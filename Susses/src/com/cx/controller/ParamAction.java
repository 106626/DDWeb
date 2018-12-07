package com.cx.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import com.cx.dao.IUserDao;
import com.cx.dao.impl.UserDaoimpl;
import com.cx.entity.User;

@WebServlet(urlPatterns="/test/param")
public class ParamAction extends HttpServlet{
	
		private static final long serialVersionUID = 2443671584233462363L;

		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取Url的参数.
		//http://localhost:8888/SuccessManager/test/param?name=tom&age=23&gender=f
		HttpSession session=req.getSession();	
			
		String name = req.getParameter("name");
		
		String password = req.getParameter("password");
		
		String phone=req.getParameter("phone");
		
		//需要将字符串转换成Integer类型
		
		User user=new User();
		
		user.setuName(name);
		
		user.setuPassword(password);
		
		user.setuPhone(phone);
		
		IUserDao userdao=new UserDaoimpl();
		
//		List<User> list=userdao.findAll();
//		
//		int a=0;
//		
//		for(User s:list){
//			if(user.getuName().equals(name)){
//				a=1;
//				String msg="用户名已存在";
//				req.setAttribute("msg", msg);
//				req.getRequestDispatcher("/index.jsp").forward(req,resp);
//			}
//		}
//			if(0==a){
//					userdao.save(user);
//					resp.sendRedirect("/Susses/views/user_log.jsp");
//				}
		userdao.save(user);
		resp.sendRedirect("/Susses/views/user_log.jsp");
	}
}
