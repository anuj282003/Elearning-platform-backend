package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class AdditionalTableServiceImple implements AdditionalTableService {
	@PersistenceContext
    private EntityManager entityManager;

	@Override
	public List<Object[]> getAllDataFromGeneratedTable() {
		  String sqlQuery = "SELECT * FROM 	course_lecture_mapping ";
		  List<Object[]> resultList = entityManager.createNativeQuery(sqlQuery).getResultList();
		return resultList;
	}
	
}
