package com.abc;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Triangle2")
public class Triangle2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Triangle2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				pw.print("*");
			}
			pw.print("<br>");
		}
		pw.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
