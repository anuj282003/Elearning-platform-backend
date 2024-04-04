package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.utilities.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {

}
