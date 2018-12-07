package com.cx.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cx.dao.IAdmiDao;
import com.cx.dao.impl.AdmiDaoimpl;
import com.cx.entity.Admi;

@WebServlet(urlPatterns="/AdimLog")
public class AdmiLog extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		String name=req.getParameter("name");
		
		String password=req.getParameter("password");
		
		IAdmiDao s=new AdmiDaoimpl();
		
		List<Admi> list=s.findAll();
		
		int i=0;
		
		for(Admi admi:list){
			if(admi.getAdmiName().equals(name)&&(admi.getAdmiPassword().equals(password))){
				i=1;
				resp.sendRedirect("/Susses/views/04Admin.jsp");
			}
		}
		if(0==i){
				String msg="手机号或密码错误，请重新输入";
				req.setAttribute("msg", msg);
				req.getRequestDispatcher("/04AdminLogin.jsp").forward(req,resp);
			}
	}

}