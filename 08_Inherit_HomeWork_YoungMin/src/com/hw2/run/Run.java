package com.hw2.run;

import com.hw2.model.dto.Employee;
import com.hw2.model.service.Company;
import com.hw2.model.service.ManagementSystem;
import com.hw2.model.service.Prison;

public class Run {

	public static void main(String[] args) {
		
		ManagementSystem company = new Company(10);
		company.addPerson(new Employee("EMP001", "유재석", "기획팀"));
		company.addPerson(new Employee("EMP002", "정형돈", "개발팀"));
		
		company.displayAllPersons();
		
		Prison p = new Prison(10);
	}
	
}
