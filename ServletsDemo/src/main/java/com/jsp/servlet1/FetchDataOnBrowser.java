package com.jsp.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fetchdataonbrowser")
public class FetchDataOnBrowser extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String firstname=req.getParameter("firstName");
		String lastname=req.getParameter("lastName");
		String age=req.getParameter("age");
		
		PrintWriter pw=res.getWriter();
		pw.print("Welcome to the Browser "+firstname+" "+lastname);
		
	}
	

}
