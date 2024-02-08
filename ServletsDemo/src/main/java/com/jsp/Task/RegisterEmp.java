package com.jsp.Task;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/employeeform")
public class RegisterEmp extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String age = req.getParameter("age");
		String mobileno = req.getParameter("mobileno");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/coaching", "root", "Das@2023#");
			PreparedStatement ps = con1
					.prepareStatement("insert into employee(id,name,email,password,age,mobileno) values(?,?,?,?,?,?)");

			ps.setInt(1, Integer.parseInt(id));
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setInt(4, Integer.parseInt(password));
			ps.setInt(5, Integer.parseInt(age));
			ps.setInt(6, Integer.parseInt(mobileno));
			ps.execute();

			PrintWriter pw = res.getWriter();
			pw.println("<h1>Data saved successfully</h1><br>");
		

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
