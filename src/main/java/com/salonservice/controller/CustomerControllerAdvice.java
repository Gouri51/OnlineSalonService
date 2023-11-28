package com.salonservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.salonservice.exception.CustomerNotFoundException;

@RestControllerAdvice
public class CustomerControllerAdvice {

	 @ResponseStatus(code = HttpStatus.BAD_REQUEST)
		@ExceptionHandler(CustomerNotFoundException.class)
		public String exceptionHandler(Exception e) {
			return e.getMessage();
	 }
			
}