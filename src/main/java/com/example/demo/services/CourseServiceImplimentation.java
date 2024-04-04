package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.CourseRepository;
import com.example.demo.utilities.Courses;
import com.example.demo.utilities.Lectures;

@Service
public class CourseServiceImplimentation implements CourseService {
	
	@Autowired
	CourseRepository  courseRepository;
	

	@Override
	public Courses createCourse(Courses course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}

	 public List<Courses> getAllCourses() {
	        return courseRepository.findAll();
	    }
	
	
}
