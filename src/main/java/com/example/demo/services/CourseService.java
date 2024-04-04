package com.example.demo.services;

import java.util.List;

import com.example.demo.utilities.Courses;
import com.example.demo.utilities.Lectures;

public interface CourseService {
	public Courses createCourse(Courses course);
	public List<Courses> getAllCourses();

}
