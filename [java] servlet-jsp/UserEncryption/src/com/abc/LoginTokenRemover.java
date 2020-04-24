package com.abc;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class LoginTokenRemover implements HttpSessionListener {
	
	private final String USER_PATH = "C:/Users/HENRY/Desktop";

    public LoginTokenRemover() {
    }

    public void sessionCreated(HttpSessionEvent se)  { 
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
    	
        try {
        	createLogout((String)se.getSession().getAttribute("name"));
		} catch (IOException e) {
			e.printStackTrace();
		}
         
    }
    
    private void createLogout(String name) throws IOException {
		
		Path profile = Paths.get(USER_PATH, name).resolve("login.txt");
		
		try(BufferedWriter bw = Files.newBufferedWriter(profile)) {
			bw.write("0");
		}
	}
	
}
