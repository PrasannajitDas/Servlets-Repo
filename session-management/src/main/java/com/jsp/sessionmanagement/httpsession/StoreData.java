package com.jsp.sessionmanagement.httpsession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/storedatainhttpsession")
public class StoreData extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession hs1=req.getSession(); 
		HttpSession hs2=req.getSession();
		
		hs1.setAttribute("id", 1);
		hs1.setAttribute("name", "mikul");
		hs1.setAttribute("age", 15);
		
		Integer id=(Integer) hs1.getAttribute("id");
		String name=(String) hs1.getAttribute("name");
		Integer age=(Integer)hs1.getAttribute("age");
		String dob=(String)hs1.getAttribute("dob");
		
		System.out.println(id+"\t"+name+"\t"+age+"\t"+dob);
		
		hs1.removeAttribute("id");
		System.out.println(hs1.getAttribute("id"));
		
		hs1.invalidate();
		
	}

}
