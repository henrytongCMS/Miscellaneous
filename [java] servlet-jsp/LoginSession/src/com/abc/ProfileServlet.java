package com.abc;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public ProfileServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter pw = response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		HttpSession session = request.getSession(false);
		
		if(session != null) {

			String name = (String)session.getAttribute("name");
			
			pw.print("<b>Welcome to Profile</b>");
			pw.print("<br>Welcome, " + name);
			
		} else {
			
			pw.print("Please login first!");
			request.getRequestDispatcher("login.html").include(request, response);
			
		}
		
		pw.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
