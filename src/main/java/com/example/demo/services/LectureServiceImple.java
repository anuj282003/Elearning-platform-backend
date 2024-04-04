package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.LectureRepository;
import com.example.demo.utilities.Courses;
import com.example.demo.utilities.Lectures;

@Service
public class LectureServiceImple implements LectureService {
	@Autowired
    private LectureRepository lectureRepository;

	@Override
	public Lectures createLecture(Lectures lecture) {
		// TODO Auto-generated method stub
		return lectureRepository.save(lecture);
	}

	@Override
	public List<Lectures> getLecturesByCourse(Courses course) {
		// TODO Auto-generated method stub
		  return lectureRepository.findByCourse(course);
	}
	
	public List<Lectures> getLectures(){
		return lectureRepository.findAll();
	}

}
