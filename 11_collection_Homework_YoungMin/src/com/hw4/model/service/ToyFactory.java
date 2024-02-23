package com.hw4.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.hw4.model.dto.Toy;

public class ToyFactory {

	/*
	1. 장난감은 똑같은 재료를 중복으로 저장할 수 없다.
	2. 똑같은 장난감을 만들 수 없다.
	3. 장난감을 저장할 컬렉션에 중복된 장난감이 있어서는 안된다.
	4. 재료는 { 고유번호 : 재료명 } 형식으로 작성되어 있어야 한다.
	5. 재료의 고유번호는 중복될 수 없다.
	6. 재료 등록 시 이미 등록된 고유번호의 재료가 있으면, 덮어쓰겠냐는 질문을 하고 y/n
	으로 답변을 입력받아 처리해야 한다.
	7. 재료 삭제 시 고유번호가 아닌, 재료명을 입력받아 같은 재료명이 있으면 삭제한다.
	*/
	
	/*
	 * 1. HashMap 사용 { K : V }
	 * 2. Set 객체 특징 사용
	 */
	
	private Scanner sc = new Scanner(System.in);
	
	private Map<Integer, String> materialName = new HashMap<Integer, String>();
	
	private Set<Toy> toySet = new HashSet<Toy>();
	
	{
		materialName.put(1, "면직물");
		materialName.put(2, "플라스틱");
		materialName.put(3, "유리");
		materialName.put(4, "고무");
	}
	
	{
		toySet.add( new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", addMaterials(1, 4)) );
		toySet.add( new Toy("허기워기", 5, 12000, "파란색", "19940312", addMaterials(1, 2)) );
		toySet.add( new Toy("키시미시", 5, 15000, "분홍색", "19940505", addMaterials(1, 2)) );
		toySet.add( new Toy("캣냅", 8, 27000, "보라색", "19960128", addMaterials(1, 2)) );
		toySet.add( new Toy("파피", 12, 57000, "빨간색", "19931225", addMaterials(1, 2, 4)) );
	}
	//****************************** 중요 ************************************
	public Set<String> addMaterials(Integer...newMaterial){
		
		Set<String> materials = new HashSet<String>();
		
		for(Integer materialKey : newMaterial) {
			
			String materialList = materialName.get(materialKey);
			
			materials.add(materialList);
			
		}
		
		return materials;
		
	}	
	//*************************************************************************
	
	public void displayMenu() {
		
		int menuNum = 0;
		
		do {
			
			System.out.println("<<플레이타임 공장>>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			
			try {
				
				menuNum = sc.nextInt();
				
				switch(menuNum) {
				
				case 1 : displayAllToy(); break;
				case 2 : addToy(); break;
				case 3 : deleteToy(); break;
				case 4 : break;
				case 5 : break;
				case 6 : break;
				case 7 : break;
				case 0 : break;
				default : 
				
				}
				
			} catch(InputMismatchException e) {
				System.out.println("Error : 입력방식이 올바르지 않습니다. 다시 입력해주세요.");
				sc.nextLine();
				menuNum = -1;
			}
			
		} while(menuNum != 0);
		
	}
	
	public void displayAllToy() {
		
		System.out.println("<전체 장난감 목록>");
		
		int index = 1;
		
		for(Toy toys : toySet) {
			
			System.out.println(index + ". " + toys);
			index++;
		}
		
	}
	
	public void addToy() {
		
		System.out.println("<새로운 장난감 추가>");
		System.out.print("장난감 이름 : ");
		String name = sc.next();
		
		for(Toy toys : toySet) {
			
			if(toys.getName().equals(name)) {
				System.out.println("해당 장난감은 이미 존재합니다.");
				return;
			}
		}
		
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("색상 : ");
		String color = sc.next();
		
		System.out.print("제조일 (YYYYMMDD 형식으로 입력) : ");
		String manufactureDate = sc.next();
		
		Set<String> materialList = new HashSet<String>();
		
		
		while(true) {
			
			
			System.out.print("재료를 입력하세요 (종료하려면 'q'를 입력하세요):");
			String input = sc.next();
			
			
			if(input.charAt(0) == 'q' || input.charAt(0) == 'Q') {
				
				System.out.println("새로운 장난감이 추가되었습니다.");
				break;
				
			} else {
				materialList.add( input );
			}
			
		}
		
		toySet.add( new Toy(name, age, price, color, manufactureDate, materialList) );
		
	}
	
	public void deleteToy() {
		
		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		String name = sc.next();
		
		List<Toy> toyList = new ArrayList<Toy>(toySet);
		
		boolean flag = false;
		
		for(Toy toys : toyList) {
			
			if(toys.getName().equals(name)) {
				flag = true;
				toySet.remove(toys);
				System.out.println("장난감이 삭제되었습니다.");
			} 
		}
		
		if(!flag) {
			System.out.println("입력하신 이름의 장난감이 존재하지 않습니다.");
		}
	}
	
	public void displaySortByDate() {
		
		System.out.println("<제조일 순으로 장난감을 정렬>");
		
		
		
	}
	
}


























