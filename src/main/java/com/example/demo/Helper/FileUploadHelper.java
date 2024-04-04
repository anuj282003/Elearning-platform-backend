package com.example.demo.Helper;

import java.io.FileOutputStream;
import java.io.InputStream;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	public final String UPLOAD_DIR="C:\\Users\\Anuj Pandey\\Documents"
			+ "\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\Kodnest-ElearningPlatform"
			+ "\\src\\main\\resources\\static\\image";
     public boolean fileUpload(MultipartFile multipartfile ) {
    	 boolean f = false;
    	 try {
      //read
    	InputStream is=	 multipartfile.getInputStream();
    	byte [] data = new byte [is.available()];
    	is.read();
    	
    	
    	//Write 
    	FileOutputStream fos = new FileOutputStream(UPLOAD_DIR+"//"+multipartfile.getOriginalFilename());
    	fos.write(data);	
    	fos.flush();
    	fos.close();
    	
    	f= true;
    	
    	/*
    	 *  Using nio 
    	 *  
    	 *  
    	 *  Files.copy(mulitpartfile.getInputStream(),UPLOAD_DIR.seprato+multipartfile.getOriginalFilename(),StandardCopyOption.REPLACE_EXISTING)
    	 * */
    	
    	 }
    	 catch(Exception e) {
    		e.printStackTrace();
    		 
    	 }
    	 
    	 
    	 return f;
    	 
    	 
     }
	
}
