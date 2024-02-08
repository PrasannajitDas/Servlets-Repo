package com.jsp.requestDispatcher;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/requestt1")
public class LogServ3 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		RequestDispatcher rd1=req.getRequestDispatcher("Login5.html");
		rd1.forward(req, res);
		
	}
	

}
