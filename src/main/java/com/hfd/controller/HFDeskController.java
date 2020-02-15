package com.hfd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hfd.entity.Specialist;
import com.hfd.service.HospitalDeskService;

@RestController
public class HFDeskController {
	
		@Autowired
		HospitalDeskService service;
	public HFDeskController() {
		System.out.println("Object Created");
	}
	@RequestMapping("/spl/{hospitalName}/{specialistType}")
	@GetMapping(produces="application/json")
	public ResponseEntity<List<Specialist>> SendSpecialistData(@PathVariable("hospitalName") String hospitalName,
			@PathVariable("specialistType") String specialistType) {
		ResponseEntity<List<Specialist>> response = null;
		List<Specialist> list=service.returnSpecialist(hospitalName, specialistType);
		response=new ResponseEntity<>(list,HttpStatus.OK);
		return response;
	}
}
