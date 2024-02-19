package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem{

	private Employee[] employee = null;		// 전체 직원 저장용
	
	private int employeeCount;			// 직원수
	
	public Company(int size) {
		employee = new Employee[size];
		employeeCount = 0;
	}

	@Override
	public void addPerson(Person person) {
	
		for(int i = 0; i < employee.length; i ++) {
			
			if(person instanceof Employee && employee[i] == null) {
				employee[i] = new Employee();
				employeeCount++;
				System.out.println("직원이 추가되었습니다 - " +  employee[i].getInfo() );
			} else if (employee[i] != null) {
				System.out.println("인원이 모두 충원되었습니다.");
			}
		}
		
	}

	@Override
	public void removePerson(String id) {
		
		for(int i = 0; i < employee.length; i ++) {
			
			if(employee[i].getId().equals(id)) {
				employeeCount--;
				for(int j = 0; j < employee.length; j++) {
					employee[i] = employee[j];
				}
			} else {
				System.out.println("해당 id를 가진 직원을 찾을 수 없습니다.");
			}
		}
		
	}

	@Override
	public void displayAllPersons() {
		
		System.out.println("전체 직원 명단 : ");
		for (int i = 0; i < employee.length; i++) {
			System.out.println( employee[i].getInfo() );
		}
		
	}
	
	
	
}
