package com.hfd.entity;

public class Specialist {

	private String type;

	private String name;

	private String availableday;

	private String availableTime;

	private String isAvailable;

	private int hospitalId;

	public Specialist() {
		// TODO Auto-generated constructor stub
	}

	public Specialist(String type, String name, String availableday, String availableTime, String isAvailable,
			int hospitalId) {
		super();
		this.type = type;
		this.name = name;
		this.availableday = availableday;
		this.availableTime = availableTime;
		this.isAvailable = isAvailable;
		this.hospitalId = hospitalId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvailableday() {
		return availableday;
	}

	public void setAvailableday(String availableday) {
		this.availableday = availableday;
	}

	public String getAvailableTime() {
		return availableTime;
	}

	public void setAvailableTime(String availableTime) {
		this.availableTime = availableTime;
	}

	public String isAvailable() {
		return isAvailable;
	}

	public void setAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

}
