package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService {

	// 속성(필드)
	private Scanner sc = new Scanner(System.in);
	
	private Member memberInfo = null; // 가입한 회원의 정보를 저장할 변수
										// Stack 영역에 저장
	private Member loginMember = null;// 로그인한 회원의 정보를 저장할 변수
										// Stack 영역에 저장
	
	// 기능(생성자, 메서드)
	
	// 메뉴 화면 출력 기능
	public void displayMenu() {
		
		int menuNum = 0; // 메뉴 선택용 변수
		
		do { // 무조건 한번은 반복
			
			System.out.println("========회원 정보 관리 프로그램========");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거용
			
			switch(menuNum) {
			case 1 : System.out.println( signUp() ); break;
			case 2 : System.out.println( login() ); break;
			case 3 : System.out.println( selectMember() ); break;
			case 4 : 
				int result = updateMember();   // updateMember 메서드가 반환하는 
												// 값을 result 변수에 대입
				if(result == -1) {
					System.out.println("로그인 후 이용해주세요");
				} else if (result == 0) {
					System.out.println("회원정보 수정 실패(비밀번호 불일치)");
				} else {  // result == 1
					System.out.println("회원정보가 수정되었습니다");
				}
			
				
				break;
			case 0 : System.out.println("프로그램 종료"); break;
			default : System.out.println("잘못 입력하셨습니다. 메뉴에 있는 번호만 입력해주세요");
			}
			
		} while (menuNum != 0);  // menuNum 이 0 이면 반복 종료
	}
	
	// 회원 가입 기능
	public String signUp() {
		  // 반환형
		  // 해당 메서드는 끝나고 호출한 곳으로 돌아갈 때
		  // String 자료형 값을 가지고 돌아간다
		
		System.out.println("\n******** 회원 가입 ********");
		
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		System.out.print("비밀번호 확인 : ");
		String pw2 = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		// 비밀번호, 비밀번호 확인이 일치하면 회원가입
		// 일치하지 않으면 회원가입 실패
		if( pw.equals(pw2) ) {  // 일치하는 경우
			
			// 입력받은 정보를 이용해서 Member 객체를 생성한 후 
			// 생성된 객체의 주소를 필드에 있는 memberInfo 에 대입
			
			memberInfo = new Member(id, pw, name, age);
			// Heap 영역에 Member 객체 생성
			// Member 객체 생성 후 memberInfo 에 Member 객체 주소값 대입
			
			return "회원가입 성공";
			
		} else {  // 일치하지 않는 경우
			
			return "회원가입 실패 (비밀번호 불일치)";
		}
		
		
	}
	
	// 로그인 기능
	public String login() {
		
		System.out.println("\n********* 로그인 ********");
		
		// 회원가입을 했는지부터 확인
		// == memberInfo 가 객체를 참조하고 있는지 확인(null 인지 아닌지 확인)
		if(memberInfo == null) {   // 회원가입을 먼저 안한 경우
			// null : 아무것도 참조하고 있지 않음
			return "회원가입부터 진행해주세요";
		}
		
		// 회원가입을 했다면, 로그인 기능 수행
		
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 입력 : ");
		String pw = sc.next();
		
		// 회원가입 정보(memberInfo 가 참조하는 Member 객체)에서 
		// 저장된 아이디, 비밀번호가 입력받은 아이디, 비밀번호와 
		// 같으면 로그인 성공 , 
		// 같지 않으면 "아이디 또는 비밀번호가 일치하지 않습니다" 리턴
		
		// 아이디, 비밀번호 모두 일치할 경우
		if(id.equals(memberInfo.getMemberId()) && pw.equals(memberInfo.getMemberPw())) {
			// 입력받은 id 와 
			// memberInfo 필드에서 참조중인 Member 객체의 id 가 같은지 확인
			// &&
			// 입력받은 pw 와 
			// memberInfo 필드에서 참조중인 Member 객체의 pw 가 같은지 확인
			
			// loginMember 에 Member 객체 주소 대입
			loginMember = memberInfo;
			// 참조형 = Member 객체 주소(얕은 복사)
			
			// 회원가입 정보를 loginMember에 대입하여 
			// 어떤 회원이 로그인했는지를 구분할 수 있게 함.
			return loginMember.getMemberName() + "님 환영합니다";
			
		} else {
			
			return "아이디 또는 비밀번호가 일치하지 않습니다";
			
		}
		
	}
	
	// 회원 정보 조회 기능
	public String selectMember() {
		
		// 1) 로그인 여부 확인
		// 로그인 안했을 때 "로그인 후 이용해주세요" 리턴
		
		// 2) 로그인이 되어있는 경우 
		// 회원정보를 출력할 문자열을 만들어서 반환(return)
		// 단, 비밀번호는 제외
		
		// 이름 : 홍길동
		// 아이디 : user01
		// 나이 : 25세
		
		if(loginMember == null) {
			return "로그인 후 이용해주세요";
		} else {
			
			return "이름 : " + loginMember.getMemberName() + "\n" + 
				   "아이디 : " + loginMember.getMemberId() + "\n" + 
				   "나이 : " + loginMember.getMemberAge() + " 세";
					
		}
		
		
	}
	
	// 회원 정보 수정 기능
	public int updateMember() {
		
		System.out.println("\n**********회원정보 수정*********");
		
		// 1) 로그인 여부 판별
		// 로그인이 되어있지 않으면 -1 반환(return)
		if(loginMember == null) {
			return -1 ;
		}
		
		// 2) 로그인이 되어있을 때 
		// 2-1) 수정할 회원정보 입력받기 (이름, 나이)
		System.out.print("수정할 이름 입력 : ");
		String inputName = sc.next();
		
		System.out.print("수정할 나이 입력 : ");
		int inputAge = sc.nextInt();
		
		// 2-2) 비밀번호를 입력받아 로그인한 회원의 비밀번호와 일치하는지 확인
		// 비밀번호가 일치할 경우, 로그인한 회원의 이름 / 나이를
		// 입력받은 값으로 변경 후 1 반환(return)
		// -> 비밀번호가 다를 경우 0 반환(return)
		System.out.print("비밀번호 확인 : ");
		String inputPw = sc.next();
		
		if(inputPw.equals(loginMember.getMemberPw())) {
			loginMember.setMemberName(inputName);
			loginMember.setMemberAge(inputAge);
			return 1;
		} else {
			return 0;
		}
		
		
	}
	
}


















