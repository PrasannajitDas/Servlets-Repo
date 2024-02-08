package com.jsp.servlet1;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fetchdata")
public class FetchDataFromFE extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("id"); // it will search for id in the name attribute of the Frontend.(html file)
											// //returns data
		String name = req.getParameter("name");// returns data
		String age = req.getParameter("age");// returns data

		String a = req.getParameter("Ramu");// returns null bcz Ramu key is not there in the name attribute of FrontEnd

		System.out.println(id + "\t" + name + "\t" + age + "\t" + a);
	}
}
