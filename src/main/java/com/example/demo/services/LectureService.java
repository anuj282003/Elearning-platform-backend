package com.example.demo.services;

import java.util.List;

import com.example.demo.utilities.Courses;
import com.example.demo.utilities.Lectures;

public interface LectureService {
	 public Lectures createLecture(Lectures lecture);
	 public List<Lectures> getLecturesByCourse(Courses course) ;
	 public List<Lectures> getLectures();
}
