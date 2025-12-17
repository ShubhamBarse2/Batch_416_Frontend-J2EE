package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.entities.Student;

public class StudentDao {

	public void insertData(Student s) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch416", "root", "root");
		PreparedStatement ps = c.prepareStatement("insert into Student(id,name,city)values(?,?,?);");
		ps.setInt(1, s.getId());
		ps.setString(2, s.getName());
		ps.setString(3, s.getCity());

		int check = ps.executeUpdate();
		if (check > 0) {
			System.out.println("Data is inserted...");
		} else {
			System.err.println("Data is NOT inserted...");
		}

		c.close();
	}

}
