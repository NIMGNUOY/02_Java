package com.hw.playerList.model.dto;

public class Player {

	private String name;
	private int	age;
	private int backNum;
	private String nationality;
	private String team;
	
	public Player() {}

	public Player(String name, int age, int backNum, String nationality, String team) {
		super();
		this.name = name;
		this.age = age;
		this.backNum = backNum;
		this.nationality = nationality;
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBackNum() {
		return backNum;
	}

	public void setBackNum(int backNum) {
		this.backNum = backNum;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "[" + name + " Infomation] \n" + 
				"Age : " + age + "\n" + 
				"BackNumber : " + backNum + "\n" + 
				"Nationality : " + nationality + "\n" + 
				"Team : " + team + "\n";
	
	}
	
	
	
	
}
