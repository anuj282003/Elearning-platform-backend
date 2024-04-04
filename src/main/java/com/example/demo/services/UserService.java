package com.example.demo.services;

import java.util.List;

import com.example.demo.utilities.Lectures;
import com.example.demo.utilities.User;

public interface UserService {
	public String addUser(User user);
	public boolean authenticateUser(String email, String password);
	public List<Lectures> viewLecture(String email,String password);
	

}
