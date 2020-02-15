package com.hfd.exceptions;

import java.util.Date;

public class CommonException {

	private Date timestamp;
	private String message;
	private String details;

	public CommonException(Date timestamp, String message, String details) {
	    super();
	    this.timestamp = timestamp;
	    this.message = message;
	    this.details = details;
	  }
}