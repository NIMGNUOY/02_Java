package com.hw1.model.vo;

public class Employee extends Person{

	private int salary;
	private String dept;
	
	public Employee() {}

	
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.name = name; // Person 의 protected 필드 
					//자식 클래스는 부모클래스의 protected 필드에 직접 접근 가능하다
					// name 값은 부모 필드 값에 직접 접근해서 초기화
		this.salary = salary;
		this.dept = dept;
	}


	@Override   // override 까먹지 말기
	public String information() {
		return super.information() + String.format(" / 급여 : %d / 부서 : %s", 
												salary, dept);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
}
