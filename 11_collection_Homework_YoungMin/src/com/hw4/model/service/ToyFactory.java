package com.hw4.model.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
	
	private Map<Integer, String> materialMap = new HashMap<Integer, String>();
	
	private Set<Toy> toySet = new HashSet<Toy>();
	
	{
		materialMap.put(1, "면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");
	}
	
	{
		toySet.add( new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", materials(1, 4)) );
		toySet.add( new Toy("허기워기", 5, 12000, "파란색", "19940312", materials(1, 2)) );
		toySet.add( new Toy("키시미시", 5, 15000, "분홍색", "19940505", materials(1, 2)) );
		toySet.add( new Toy("캣냅", 8, 27000, "보라색", "19960128", materials(1, 2)) );
		toySet.add( new Toy("파피", 12, 57000, "빨간색", "19931225", materials(1, 2, 4)) );
	}
	
	public Set<String> materials(Integer...addMaterial) {
		  
		Set<String> newMaterial = new HashSet<String>();
		
		for(Integer materialNum : addMaterial) {
			
			newMaterial.add(materialMap.get(materialNum));
			
		}
		
		return newMaterial;
		
	}
	
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
				case 4 : sortByManufactureDate(); break;
				case 5 : displayByAge(); break;
				case 6 : addMaterial(); break;
				case 7 : deleteMaterial(); break;
				case 0 : System.out.println("프로그램 종료"); break;
				default : System.out.println("메뉴 목록에 있는 번호만 입력해주세요");
				
				}
				
			} catch(InputMismatchException e) {
				System.out.println("Error : 입력방식이 올바르지 않습니다. 다시 입력해주세요.");
				sc.nextLine();
				menuNum = -1;
			}
			
			
		} while(menuNum != 0);
		
		
	}
	
	public void displayAllToy() {
		
		int index = 1;
		
		for(Toy toys : toySet) {
			
			System.out.println( index + ". " + toys );
			index++;
		}
		
		
	}
	
	public void addToy() throws InputMismatchException{
		
		System.out.println("<새로운 장난감 추가>");
		System.out.print("장난감 이름 : ");
		String name = sc.next();
		
		for(Toy toys : toySet) {
			
			if(toys.getName().equals(name)) {
				
				System.out.println("입력한 이름의 장난감이 이미 존재합니다.");
				return;
				
			} 
			
		}
		
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("색상 : ");
		String color = sc.next();
		
		System.out.print("제조일 (YYYYMMDD) 형식으로 입력 : ");
		String date = sc.next();
		
		Set<String> materialSet = new HashSet<String>();
		
		while(true) {
			
			
			System.out.print("재료를 입력하세요 (종료하려면 'q'를 입력하세요) : ");
			String addMaterial = sc.next();
			
			if(addMaterial.equalsIgnoreCase("Q")) {
				
				System.out.println("새로운 장난감이 추가되었습니다.");
				break;
				
			} else {
				
				materialSet.add(addMaterial);
			}
			
		}
		toySet.add( new Toy(name, age, price, color, date, materialSet) );
		
		
	}
	
	public void deleteToy() throws InputMismatchException{
		
		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		String name = sc.next();
		
		boolean flag = false;
		
		List<Toy> toyList = new ArrayList<Toy>(toySet);
		
		for(Toy toys : toyList) {
			
			if(toys.getName().equals(name)) {
				
				flag = true;
				toySet.remove(toys);
				System.out.printf("'%s' 장난감이 삭제되었습니다.\n", name);
			}
			
		}
		
		if(!flag) {
			System.out.println("입력하신 이름의 장난감이 존재하지 않습니다.");
		}
	}
	
	public void sortByManufactureDate() {
		
		int index = 1;
		
		List<Toy> toyList = new ArrayList<Toy>(toySet);	// List 화 
		
		
		toyList.sort(Comparator.comparing(Toy::getManufactureDate));	// 정렬
		
		for(Toy toys : toyList) {
			
			System.out.println(index + ". " + toys);	// 출력
			index++;
			
		}
		
	}
	
	public void displayByAge() {
		
		System.out.println("<연령별로 사용 가능한 장난감>");
		
		Map<Integer, List<Toy>> toyMap = new HashMap<Integer, List<Toy>>();
		
		for(Toy toys : toySet) {
			
			int age = toys.getAge();
			
			toyMap.putIfAbsent(age, new ArrayList<Toy>());
			
			toyMap.get(age).add(toys);	// toyMap.get(age) == new ArrayList<Toy>()
		}
		
		
		
		
		for(Entry<Integer, List<Toy>> displayByAge : toyMap.entrySet()) {
			
			System.out.println("[연령 : " + displayByAge.getKey() + "세]");
			int index = 1;
			
			for(Toy toys : displayByAge.getValue()) {
				
				System.out.println(index + ". " + toys);
				index++;
			}
			
		}
		
	}
	
	public void addMaterial() throws InputMismatchException{
		
		System.out.println("<재료 추가>");
		System.out.println("=== 현재 등록된 재료 ===");
		
		for(Entry<Integer, String> material : materialMap.entrySet()) {
			
			System.out.println(material.getKey() + " : " + material.getValue());
		}
		
		System.out.println("========================");
		
		System.out.print("재료 고유번호(key) 입력 : ");
		int key = sc.nextInt();
		
		System.out.print("재료명 입력 : ");
		String name = sc.next();
		
		if(materialMap.containsKey(key)) {	// 반복문 돌릴 필요 X
			
			System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
			System.out.print("덮어쓰시겠습니까?(y/n) : ");
			String answer = sc.next();
			
			if(answer.equalsIgnoreCase("Y")) {
				materialMap.put(key, name);
				System.out.println("재료가 성공적으로 덮어쓰기 되었습니다.");
				
			} else if (answer.equalsIgnoreCase("N")) {
				System.out.println("덮어쓰기가 취소되었습니다.");
				
			}
			
		} else {
			
			materialMap.put(key, name);
			System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
		}
		
		
	}
	
	public void deleteMaterial() throws InputMismatchException {
		
		System.out.println("<재료 삭제>");
		System.out.println("=== 현재 등록된 재료 ===");
		
		for(Entry<Integer, String> entry : materialMap.entrySet()) {
			
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("========================");
		
		System.out.print("삭제할 재료명 입력 : ");
		String name = sc.next();
		
		boolean flag = false;
		
		for(Entry<Integer, String> entry : materialMap.entrySet()) {
			
			if(entry.getValue().equals(name)) {
				
				flag = true;
				materialMap.remove(entry.getKey());
				System.out.println("재료 '" + name + "'이가 성공적으로 제거되었습니다.");
				break;		// *** 중요	***	 없으면 예외 발생		
			}
		}
		if(!flag) {
			System.out.println("해당 이름의 재료가 존재하지 않습니다.");
		}
	}
}


























