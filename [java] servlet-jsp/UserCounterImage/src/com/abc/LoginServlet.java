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
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("name");
		
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		 
		ServletContext ctx = getServletContext();

		int u = (Integer)ctx.getAttribute("u");
		int t = (Integer)ctx.getAttribute("t");
		int h = (Integer)ctx.getAttribute("h");

	    pw.print("您是第 " + "<img src='img/" + h + ".png'>" + "<img src='img/" + t + ".png'>" + "<img src='img/" + u + ".png'>" + " 位訪客");
	    pw.print("<br><a href='LogoutServlet'>logout</a>");
		pw.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}