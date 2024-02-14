package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product2;

public class ProductController2 {

	private Product2[] pro = null;
	public static int count = 0;
	Scanner sc = new Scanner(System.in);
	
	{
		pro = new Product2[10];
	}
	
	public void mainMenu() {
		
		int num = 0;
		
		do {
			
			System.out.println("====제품 관리 메뉴====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
			num = sc.nextInt();
			
			switch(num) {
			
			case 1 : productInput(); break;
			case 2 : productPrint(); break;
			case 0 : System.out.println("프로그램 종료"); break;
			default : System.out.println("메뉴 선택이 잘못되었습니다. 다시 선택해주세요."); break;
 			}
			
		} while (num != 0);
		
	}
	
	public void productInput() {
		
		System.out.print("제품번호 : ");
		int pId = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("제품명 : ");
		String pName = sc.nextLine();
		
		System.out.print("제품가격 : ");
		int price = sc.nextInt();
		
		System.out.print("제품세금 : ");
		double tax = sc.nextDouble();
		
		pro[count] = new Product2(pId, pName, price, tax);
		
	}
	
	public void productPrint() {
		
		for(int i = 0; i < count; i++) {
			System.out.println( pro[i].information() );
		}
		
	}
}
