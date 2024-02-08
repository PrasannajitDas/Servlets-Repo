package com.jsp.requestDispatcher;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/validateagain")
public class LoginServlet1 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		RequestDispatcher rds=req.getRequestDispatcher("request2");
		rds.forward(req, res);
	}

}
