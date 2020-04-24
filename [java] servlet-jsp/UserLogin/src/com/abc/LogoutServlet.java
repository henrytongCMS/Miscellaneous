package com.abc;

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
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private final String USER_PATH = "C:/Users/HENRY/Desktop";

    public LogoutServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter p = response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		HttpSession session = request.getSession(false);
		
		if(session != null) {
			
			createLogout((String)session.getAttribute("name"));
			
			session.invalidate();
			p.print("Successfully logout!");
		}
		
		p.close();
		
	}
	
	private void createLogout(String name) throws IOException {
		
		Path profile = Paths.get(USER_PATH, name).resolve("login.txt");
		
		try(BufferedWriter bw = Files.newBufferedWriter(profile)) {
			bw.write("0");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
