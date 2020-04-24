package com.abc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/JDBC")
public class JDBC extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	// JDBC driver name and database URL
	static final String JDBC = "com.mysql.cj.jdbc.Driver";
	static final String DB = "jdbc:mysql://localhost:3306/world?useSSL=false&serverTimezone=CST";
	
	// Database credentials
	static final String USER = "root";
	static final String PSWD = "12345678";
       
    public JDBC() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection con = null;
		Statement stm = null;
		PrintWriter pw = response.getWriter();
		
		try {
			
			// Register JDBC driver
			Class.forName(JDBC);

			// Open a connection
			System.out.println("Connecting to database...");
			con = DriverManager.getConnection(DB, USER, PSWD);
			
			// Execute a query
			System.out.println("Creating statement...");
			stm = con.createStatement();
			
			ResultSet rs = stm.executeQuery("SELECT id, name, countrycode, district, population FROM city limit 10");
			
			pw.print("<table cellpadding='10' border='1'>");
			pw.print("<tr><th>id</th><th>name</th><th>country code</th><th>district</th><th>population</th></tr>");
			
			// Extract data from result set
			while(rs.next()) {
				
				// Retrieve by column name
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String countryCode = rs.getString("countryCode");
				String district = rs.getString("district");
				int population = rs.getInt("population");
				
				// Display values
				pw.print("<tr><td>"+id+"</td>");
				pw.print("<td>"+name+"</td>");
				pw.print("<td>"+countryCode+"</td>");
				pw.print("<td>"+district+"</td>");
				pw.print("<td>"+population+"</td></tr>");
				
			}
			
			pw.print("</table>");
			
			// Clean up environment
			rs.close();
			stm.close();
			con.close();
			pw.close();
			
		} catch(Exception e) {}
		
		System.out.println("Goodbye!");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
