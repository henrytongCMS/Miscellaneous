package net.javaguides.usermanagement.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FailServlet")
public class FailServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public FailServlet() {
        super();
    }

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter p = response.getWriter();
		
		List<String> errors = (List<String>) request.getAttribute("errors");
		
		for(String error:errors) {
			p.print("<body onload=\"alert(" + error + ")\"></body>");
		}
		
		p.print("<body onload=\"alert('Registration failed!')\"></body>");
		request.getRequestDispatcher("register.jsp").include(request, response);
		
		p.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}