package net.javaguides.usermanagement.web;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private final String USER_PATH = "C:/Users/User/Desktop";

    public RegisterServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String password2 = request.getParameter("password2");
		
		List<String> errors = new ArrayList<String>();
		
		if(name.isEmpty())
			errors.add("Name required!");
		
		if(email.isEmpty())
			errors.add("Email required!");
		
		if(password.isEmpty() || !password.equals(password2))
			errors.add("Password required or password not match!");
		
		String go;
		if(errors.isEmpty()) {
			go = "SuccessServlet";
			tryCreateUser(name, email, password);
		} else {
			go = "FailServlet";
			request.setAttribute("errors", errors);
		}
		
		request.getRequestDispatcher(go).forward(request, response);
		
	}
	
	private void tryCreateUser(String name, String email, String password) throws IOException {
		
		Path userhome = Paths.get(USER_PATH, name);
		
		if(Files.notExists(userhome)) {
			createUser(userhome, email, password);
		}
		
	}
	
	private void createUser(Path userhome, String email, String password) throws IOException {
		
		Files.createDirectories(userhome);
		
		Path profile = userhome.resolve("profile.txt");
		Path login = userhome.resolve("login.txt");
		
		try(BufferedWriter bw = Files.newBufferedWriter(profile)) {
			bw.write(String.format("%s\t%s", email, password));
		}
		
		try(BufferedWriter bw = Files.newBufferedWriter(login)) {
			bw.write("0");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}