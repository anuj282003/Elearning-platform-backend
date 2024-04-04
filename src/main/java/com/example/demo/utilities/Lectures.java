package com.example.demo.utilities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Lectures {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lectureId;

    private String lectureTitle;
    private String lecturePath;

    @ManyToOne()
    @JoinColumn(name = "course_id")
    private Courses course;



	public Long getLectureId() {
		return lectureId;
	}

	public void setLectureId(Long lectureId) {
		this.lectureId = lectureId;
	}

	public String getLectureTitle() {
		return lectureTitle;
	}

	public void setLectureTitle(String lectureTitle) {
		this.lectureTitle = lectureTitle;
	}

	public String getLecturePath() {
		return lecturePath;
	}

	public void setLecturePath(String lecturePath) {
		this.lecturePath = lecturePath;
	}

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

	public Lectures() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}	   
		   

		

		
	
		  
	

