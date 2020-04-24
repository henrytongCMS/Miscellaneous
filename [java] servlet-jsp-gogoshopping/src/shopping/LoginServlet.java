package shopping;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter pw = response.getWriter();
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		if (isLogin(email, password)) {
			
			request.getSession().setAttribute("islogin", "success");
			request.getSession().setAttribute("name", getUser(email));
			request.getRequestDispatcher("shopping.jsp").include(request, response);
			
		} else {
			
			request.getSession().setAttribute("islogin", "incorrect");
			request.getRequestDispatcher("index.jsp").include(request, response);	
			
		}
		
		pw.close();
		
	}
	
	private boolean isLogin(String email, String password) throws IOException {
		
		UserDAO userdao = new UserDAO();
		UserModel usermodel = userdao.selectUserbyEmail(email);
		
		password = md5(password);
		
		if (usermodel != null) {
			 String mypassword = usermodel.getPassword();
			 return password.equals(mypassword);
		}
		
		return false;
		
	}
	
	private String md5(String s) {
		
	    try {
	    	
	        // Create MD5 Hash
	        MessageDigest digest = MessageDigest.getInstance("MD5");
	        digest.update(s.getBytes());
	        byte messageDigest[] = digest.digest();
	 
	        // Create Hex String
	        StringBuffer hexString = new StringBuffer();
	        for(int i=0; i<messageDigest.length; i++) {
	        	
	        	String hex = Integer.toHexString(0xFF & messageDigest[i]);
	        	if (hex.length() == 1) {
	                hexString.append('0');
	            }
	            hexString.append(hex);
	            
	        }
	        
	        return hexString.toString();
	        
	    } catch (NoSuchAlgorithmException e) {
	        e.printStackTrace();
	    }
	    
	    return "";
	    
	}
	
	private String getUser(String email) throws IOException {
		return (new UserDAO()).selectUserbyEmail(email).getUser();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}