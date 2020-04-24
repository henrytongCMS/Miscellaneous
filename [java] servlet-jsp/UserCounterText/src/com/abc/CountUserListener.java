package com.abc;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class CountUserListener implements HttpSessionListener {

	ServletContext ctx = null;
	static int total = 0;
	static int current = 0;
	
    public CountUserListener() {
    }

    public void sessionCreated(HttpSessionEvent se)  { 
    	total++;
    	current++;
    	ctx = se.getSession().getServletContext();
    	ctx.setAttribute("totalusers", total);
    	ctx.setAttribute("currentusers", current);
    }

    public void sessionDestroyed(HttpSessionEvent se)  {
    	current--;
    	ctx.setAttribute("currentusers", current);
    }
	
}
