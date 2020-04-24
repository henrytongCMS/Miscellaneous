package com.abc;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class CountUserListener implements HttpSessionListener {

	ServletContext ctx = null;
	static int total = 0;
	
    public CountUserListener() {
    }

    public void sessionCreated(HttpSessionEvent se)  { 
    	
    	total++;
    	int u = total % 10;
    	int t = (total/10) % 10;
    	int h = (total/100) % 10;

    	ctx = se.getSession().getServletContext();
    	ctx.setAttribute("u", u);
    	ctx.setAttribute("t", t);
    	ctx.setAttribute("h", h);

    }

    public void sessionDestroyed(HttpSessionEvent se)  {
    }
	
}
