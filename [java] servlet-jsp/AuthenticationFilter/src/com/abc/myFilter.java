package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter({"/LoginServlet"})
public class myFilter implements Filter {

    public myFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		PrintWriter pw = response.getWriter();
		
		String password = request.getParameter("password");
		
		if(password.equals("1234")) {
			chain.doFilter(request, response);
		} else {
			pw.print("Password incorrect!");
			request.getRequestDispatcher("index.html").include(request, response);
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
