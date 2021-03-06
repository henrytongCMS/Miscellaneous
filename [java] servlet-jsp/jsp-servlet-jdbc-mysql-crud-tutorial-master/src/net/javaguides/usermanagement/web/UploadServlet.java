package net.javaguides.usermanagement.web;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/UploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    private static final int THRESHOLD_SIZE    = 1024 * 1024 * 3;  // 3MB
    private static final int MAX_FILE_SIZE     = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE  = 1024 * 1024 * 50; // 50MB

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		// checks if the request actually contains upload file
        if (!ServletFileUpload.isMultipartContent(request)) {
            PrintWriter writer = response.getWriter();
            writer.println("Request does not contain upload data");
            writer.flush();
            return;
        }
         
        // configures upload settings
        DiskFileItemFactory factory = new DiskFileItemFactory();
        factory.setSizeThreshold(THRESHOLD_SIZE);
        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
         
        ServletFileUpload upload = new ServletFileUpload(factory);
        upload.setFileSizeMax(MAX_FILE_SIZE);
        upload.setSizeMax(MAX_REQUEST_SIZE);
         
        // constructs the directory path to store upload file
        String uploadPath = "C:\\Users\\User\\Desktop\\userimg\\";
        
        // creates the directory if it does not exist
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }
         
        try {
            // parses the request's content to extract file data
            List<FileItem> formItems = upload.parseRequest(request);
            Iterator<FileItem> iter = formItems.iterator();
             
            // iterates over form's fields
            while (iter.hasNext()) {
            	
                FileItem item = (FileItem) iter.next();
                
                // processes only fields that are not form fields
                if (!item.isFormField()) {
         
                    String fileName = item.getFieldName() + ".jpg";
                    String filePath = uploadPath + File.separator + fileName;
                    File storeFile = new File(filePath);
                    // saves the file on disk
                    item.write(storeFile);
                    
                }
            }
            
        } catch (Exception ex) {
        	
        }
		
		response.sendRedirect("ListServlet");
		
	}

}