package com.hfd.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(SpecialistNotFoundException.class)
	public final ResponseEntity<CommonException> handlespecialistNotFoundException(SpecialistNotFoundException ex,
			WebRequest request) {
		CommonException errorDetails = new CommonException(new Date(), ex.getMessage(), "The Specialist Not Found Who are You Looking ");
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(HospitalNotFoundException.class)
	public final ResponseEntity<CommonException> handleHospitalNotFoundException(HospitalNotFoundException ex,
			WebRequest request) {
		CommonException errorDetails = new CommonException(new Date(), ex.getMessage(), "The Hospital Not Found Who are You Looking ");
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
}
