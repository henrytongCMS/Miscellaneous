package net.javaguides.usermanagement.web;

import java.io.*;
import java.nio.file.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private final String USER_PATH = "C:/Users/User/Desktop";

    public LogoutServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter pw = response.getWriter();
		
		HttpSession session = request.getSession(false);
		
		if(session != null) {
			
			tryLogout((String)session.getAttribute("name"));
			session.invalidate();
			pw.print("<html><body onload=\"alert('Logout successfully!')\"></body></html>");
			request.getRequestDispatcher("index.jsp").include(request, response);
			
		}
		
		pw.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void tryLogout(String name) throws IOException {
		
		Path profile = Paths.get(USER_PATH, name).resolve("login.txt");
		
		try(BufferedWriter bw = Files.newBufferedWriter(profile)) {
			bw.write("0");
		}
	}

}