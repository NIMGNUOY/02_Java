package com.hw1.model.vo;

public class Student extends Person{

	private int grade;
	private String major;
	
	public Student() {}

	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.name = name;
		// 후손 클래스 Student 는 
		// 부모 Person 클래스 protected 필드 직접 접근 가능!!!
		// name 값은 부모 필드 값에 직접 접근해서 초기화
		
		
		this.grade = grade;
		this.major = major;
	}


	@Override		// override 까먹지 말기
	public String information() {
		return super.information() + 
				String.format(" / 학년 : %d / 전공 : %s", 
													grade, major);
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
}
