package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.LectureService;
import com.example.demo.utilities.Courses;
import com.example.demo.utilities.Lectures;

@RestController
@RequestMapping("/lectures")
public class LectureController {
    @Autowired
    private LectureService lectureService;

    @PostMapping
    public ResponseEntity<Lectures> createLecture(@RequestBody Lectures lecture) {
        Lectures createdLecture = lectureService.createLecture(lecture);
        return ResponseEntity.created(URI.create("/lectures/" + createdLecture.getLectureId())).body(createdLecture);
    }

    @GetMapping("/course/{courseId}")
    public ResponseEntity<List<Lectures>> getLecturesByCourse(@PathVariable Long courseId) {
        Courses course = new Courses();
        course.setCourseId(courseId);
        List<Lectures> lectures = lectureService.getLecturesByCourse(course);
        return ResponseEntity.ok(lectures);
    }

    
}