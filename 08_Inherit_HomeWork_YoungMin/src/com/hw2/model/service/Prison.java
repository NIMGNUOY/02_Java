package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{

	private Prisoner[] prisoners;		//전체 수용자 저장용
	
	private int prisonerCount;			//수용자수

	public Prison(int size) {
		prisoners = new Prisoner[size];
		prisonerCount = 0;
	}

	@Override
	public void addPerson(Person person) {
		
		for(int i = 0; i < prisoners.length; i ++) {
			
			if(person instanceof Employee && prisoners[i] == null) {
				prisoners[i] = new Prisoner();
				prisonerCount++;
				System.out.println("수감자가 추가되었습니다 - " +  prisoners[i].getInfo() );
			} else if (prisoners[i] != null) {
				System.out.println("인원이 모두 충원되었습니다.");
			}
		}
		
	}

	@Override
	public void removePerson(String id) {
		
		for(int i = 0; i < prisoners.length; i ++) {
			
			if(prisoners[i].getId().equals(id)) {
				prisonerCount--;
				for(int j = 0; j < prisoners.length; j++) {
					prisoners[i] = prisoners[j];
				}
			} else {
				System.out.println("해당 id를 가진 수감자를 찾을 수 없습니다.");
			}
		}
		
	}

	@Override
	public void displayAllPersons() {
		
		System.out.println("전체 수감자 명단 : ");
		for (int i = 0; i < prisoners.length; i++) {
			System.out.println( prisoners[i].getInfo() );
		}
		
	}
	
	
}
