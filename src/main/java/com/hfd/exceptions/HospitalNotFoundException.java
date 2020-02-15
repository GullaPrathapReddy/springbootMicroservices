package com.hfd.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class HospitalNotFoundException extends RuntimeException {

	public HospitalNotFoundException(String ex) {
		super(ex);
	}
}
