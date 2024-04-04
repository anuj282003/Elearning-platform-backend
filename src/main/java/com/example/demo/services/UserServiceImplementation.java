package com.example.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.LectureRepository;
import com.example.demo.repositories.UserRepository;
import com.example.demo.utilities.Lectures;
import com.example.demo.utilities.User;

@Service
public class UserServiceImplementation implements UserService {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	LectureRepository lectureRepo;
	
	
	@Override
	public String addUser(User user) {
		userRepo.save(user);
		return null;
	}


	@Override
	public boolean authenticateUser(String email, String password) {
		User user = userRepo.findByEmail(email);
		if(user!=null && user.getPassword().equals(password)) {
			//must be required role of user for checking Student and Mentor
			if(user.getUserRole().equals("Student")) {
			   List <  Lectures > lectures =   lectureRepo.findAll();
			}
			return true;
		}
		return false;
	}
	
	public List<Lectures> viewLecture(String email,String password){
	User user = userRepo.findByEmail(email);
	if(user!=null && user.getPassword().equals(password)) {
		//must be required role of user for checking Student and Mentor
		if(user.getUserRole().equals("Student")) {
		   List <  Lectures > lectures =   lectureRepo.findAll();
		   return lectures;
		}
		else {
			return null;
		}
	}
	
	else {
		return null;
	}
	
	}

}
