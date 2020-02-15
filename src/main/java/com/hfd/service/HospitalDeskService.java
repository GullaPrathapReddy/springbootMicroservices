package com.hfd.service;

import java.util.List;

import com.hfd.entity.Specialist;

public interface HospitalDeskService {
		
		public List<Specialist> returnSpecialist(String hospitalname, String specialisttype);
}
