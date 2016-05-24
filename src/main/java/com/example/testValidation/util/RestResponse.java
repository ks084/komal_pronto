package com.example.testValidation.util;

public class RestResponse<T> {

	  private String errorMessage;

	  private T data;

	  public String getErrorMessage() {
	    return errorMessage;
	  }

	  public void setErrorMessage(String errorMessage) {
	    this.errorMessage = errorMessage;
	  }

	  public T getData() {
	    return data;
	  }

	  public void setData(T data) {
	    this.data = data;
	  }

	  public RestResponse(String errorMessage, T data) {
	    this.errorMessage = errorMessage;
	    this.data = data;
	  }
	  
	  public RestResponse(T data) {
	    this.data = data;
	  }

	  public RestResponse() {}

	}
