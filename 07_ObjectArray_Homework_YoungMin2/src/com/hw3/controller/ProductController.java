package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;


public class ProductController {
	
	private Product[] pro = null;
	
	public static int count = 0;  // 클래스명.변수명
	
	Scanner sc = new Scanner(System.in);
	
	{
		pro = new Product[10];  // 초기화 블럭 이용하여 10개의
								// Product 배열 크기 할당
	}
	
	
	public void mainMenu() {
		
		int menuNum = 0;
		
		do {
			
			System.out.println("====제품 관리 메뉴====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			
			
			switch(menuNum) {
			case 1 : productInput(); break;
			case 2 : productPrint(); break;
			case 0 : System.out.println("프로그램 종료");break;
			default : System.out.println("메뉴입력이 잘못되었습니다. 다시 선택해주십시오"); break;
			}
			
		} while(menuNum != 0);
		
	}
	
	public void productInput() {
		
		
		
		System.out.print("제품번호 : ");
		int inputPid = sc.nextInt();
		
		sc.nextLine(); // 입력버퍼에 있는 개행문자 제거
		
		System.out.print("제품명 : ");
		String inputPname = sc.nextLine();
		
		System.out.print("제품가격 : ");
		int inputPrice = sc.nextInt();
		
		System.out.print("제품세금 : ");
		double inputTax = sc.nextDouble();
		
		pro[count] = new Product(inputPid, inputPname,
				inputPrice, inputTax);
		
		
		
	}
	
	public void productPrint() {
		
		for(int i = 0; i < count; i ++) {
			System.out.println(pro[i].information());
		}
		
	}
	
}

