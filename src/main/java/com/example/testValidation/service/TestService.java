package com.example.testValidation.service;

import com.example.testValidation.domain.Test;


public interface TestService{
	
	Test display(String id);
	
	void delete(String id);
	
	void update(String id);

	Test save(Test test);

}
