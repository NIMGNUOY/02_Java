package com.hw2.model.dto;

public class Prisoner extends Person{

	private String crime;		// 죄목
	
	public Prisoner() {}

	public Prisoner(String id, String name, String crime) {
		super(id, name);
		this.id = id;
		this.name = name;
		this.crime = crime;
	}

	@Override
	public String getInfo() {
		
		return "ID : " + id + ", 이름 : " + name + 
				", 죄목 : " + crime;
	}

	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}
	
	
	
}
