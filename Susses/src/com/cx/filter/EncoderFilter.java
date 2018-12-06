package com.cx.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(filterName="Servlet3Filter",urlPatterns="/*",initParams={
		@WebInitParam(name = "encoder", value = "utf-8"),
		@WebInitParam(name = "contentype", value = "text/html;charset=utf-8")
})
public class EncoderFilter implements Filter{
	String encoder = null;
	
	String contentype = null;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain chain) throws IOException, ServletException {
		//强制转..
		HttpServletRequest req = (HttpServletRequest) arg0;
		
		HttpServletResponse resp = (HttpServletResponse) arg1;
		
		//设置请求和回应编码
		//req.setCharacterEncoding("utf-8");
		req.setCharacterEncoding(encoder);
		
		//resp.setContentType("text/html;charset=utf-8");
		resp.setContentType(contentype);
		
		//放行...
		chain.doFilter(req, resp);	
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		 encoder = config.getInitParameter("encoder");
		
		 contentype = config.getInitParameter("contentype");
		
	}

}