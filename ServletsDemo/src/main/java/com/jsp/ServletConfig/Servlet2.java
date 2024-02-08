package com.jsp.ServletConfig;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet2 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		ServletConfig config=getServletConfig();
		
		String url=	config.getInitParameter("url");
		System.out.println("url is "+url);
		
		String username=config.getInitParameter("username");
		System.out.println("username is "+username);
		
		String password=config.getInitParameter("password");
		System.out.println("password is "+password);
		
	}

}
