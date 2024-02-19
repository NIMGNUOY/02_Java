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
		
		if( person instanceof Prisoner && prisonerCount < prisoners.length) {
			
			System.out.println( "수감자가 추가되었습니다." + person.getInfo() );
			prisoners[prisonerCount++] = (Prisoner) person;
		} else {
			System.out.println("인원이 모두 충원되어 더 이상 인원을 추가할 수 없습니다.");
			
		}
		
	}

	@Override
	public void removePerson(String id) {
		
		for(int i = 0; i < prisonerCount; i ++) {
			
			if(prisoners[i].getId().equals(id)) {
				
				System.out.println( "수감자가 삭제되었습니다." + prisoners[i].getInfo() );
				prisoners[i] = null;
				
				for(int j = i; j < prisonerCount - 1; j ++) {
					
					prisoners[j] = prisoners[j + 1];
				}
				prisoners[--prisonerCount] = null;
				return;
			}
			
			System.out.println("ID : " + id + "인 수감자를 찾을 수 없습니다.");
		}
		
	}

	@Override
	public void displayAllPersons() {
		
		System.out.println("전체 수감자 명단 : ");
		for (int i = 0; i < prisonerCount; i++) {
			System.out.println( prisoners[i].getInfo() );
		}
		
	}
	
	
}
