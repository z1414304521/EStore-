package com.briup.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter("/user/*")
public class UserFilter implements Filter {
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest  req = (HttpServletRequest)request;
	    HttpSession  session  =req.getSession();
	    if(session.getAttribute("user")!=null){
	    	chain.doFilter(req, response);
	    }else{
	    	req.setAttribute("msg", "您还没有登录，请先进行登录");
	    	req.getRequestDispatcher("../login.jsp").forward(req, response);
	    }
		
	}
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
