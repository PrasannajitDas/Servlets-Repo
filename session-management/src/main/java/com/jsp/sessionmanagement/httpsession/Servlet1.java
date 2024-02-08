package com.jsp.sessionmanagement.httpsession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/session")
public class Servlet1 extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession hs1=req.getSession();
		HttpSession hs2=req.getSession();
		
		hs2.setAttribute("name", "ram");
		hs2.setAttribute("age", 23);
		hs2.setAttribute("id", 101);
		
		RequestDispatcher rd=req.getRequestDispatcher("/session2");
		rd.include(req, resp);
	}

}
