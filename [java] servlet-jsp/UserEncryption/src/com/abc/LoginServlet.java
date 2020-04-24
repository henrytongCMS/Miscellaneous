package com.abc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Base64;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	final Base64.Encoder encoder = Base64.getEncoder();

    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter pw = response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		String name = request.getParameter("name");
		String base64_name = encoder.encodeToString(name.getBytes("UTF-8"));
		
		Cookie ck = new Cookie("bname", base64_name);
		response.addCookie(ck);

		pw.print("Successfully login!");
		pw.print("<br> Welcome, " + name);
		request.getSession().setAttribute("name", name);
		
		pw.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}