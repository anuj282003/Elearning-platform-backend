package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.utilities.Courses;

public interface CourseRepository extends JpaRepository<Courses, Long> {

}
