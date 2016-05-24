package com.example.testValidation.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testValidation.domain.Test;
import com.example.testValidation.repository.TestRepository;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	TestRepository testRepository;

	private static final Logger LOGGER = Logger
			.getLogger(TestServiceImpl.class);

	@Override
	public Test display(String id) {

		Test test = testRepository.findById(id);

		if (test != null) {
			LOGGER.info(test);
		}
		return test;
	}

	@Override
	public Test save(Test test) {
		return testRepository.save(test);

	}

	@Override
	public void delete(String id) {
		Test test = testRepository.findById(id);

		if (test != null) {
			
			testRepository.delete(test);
		}
	}

	@Override
	public void update(String id) {
		
		Test test = testRepository.findById(id);

		if (test != null) {
			testRepository.save(test);
		}

	}

}
