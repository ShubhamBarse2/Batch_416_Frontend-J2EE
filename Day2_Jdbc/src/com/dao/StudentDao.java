package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {

	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch416", "root", "root");
		PreparedStatement ps = c.prepareStatement("insert into Student(id,name,city)values(?,?,?);");
		ps.setInt(1, 24);
		ps.setString(2, "sahil");
		ps.setString(3, "bhopal");

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

	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch416", "root", "root");
		PreparedStatement ps = c.prepareStatement("delete from Student where id = ?;");
		ps.setInt(1, 23);

		int check = ps.executeUpdate();
		if (check > 0) {
			System.out.println("Data is deleted...");
		} else {
			System.err.println("Data is NOT deleted...");
		}

		c.close();

	}

}
