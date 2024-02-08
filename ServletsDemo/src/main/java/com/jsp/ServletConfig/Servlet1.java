package com.jsp.ServletConfig;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet1 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		ServletConfig config1=getServletConfig();
		
		System.out.println("server name : "+config1.getInitParameter("servername"));
		
		String version=config1.getInitParameter("version");
		System.out.println("Version is : "+version);
		
		System.out.println("Host is : "+config1.getInitParameter("host"));
		
	}

}
