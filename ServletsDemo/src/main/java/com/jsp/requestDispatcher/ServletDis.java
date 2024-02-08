package com.jsp.requestDispatcher;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/request1")
public class ServletDis extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		RequestDispatcher rd=req.getRequestDispatcher("welcome.html");
		rd.forward(req, res);
		
	}

}
