package com.cx.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cx.service.IFoodService;
import com.cx.service.impl.FoodServiceimpl;

@WebServlet(urlPatterns="/del")
public class DelAction extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3643967224242906785L;


	private  IFoodService foodService = new FoodServiceimpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		String id = req.getParameter("f_id");
		Integer f_id = Integer.valueOf(id);
		
		foodService.delById(f_id);
		
		req.getRequestDispatcher("/index").forward(req, resp);
	}
}
