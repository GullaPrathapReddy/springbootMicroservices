package com.hfd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hfd.entity.Hospital;
import com.hfd.entity.Specialist;
import com.hfd.exceptions.HospitalNotFoundException;
import com.hfd.exceptions.SpecialistNotFoundException;

@Service
public class HospitalDeskServiceImpl implements HospitalDeskService {
	private static List<Hospital> hospitallist = null;
	private static List<Specialist> specialists = null;
	static {
		hospitallist = new ArrayList<Hospital>();
		Hospital h1 = new Hospital(111, "Apollo");
		Hospital h2 = new Hospital(211, "DrAgarwal");
		Hospital h3 = new Hospital(411, "DrBatras");
		Hospital h4 = new Hospital(611, "VasanEyeCare");
		hospitallist.add(h1);
		hospitallist.add(h2);
		hospitallist.add(h3);
		hospitallist.add(h4);
		specialists = new ArrayList<>();
		Specialist spl1 = new Specialist("Dentist", "sandhya", "Monday,Wednesday", "5 to 6", "Y", 111);
		Specialist spl2 = new Specialist("Dentist", "Rani", "Monday,Wednesday,Thursday", "6 to 8", "Y", 211);
		Specialist spl3 = new Specialist("Dermatology", "Kumar", "Monday,Wednesday", "5 to 6", "N", 411);
		Specialist spl4 = new Specialist("Anesthesiology", "sandhyaRani", "Monday,Wednesday", "3 to 6", "Y", 611);
		specialists.add(spl1);
		specialists.add(spl2);
		specialists.add(spl3);
		specialists.add(spl4);
	}

	@Override
	public List<Specialist> returnSpecialist(String hospitalname, String specialisttype) {
		List<Specialist> SpecialistSize=new ArrayList<>();
				hospitallist.forEach(h->{
					System.out.println(h.getName()+"--"+hospitalname);
					if(h.getName().equalsIgnoreCase(hospitalname)) {
						System.out.println("-------");
						specialists.forEach(spl->{
							if(spl.getType().equalsIgnoreCase(specialisttype)) {
								System.out.println(spl.getType()+"--"+specialisttype);
								SpecialistSize.add(spl);
							}
						});
					}
				});
				
		
		return SpecialistSize;
	}

}
