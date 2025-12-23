package com.tka;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("employee_name");

		String id = request.getParameter("employee_id");
		int empId = Integer.parseInt(id);

		String city = request.getParameter("city");

		String mobNo = request.getParameter("mobile_no");
		long mobNum = Long.parseLong(mobNo);

		String email = request.getParameter("email");
		String pass = request.getParameter("password");

//		System.out.println(name);
//		System.out.println(empId);
//		System.out.println(city);
//		System.out.println(mobNum);
//		System.out.println(email);
//		System.out.println(pass);

		PrintWriter out = response.getWriter();
//		out.println("<h1 style=color:green>" + name + "</h1>");
//		out.println(empId);
//		out.println(city);
//		out.println(mobNum);
//		out.println(email);
//		out.println(pass);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch416", "root", "root");
			PreparedStatement ps = c.prepareStatement(
					"INSERT INTO employee(employee_id, employee_name, city, mobile_no, email, password)values(?,?,?,?,?,?);");
			ps.setInt(1, empId);
			ps.setString(2, name);
			ps.setString(3, city);
			ps.setLong(4, mobNum);
			ps.setString(5, email);
			ps.setString(6, pass);

			int check = ps.executeUpdate();

			if (check > 0) {
//				out.println("<h1 style = color:green>" + "SuccessFully Register .... !" + "</h1>");

				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.forward(request, response);

			} else {
				out.println("<h1 style = color:red>" + "Not Register .... !" + "</h1>");
			}

		} catch (Exception e) {
			e.getMessage();
			out.println("<h1 style = color:red>" + e.getMessage() + "</h1>");

		}

	}

}
