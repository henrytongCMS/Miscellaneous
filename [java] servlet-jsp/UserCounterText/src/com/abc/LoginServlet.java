package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("name");
		
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		 
		ServletContext ctx = getServletContext();
		int total = (Integer)ctx.getAttribute("totalusers");
		int current = (Integer)ctx.getAttribute("currentusers");

	    pw.print("<br>total users = " + total);
	    pw.print("<br>current users = " + current);
	    pw.print("<br><a href='LogoutServlet'>logout</a>");
		pw.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}