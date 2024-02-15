package com.hw4.view;

import java.util.Scanner;

import com.hw4.controller.MemberController;

public class MemberMenu {

	private MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		int selectNum = 0;
		
		do {
			
			System.out.println("===== 회원 관리 메뉴 =====");
			System.out.println("1. 신규 회원 등록"); // insertMember()
			System.out.println("2. 회원 정보 검색"); // searchMember()
			System.out.println("3. 회원 정보 수정"); // updateMember()
			System.out.println("4. 회원 정보 삭제"); // deleteMember()
			System.out.println("5. 회원 정보 출력"); // printMember()
			System.out.println("6. 회원 정보 정렬"); // sortMember()
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			selectNum = sc.nextInt();
			
			switch(selectNum) {
			
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : printMember(); break;
			case 6 : sortMember(); break;
			case 0 : System.out.println("프로그램 종료"); break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요"); break;
			}
			
		} while (selectNum != 0);
		
	}
	
	public void insertMember(String inputId, String inputPwd, String inputName, 
			int inputAge, char inputGender, String inputEmail) {
		
		if(mc.getMemberCount() > mc.SIZE) {
			return;
		}
		
		System.out.println("===== 신규 회원 등록 =====");
		System.out.print("아이디 입력 : ");
		inputId = sc.next();
		
		
	}
	
	public void searchMember() {
		
	}
	
	public void updateMember() {
		
	}
	
	public void deleteMember() {
		
	}
	
	public void printMember() {
		
	}
	
	public void sortMember() {
		
	}
	
}
