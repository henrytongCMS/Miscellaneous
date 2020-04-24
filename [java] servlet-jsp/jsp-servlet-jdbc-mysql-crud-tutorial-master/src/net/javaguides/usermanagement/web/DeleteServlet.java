package net.javaguides.usermanagement.web;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.javaguides.usermanagement.dao.UserDAO;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;
	
	public void init() {
		userDAO = new UserDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		try {
			userDAO.deleteUser(Integer.parseInt(request.getParameter("id")));
		
		} catch (NumberFormatException | SQLException e) {
			e.printStackTrace();
			
		}
		
		response.sendRedirect("ListServlet");

	}

}