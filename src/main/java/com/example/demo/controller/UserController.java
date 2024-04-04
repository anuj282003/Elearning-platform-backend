package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Helper.FileUploadHelper;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.AdditionalTableService;
import com.example.demo.services.LectureService;
import com.example.demo.services.UserService;
import com.example.demo.utilities.Courses;
import com.example.demo.utilities.Lectures;
import com.example.demo.utilities.LoginRequest;
import com.example.demo.utilities.User;
import com.example.demo.utilities.UserDashboardDTO;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	UserService userserv;
	 @Autowired
	 private UserRepository userRepository;
	
//	@Autowired
//	private FileUploadHelper fileuploadhelper;
	
	@Autowired
    AdditionalTableService adtableSer;
	
	@Autowired
    private LectureService lectureService;
	
	
	@GetMapping
	public String mapUser() {
		return "hii user";
	}
	
	@PostMapping("/add")
	public String createUser( @RequestBody User user) {
		userserv.addUser(user);
		System.out.println(user.getUsername());
		
		return "added";
	}
	
//	@PostMapping("/upload")
//	public String videoUpload(@RequestParam("file") MultipartFile file) {
//		System.out.println(file.getOriginalFilename());
//		System.out.println(file.getSize());
//	try {	
//		if(file.isEmpty()) {
//			return "file is empty";
//		}
//		if(!file.getContentType().equals("image/jpeg")) {
//			return "file is not in JPEG formate";
//		}
//		
//		fileuploadhelper.fileUpload(file);
//	}
//	catch(Exception e) {
//		e.printStackTrace();
//	}
//		return "File Uploaded";
//		
//	}

	@PostMapping("/login")
	public  ResponseEntity<?> loginUser(@RequestBody LoginRequest loginRequest) {
		String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();
        System.out.println(email);
        System.out.println(password);
        User user = userRepository.findByEmail(loginRequest.getEmail());
        boolean status = userserv.authenticateUser(email, password);
        if(status) {
        	List<Lectures> lectures = lectureService.getLectures();
        	UserDashboardDTO userDashboardDTO = new UserDashboardDTO(user, lectures);
        	return ResponseEntity.ok(userDashboardDTO);
//        	userserv.viewLecture(email, password)
        	
        }
        else {
        	return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
        }
		
	}

	
}
