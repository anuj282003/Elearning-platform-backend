package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.utilities.Courses;
import com.example.demo.utilities.Lectures;

public interface LectureRepository extends JpaRepository<Lectures , Long> {

	 public List<Lectures> findByCourse(Courses course);

}
