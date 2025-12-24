package com.tka;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String pass = req.getParameter("password");

		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch416", "root", "root");
			PreparedStatement ps = c.prepareStatement("select * from employee where email=? and password=?;");
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				out.println("Login Successfully ");
				System.out.println("Login Successfully ... !");

				HttpSession session = req.getSession();
				session.setAttribute("employeeid", rs.getInt(1));
				session.setAttribute("name", rs.getString(2));
				session.setAttribute("city", rs.getString(3));
				session.setAttribute("MobNO", rs.getLong(4));

				session.setAttribute("email", rs.getString(5));

				RequestDispatcher rd = req.getRequestDispatcher("profile.jsp");
				rd.include(req, resp);

			} else {
				System.out.println("Invalid Credentials ");
			}

		} catch (Exception e) {
			out.println(e.getMessage());
		}
	}
}
