package com.abc;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserData")
public class UserData extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public UserData() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String name   = request.getParameter("name");
		String height = request.getParameter("height");
		String weight = request.getParameter("weight");
		
		String ww = getServletContext().getInitParameter("ww");
		String hw = getServletContext().getInitParameter("hw");
		
		int corr_sum = Integer.parseInt(height) * Integer.parseInt(hw) + Integer.parseInt(weight) * Integer.parseInt(ww);
		
		PrintWriter pw = response.getWriter();
		pw.print("姓名: " + name + "<br>");
		pw.print("身高: " + height + "<br>");
		pw.print("體重: " + weight + "<br>");
		pw.print("加權: " + corr_sum + "<br>");
		pw.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
