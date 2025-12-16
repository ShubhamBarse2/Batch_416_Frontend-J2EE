package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcwithStatement {
	public static void main(String[] args) throws Exception {

		JdbcwithStatement d = new JdbcwithStatement();
//		d.insertData();
		d.getAllRecord();

	}

	public void insertData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch416", "root", "root");
		Statement s = c.createStatement();
		int check = s.executeUpdate("insert into Student(id,name,city)values(22,'ram','goa');");

		if (check > 0) {
			System.out.println("Data is inserted...");
		} else {
			System.err.println("Data is NOT inserted...");
		}

		c.close();
	}

	public void getAllRecord() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch416", "root", "root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from Student");

		while (rs.next()) {
			System.out.println("Student ID : " + rs.getInt(1) + "  Student Name : " + rs.getString(2)
					+ " Student City :  " + rs.getString(3));
		}

		c.close();
	}
}