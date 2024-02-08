package com.jsp.sessionmanagement.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/savecookies")
public class SaveCookies extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie1=new Cookie("name" ,"Prasannajit");
//		cookie1.setMaxAge(10);
		Cookie cookie2=new Cookie("age","22");
//		cookie2.setMaxAge(10);
		resp.addCookie(cookie1);
		resp.addCookie(cookie2);
	}
}
