package com.abc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private final String USER_PATH = "C:/Users/HENRY/Desktop";

    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter pw = response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		if(login(name, password)) {
			
			if(isMultiLogin(name)) {
				
				pw.print("<html><body onload=\"alert('Multiple login!')\"></body></html>");
				
			} else {
				
				createLogin(name);
				pw.print("Successfully login!");
				pw.print("<br> Welcome, " + name);
				request.getSession().setAttribute("name", name);
				
			}
				
		} else {
				
			pw.print("Username or password error!");
			request.getRequestDispatcher("login.html").include(request, response);	
			
		}
		
		pw.close();
		
	}
	
	private boolean login(String name, String password) throws IOException {
		
		if(name != null && name.trim().length() != 0 && password != null)
			return Files.exists(Paths.get(USER_PATH, name)) && isCorrectPassword(name, password);
	
		return false;
		
	}
	
	private boolean isCorrectPassword(String name, String password) throws IOException {
		
		Path profile = Paths.get(USER_PATH, name).resolve("profile.txt");
		try(BufferedReader br = Files.newBufferedReader(profile)) {
			String [] data = br.readLine().split("\t");
			return data[1].equals(password);
		}
		
	}
	
	private boolean isMultiLogin(String name) throws IOException {
		
		Path profile = Paths.get(USER_PATH, name).resolve("login.txt");
		
		try(BufferedReader br = Files.newBufferedReader(profile)) {
			String [] data = br.readLine().split("\t");
			return data[0].equals("1");
		}
		
	}
	
	private void createLogin(String name) throws IOException {
		
		Path profile = Paths.get(USER_PATH, name).resolve("login.txt");
		
		try(BufferedWriter bw = Files.newBufferedWriter(profile)) {
			bw.write("1");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}