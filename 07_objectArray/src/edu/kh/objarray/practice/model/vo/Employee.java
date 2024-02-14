package edu.kh.objarray.practice.model.vo;

public class Employee {
	
	private int eNum;
	private String eName;
	private String eDept;
	private String job;
	private int salary;
	
	public Employee() {}   // 기본 생성자
	
	public Employee(int eNum, String eName, String eDept, String job, int salary) {
		
		this.eNum = eNum;
		this.eName = eName;
		this.eDept = eDept;
		this.job = job;
		this.salary = salary;
		
	}   // 필드 전체 초기화 생성자

	public int geteNum() {
		return eNum;
	}

	public void seteNum(int eNum) {
		this.eNum = eNum;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteDept() {
		return eDept;
	}

	public void seteDept(String eDept) {
		this.eDept = eDept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
