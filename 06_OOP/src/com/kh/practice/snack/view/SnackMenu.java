package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {

	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
		
	
	public void menu() {
		
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String kindInput = sc.next();
		
		System.out.print("이름 : ");
		String nameInput = sc.next();
		
		System.out.print("맛 : ");
		String flavorInput = sc.next();
		
		System.out.print("개수 : ");
		int numOfInput = sc.nextInt();
		
		System.out.print("가격 : ");
		int priceInput = sc.nextInt();
		
		System.out.println( scr.saveData(kindInput, nameInput, flavorInput, numOfInput, priceInput) );
		
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
		char chInput = sc.next().charAt(0);
		
		if(chInput == 'y' || chInput == 'Y') {
			
			System.out.println( scr.confirmData() );
		}
	}
		
	
}

