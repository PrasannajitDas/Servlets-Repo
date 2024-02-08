package com.jsp.requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/validate")
public class LoginValidation extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		// Manually checking validations here-->
		if (email.equals("prasannajit@cpg.com") && password.equals("12345")) {
			RequestDispatcher rd1 = req.getRequestDispatcher("welcome.html");
			rd1.forward(req, res);
		} else {
			PrintWriter pw = res.getWriter();
			pw.print("<h1>Invalid Credentials</h1>");

			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, res);
		}
	}

}
