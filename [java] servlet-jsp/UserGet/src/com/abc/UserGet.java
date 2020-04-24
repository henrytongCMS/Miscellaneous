package com.abc;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserGet")
public class UserGet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public UserGet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String fruit   = request.getParameter("fruit");

		Enumeration<String> f = getServletContext().getInitParameterNames();
		
		PrintWriter pw = response.getWriter();
		
		while(f.hasMoreElements()) {
			
			String s = f.nextElement();
			
			if(fruit.equals(s)) {
				pw.print("Fruit: " + fruit + "<br>");
				pw.print("Price: " + getServletContext().getInitParameter(s) + "<br>");
			}	
			
		}

		pw.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
