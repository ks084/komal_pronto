package com.example.testValidation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.testValidation.domain.Test;

public interface TestRepository extends MongoRepository<Test,String>{
	
	Test findById(String id);

}
