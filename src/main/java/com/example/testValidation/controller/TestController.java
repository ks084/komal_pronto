package com.example.testValidation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.testValidation.domain.Test;
import com.example.testValidation.service.TestService;
import com.example.testValidation.util.RestResponse;

@Controller
public class TestController {

	@Autowired
	TestService testService;

	@RequestMapping(path = "/test", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<RestResponse<Test>> save(@RequestBody Test test) {
		test = testService.save(test);
		return new ResponseEntity<>(new RestResponse<>(test),
				HttpStatus.CREATED);
	}

	@RequestMapping(path = "/test/{id}")
	@ResponseBody
	public ResponseEntity<RestResponse<Test>> find(@PathVariable String id) {
		Test test = testService.display(id);
		return new ResponseEntity<>(new RestResponse<>(test), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/healthcheck", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<RestResponse<String>> healthCheck() {
		return new ResponseEntity<>(new RestResponse<>("Server is up"), HttpStatus.OK);
	}

}
