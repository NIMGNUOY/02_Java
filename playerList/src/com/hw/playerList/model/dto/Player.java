package com.hw.playerList.model.dto;

import java.io.Serializable;

public class Player implements Serializable{

	private String name;
	private int age;
	private String nationality;
	private String team;
	private int backNum;
	private boolean tranferIntention;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(String name, int age, String nationality, String team, int backNum, boolean tranferIntention) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		this.team = team;
		this.backNum = backNum;
		this.tranferIntention = tranferIntention;
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

	public int getBackNum() {
		return backNum;
	}

	public void setBackNum(int backNum) {
		this.backNum = backNum;
	}

	public boolean isTranferIntention() {
		return tranferIntention;
	}

	public void setTranferIntention(boolean tranferIntention) {
		this.tranferIntention = tranferIntention;
	}

	@Override
	public String toString() {
		return "[name : " + name + ", age : " + age + ", nationality : " + nationality + ", team : " + team
				+ ", backNum : " + backNum + ", tranferIntention : " + tranferIntention + "]";
	}
	
	
	
}
