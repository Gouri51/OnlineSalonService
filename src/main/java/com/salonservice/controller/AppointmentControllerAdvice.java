package com.salonservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.salonservice.exception.AppointmentNotFoundException;

@RestControllerAdvice
public class AppointmentControllerAdvice {

	   @ResponseStatus(code = HttpStatus.BAD_REQUEST)
		@ExceptionHandler(AppointmentNotFoundException.class)
		public String exceptionHandlerForAppointmentController(Exception e) {
			return e.getMessage();

	   }
}
