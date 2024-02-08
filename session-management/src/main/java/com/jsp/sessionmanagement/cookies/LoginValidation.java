package com.jsp.sessionmanagement.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/validate")
public class LoginValidation extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		if(email.equals("jspiders@gmail.com") && password.equals("12345")) {
			
		
			Cookie cookie1=new Cookie("email", email);
			Cookie cookie2=new Cookie("password",password);
			resp.addCookie(cookie1);
			resp.addCookie(cookie2);
			
			RequestDispatcher rd=req.getRequestDispatcher("welcome.html");
			rd.include(req, resp);
		
		}else {
		
			PrintWriter pw=resp.getWriter();
			pw.print("<h1 style='color:red'>Invalid Credentials</h1>");
			
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, resp);
		}
	}

}
