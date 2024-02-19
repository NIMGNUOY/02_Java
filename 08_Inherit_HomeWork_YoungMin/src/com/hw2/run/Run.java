package com.hw2.run;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Prisoner;
import com.hw2.model.service.Company;
import com.hw2.model.service.Prison;


public class Run {

	public static void main(String[] args) {
		
		Company company = new Company(10);
		
		company.addPerson( new Employee("EMP001", "유재석", "기획팀") );
		company.addPerson( new Employee("EMP002", "정형돈", "개발팀") );
		
		company.displayAllPersons();
		
		System.out.println("======================================================================");
		
		Prison p = new Prison(10);
		
		p.addPerson( new Prisoner("1205", "정준하", "밥도둑") );
		p.addPerson( new Prisoner("0705", "박명수", "웃음연쇄살인") );
		
		p.displayAllPersons();
		
		System.out.println("======================================================================");
		
		company.removePerson("EMP001");
		p.removePerson("1205");
		
		System.out.println("======================================================================");
		
		company.displayAllPersons();
		p.displayAllPersons();
	}
	
}
