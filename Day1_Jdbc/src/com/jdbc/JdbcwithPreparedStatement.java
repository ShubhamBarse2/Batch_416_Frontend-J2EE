package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcwithPreparedStatement {

//	PreapredStatement Execution : 

	public static void main(String[] args) throws Exception {

		JdbcwithPreparedStatement d = new JdbcwithPreparedStatement();
//		d.insertData();
		d.getAllRecord();
	}

	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch416", "root", "root");
		PreparedStatement ps = c.prepareStatement("insert into Student(id,name,city)values(?,?,?);");
		ps.setInt(1, 23);
		ps.setString(2, "Rahul");
		ps.setString(3, "nsk");

		int check = ps.executeUpdate();
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
		PreparedStatement s = c.prepareStatement("select * from Student");
		ResultSet rs = s.executeQuery();

		while (rs.next()) {
			System.out.println("Student ID : " + rs.getInt(1) + "  Student Name : " + rs.getString(2)
					+ " Student City :  " + rs.getString(3));
		}

		c.close();
	}

}
