package com.jsp.Task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class CreateDBEmp {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/coaching", "root", "Das@2023#");
		java.sql.Statement st=con.createStatement();
		st.execute("create table Employee(id int,name varchar(20),email varchar(20),password int,age int,mobileno int)");
		System.out.println("Table Employee created");
	}
}
