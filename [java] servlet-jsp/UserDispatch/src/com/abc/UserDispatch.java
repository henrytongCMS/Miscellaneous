package com.abc;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserDispatch")
public class UserDispatch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserDispatch() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String gender = request.getParameter("gender");

		if(gender.equals("¨k")) 
			response.sendRedirect("https://shopping.pchome.com.tw/");
		else 
			response.sendRedirect("https://tw.buy.yahoo.com/");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}