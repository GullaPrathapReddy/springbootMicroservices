package com.hfd.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class SpecialistNotFoundException extends RuntimeException {

	public SpecialistNotFoundException( String exception) {
		super(exception);
	}
}
