package com.jsp.requestDispatcher;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/request2")
public class LoginServlet2 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		System.out.println(email + "\t" + password);

	}

}
