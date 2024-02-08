package com.jsp.Task;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/LogInFormValidate")
public class EmpLoginValidation extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/coaching", "root", "Das@2023#");
			PreparedStatement pst=con2.prepareStatement("select * from employee where email=? and password=?");
			pst.setString(1, email);
			pst.setInt(2, Integer.parseInt(password));
			
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				RequestDispatcher rd=req.getRequestDispatcher("welcome.html");
				rd.forward(req, res);
			}
			else {
				
				PrintWriter pw=res.getWriter();
				pw.print("<h1 style='color:red'>Invalid Credentials</h1>");
				RequestDispatcher rd=req.getRequestDispatcher("LoginForm.html");
				rd.include(req, res);
			}
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
