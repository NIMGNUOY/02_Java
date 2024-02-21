package com.hw4.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.hw4.model.dto.Toy;

public class ToyFactory {

	private Scanner sc = new Scanner(System.in);
	
	private Set<Toy> toyList = new HashSet<Toy>();
	
	private Map<Integer,String> ingreName = new HashMap<Integer, String>();
	
	{
		ingreName.put(1, "면직물");
		ingreName.put(2, "플라스틱");
		ingreName.put(3, "유리");
		ingreName.put(4, "고무");
		
	}
	
	{
		toyList.add( new Toy("마이롱레그", 8, 36000, "분홍색", 19950805, ( ingreName.get(1) + ", " + ingreName.get(4)) ) );
		toyList.add( new Toy("허기워기", 5, 12000, "파란색", 19940312, ( ingreName.get(1) + ", " + ingreName.get(2)) ) );
		toyList.add( new Toy("키시미시", 5, 15000, "분홍색", 19940505, ( ingreName.get(1) + ", " + ingreName.get(2)) ) );
		toyList.add( new Toy("캣냅", 8, 27000, "보라색", 19960128, ( ingreName.get(1) + ", " + ingreName.get(2)) ) );
		toyList.add( new Toy("파피", 12, 57000, "빨간색", 19931225, ( ingreName.get(1) + ", " + ingreName.get(2) + ", " + ingreName.get(4)) ) );
	}
	
	public void displayMenu() {
		
		int menu = 0;
		
		do {
			
			try {
				
				System.out.println("<< 플레이타임 공장 >>");
				System.out.println("1. 전체 장난감 조회하기");
				System.out.println("2. 새로운 장난감 만들기");
				System.out.println("3. 장난감 삭제하기");
				System.out.println("4. 장난감 제조일 순으로 조회하기");
				System.out.println("5. 연령별 사용가능한 장난감 리스트 조회하기");
				System.out.println("6. 재료 추가");
				System.out.println("7. 재료 제거");
				System.out.println("0. 프로그램 종료");
				System.out.print("메뉴 선택 : ");
				menu = sc.nextInt();
				
				switch(menu) {
				
				case 1 : selectAllToy(); break;
				case 2 : addToy(); break;
				case 3 : deleteToy(); break;
				case 4 : sortByDate(); break;
				case 5 : break;
				case 6 : addIngredient(); break;
				case 7 : deleteIngre(); break;
				case 0 :  break;
				default : System.out.println("메뉴 목록에 있는 번호를 입력해주세요."); 
				
				}
				
			} catch (InputMismatchException e) {
				System.out.println("Error : 입력방식이 올바르지 않습니다. 다시 입력해주세요.");
				sc.nextLine();
				menu = -1;
				
			}
			
		} while (menu != 0);
		
	}
	
	public void selectAllToy() {
		
		System.out.println("< 전체 장난감 목록 >");
		
		if(toyList.size() == 0) {
			System.out.println("제조된 장난감이 없습니다.");
		}
		
		List<Toy> list = new ArrayList<Toy>(toyList);	
		
		for(int i = 0; i < list.size(); i ++) {
			System.out.println( (i + 1) + ". " + list.get(i));
		}
		
		
	}
	
	public void addToy() {
		
		System.out.println("< 새로운 장난감 추가 >");
		System.out.print("장난감 이름 : ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("색상 : ");
		String color = sc.next();
		
		System.out.print("제조일(YYYYMMDD 형식으로 입력) : ");
		int date = sc.nextInt();
		
		String answer = "answer";
		boolean flag = false;
		
		List<String> list = new ArrayList<String>();
		
		while (true) {
			
			System.out.print("재료를 입력하세요(종료하려면 'q'를 입력하세요) : ");
			answer = sc.next();
			 
			if(answer.charAt(0) != 'q' && answer.charAt(0) != 'Q') {
				 
				 list.add(answer);
				
				 
			} else {
				 flag = true;
			}
			
			if(flag) break;
			
		}
		
		toyList.add( new Toy( name, age, price, color, date, list.toString() ) );
	}

	
	public void deleteToy() throws InputMismatchException{
		
		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		String name = sc.next();
		
		List<Toy> list = new ArrayList<Toy>(toyList);
		boolean flag = false;
		
		for(int i = 0; i < list.size(); i ++) {
			
			if(list.get(i).getName().equals(name)) {
				System.out.println( list.get(i) );
				System.out.print(list.get(i).getName() + "을/를 삭제하시겠습니까?(y/n) : ");
				char answer = sc.next().toUpperCase().charAt(0);
				
				if(answer == 'Y') {
					flag = true;
					toyList.remove(list.get(i));
					System.out.println(list.get(i).getName() + "이/가 삭제되었습니다.");
				} else {
					System.out.println("삭제가 취소되었습니다.");
				}
				
			} 
		}
		if(!flag) {
			System.out.println("입력한 이름의 장난감이 존재하지 않습니다.");
		}
	
		
	}
	
	public void sortByDate() {
		
		Set<Toy> sortSet = new TreeSet<Toy>(toyList);
		
		for(Toy sort : sortSet) {
			System.out.println( sort );
		}
		
		
	}
	
	public void sortByAge() {
		
		
		
	}
	
	public void addIngredient() throws InputMismatchException {
		
		System.out.println("<재료 추가>");
		System.out.println("=== 현재 등록된 재료 ===");
		
		Set<Integer> key = ingreName.keySet();	// ingreName 의 키값 반환
		
		for(Integer list : key) {	
			System.out.println(list + " : " + ingreName.get(list) );
		}
		
		System.out.println("========================");
		
		System.out.print("재료 고유번호(key) 입력 : ");
		int keyNum = sc.nextInt();
		
		System.out.print("재료명 입력 : ");
		String addIngre = sc.next();
		
		boolean flag = false;
		
		// 고유번호 중복 확인
		for(Integer list : key) {
			
			if(list == keyNum) {
				flag = true;
				System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
				System.out.print("덮어쓰시겠습니까?(y/n) : ");
				char answer = sc.next().toUpperCase().charAt(0);
				
				if( answer == 'Y' ) {
					
					ingreName.put(keyNum, addIngre);
					
					System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
				} else {
					System.out.println("덮어쓰기를 취소하였습니다.");
				}
			} 
			
		}
		if(!flag) {
			ingreName.put(keyNum, addIngre);
			System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
		}
		
	}
	
	public void deleteIngre() {
		
		System.out.println("<재료 삭제>");
		System.out.println("=== 현재 등록된 재료 ===");
		
		Set<Integer> key = ingreName.keySet();
		
		for(Integer list : key) {
			System.out.println(list + " : " + ingreName.get(list));
		}
		System.out.println("=========================");
		
		System.out.print("삭제할 재료명 입력 : ");
		String name = sc.next();
		
		
		boolean flag = false;
		
		for(int i = 1; i <= ingreName.size(); i ++) {
			
			if(ingreName.get(i).equals(name)) {
				flag = true;
				System.out.println("재료 '" + ingreName.get(i) + "'이/가 성공적으로 제거되었습니다.");
				ingreName.remove(i);
			} 
		}
		if(!flag) {
			System.out.println("해당 이름의 재료가 존재하지 않습니다.");
		}
	}
	
}


























