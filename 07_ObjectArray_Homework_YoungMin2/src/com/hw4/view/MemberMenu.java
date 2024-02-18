package com.hw4.view;

import java.util.Scanner;

import javax.annotation.processing.AbstractProcessor;

import com.hw4.controller.MemberController;
import com.hw4.model.vo.Member;

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
			//case 6 : sortMember(); break;
			case 0 : System.out.println("프로그램 종료"); break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요"); break;
			}
			
		} while (selectNum != 0);
		
	}
	
	public void insertMember() {
		
		if(mc.getMemberCount() >= mc.SIZE) {
			System.out.println("회원 수를 초과했습니다");
			return;
			
		} 
		
		System.out.println("===== 신규 회원 등록 =====");
		System.out.print("아이디 입력 : ");
		String inputId = sc.next();
		
		Member m = mc.checkId(inputId);
		
		if( m != null) {
			System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
		} else {		// m == null 인 경우
			
			
			System.out.print("비밀번호 입력 : ");
			String inputPwd = sc.next();
			
			System.out.print("이름 입력 : ");
			String inputName = sc.next();
			
			System.out.print("나이 입력 : ");
			int inputAge = sc.nextInt();
			
			System.out.print("성별 입력 : ");
			char inputGender = sc.next().charAt(0);
			
			System.out.print("이메일 입력 : ");
			String inputEmail = sc.next();
			
			mc.insertMember(new Member (inputId, inputPwd, inputName,inputAge, inputGender, inputEmail) );
			System.out.println("성공적으로 회원 등록이 되었습니다.");
		}
		
		
		
		
	}
	
	public void searchMember() {
		
		
		
		while (true) {
			
			System.out.println("==== 회원 정보 검색 ====");
			System.out.println("1. 아이디로 검색");
			System.out.println("2. 이름으로 검색");
			System.out.println("3. 이메일로 검색");
			System.out.println("9. 이전 메뉴로");
			System.out.printf("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			if(menu == 9) {
				
				mainMenu();
				break;
				
			} else {
				
				System.out.print("검색내용 : ");
				String search = sc.next();
				
				
				mc.searchMember(menu, search);
				
				if(mc.searchMember(menu, search) == null) {
					System.out.println("검색결과가 없습니다");
				} else {
					System.out.println( mc.searchMember(menu, search).information() );
					break;
				}
			}
			
			
		}
		
	}
	
	public void updateMember() {
		
		while(true) {
			
			System.out.println("===== 회원 정보 수정 ====");
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 이름 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("9. 이전 메뉴로");
			System.out.print("메뉴 선택 : ");
			int num = sc.nextInt();
			
			if(num == 9) {
				mainMenu();
				break;
			}
			
			System.out.print("변경할 회원 아이디 : ");
			String userId = sc.next();
			
			Member m = mc.checkId(userId);
			
			if(m == null) {
				System.out.println("변경할 회원이 존재하지 않습니다.");
			} else {
				System.out.println( m.information() );
				
				System.out.println("==== 변경 내용 ====");
				System.out.print("변경 내용 : ");
				String update = sc.next();
				
				mc.updateMember(m, num, update);
				System.out.println("회원 정보가 변경되었습니다.");
			}
			
		}
}
	public void deleteMember() {
		
		System.out.print("삭제할 회원 아이디 : ");
		String deleteId = sc.next();
		
		Member m = mc.checkId(deleteId);
		
		if(m == null) {
			System.out.println("삭제할 회원이 존재하지 않습니다.");
		} else {
			System.out.println("기존 정보 : " + m.information() );
			System.out.print("정말 삭제하시겠습니까? (y/n) : ");
			char answer = sc.next().charAt(0);
			
			if(answer == 'y' || answer == 'Y') {
				mc.deleteMember(deleteId);
				System.out.println("회원 정보가 삭제되었습니다.");
			}
			
		}
		
	}
	
	public void printMember() {
		
		Member[] m = mc.getMem();
		
		for(int i = 0; i < mc.getMemberCount(); i ++) {
			
			System.out.println( m[i].information() );
		}
		
	}
	/*
	public void sortMember() {
		
		Member[] sortMem = null;		// 정렬 결과를 받아줄 객체 배열 초기화
		
		while(true) {
			
			System.out.println("==== 회원 정보 정렬 ====");
			System.out.println("1. 아이디 오름차순 정렬");
			System.out.println("2. 아이디 내림차순 정렬");
			System.out.println("3. 나이 오름차순 정렬");
			System.out.println("4. 나이 내림차순 정렬");
			System.out.println("5. 성별 내림차순 정렬");
			System.out.println("9. 이전 메뉴로");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			
			case 1 : mc.sortIdAsc(); break;
			case 2 : mc.sortIdDesc(); break;
			case 3 : mc.sortAgeAsc(); break;
			case 4 : mc.sortAgeDesc(); break;
			case 5 : mc.sortGenderDesc(); break;
			case 9 : mainMenu(); break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
			
			}
			
		}
		
	}
	*/
}

















