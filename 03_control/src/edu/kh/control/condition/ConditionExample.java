package edu.kh.control.condition;

import java.util.Scanner; // 다른 패키지에 있는 클래스가 필요할 때

public class ConditionExample {  // 기능 제공용 클래스

	Scanner sc = new Scanner(System.in); // 전역 변수

	public void ex1() {
		
		// if 문
		// 조건식이 true 일때만 내부 코드 실행
		
		/*
		 * [작성법]
		 * if (조건식) {
		 * 		조건식이 true 일 때 수행할 코드
		 * } else {
		 * 		조건식이 false 일 때 수행할 코드
		 * }
		 * 
		 */
		
		// 입력받은 정수가 양수인지 검사
		// 양수라면 "양수입니다" 출력
		
		System.out.print("입력값 : ");
		
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수입니다");
		} else {
			System.out.println("양수가 아닙니다");
		}
		
	}
	
	public void ex2() {
		
		// if - else 문
		// 조건식 결과가 true 이면 if 문 수행,
		// false 이면 else 구문 수행
		
		/*
		 * [작성법]
		 * if (조건식) {
		 *		조건식이 true 일 때 수행될 코드 
		 * } else {
		 * 		조건식이 false 일 때 수행될 코드
		 * }
		 * 
		 */
		
		// 홀짝 검사
		// 입력받은 정수 값이 홀수 이면 "홀수입니다" 출력
		// 					  0 이면 "0입니다" 출력
		//					  짝수 이면 "짝수입니다" 출력
		// else if 사용 X, 중첩 if 문 사용하기
		
		System.out.print("입력값 : ");
		int num = sc.nextInt();
		
		if (num == 0) {
			System.out.println("0 입니다");
		} if (num % 2 == 0) {
			System.out.println("짝수 입니다");
		} else {
			System.out.println("홀수 입니다");
		}
	}
	
	public void ex3() {
		// 양수, 음수, 0 판별
		// if - else if - else 사용
		
		System.out.print("입력값 : ");
		int num = sc.nextInt();
		
		if (num == 0) {
			System.out.println("0 입니다");
		} else if (num > 0 ) { // 바로 위에 if 문이 false 인 경우 수행
			System.out.println("양수 입니다");
		} else {
			System.out.println("음수 입니다");
		}
	}
	
	public void ex4() {
		
		// 달(month)을 입력 받아 해당 달에 맞는 계절 출력
		// 단, 겨울일 때 온도가 -15도 이하 "한파 경보"
		// 						-12도 이하 "한파 주의보"
		// 여름일 때 온도가 35도 이상 "폭염 경보",
		//					33도 이상 "폭염 주의보"
		// 1 ~ 12 사이가 아닐 땐 "해당하는 계절이 없습니다" 출력
		// 1,2,12 겨울
		// 3~5 봄
		// 6~8 여름
		// 9~11 가을
		
		System.out.print("달(month) 입력 : ");
		int month = sc.nextInt();
		
		
		if (month > 12 || month < 1 ) {
			
			System.out.println("해당하는 계절이 없습니다");
			
		} else if (month == 12 || month <= 2) {
			
			System.out.print("온도(temperature) : ");
			int temp = sc.nextInt();
			
			System.out.print("겨울");
			
			if(temp <= -15) {
				
				System.out.println(" 한파 경보");
				
			} else if (temp <= -12) {
				
				System.out.println(" 한파 주의보");
				
			}
			
		} else if (month >= 3 && month <= 5) {
			
			System.out.println("봄");
			
		} else if (month >= 6 && month <= 8) {
			
			System.out.print("온도(temperature) : ");
			int temp = sc.nextInt();
			
			System.out.print("여름");
			
			if(temp >= 35) {
				
				System.out.println(" 폭염 경보");
				
			} else if (temp >= 33) {
				
				System.out.println(" 폭염 주의보");
			}
			
		} else {
			
			System.out.println("가을");
		}
		
	}
	
	public void ex5() {
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String str;
		
		if(age <= 13) {
			str = "어린이";
		} else if (age > 13 && age <= 19) {
			str = "청소년";
		} else {
			str = "성인";
		}
		
		System.out.println(str + " 입니다");
		
	}
	
	public void ex6() {
		
		System.out.print("점수 입력(0~100) : ");
		int input = sc.nextInt();
		
		if(input >= 90 && input <= 100) {
			System.out.println("A");
		} else if (input >= 80 && input < 90) {
			System.out.println("B");
		} else if (input >= 70 && input < 80) {
			System.out.println("C");
		} else if (input >= 60 && input < 70) {
			System.out.println("D");
		} else if (input >=0 && input < 60) {
			System.out.println("F");
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
		
	}
	
	public void ex7() {
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		if(age < 12) {
			System.out.println("적정 연령이 아닙니다");
		} else if (age < 0 || age > 100) {
			System.out.println("잘못 입력 하셨습니다");
		} else {
			System.out.print("키 : ");
			
			double height = sc.nextDouble();
			
			if(height >= 140.0) {
				System.out.println("탑승 가능");
			} else {
				System.out.println("적정 키가 아닙니다");
			}
		}
		
	}
	
	public void ex8() {
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		if(age < 0 || age > 100) {
			
			System.out.println("나이를 잘못 입력 하셨습니다");
			
		}
		
		if(height < 0 || height > 250.0) {
			
			System.out.println("키를 잘못 입력 하셨습니다");
			
		}
		
		if (age >= 12 && age <= 100) {
			
			if(height >= 0 && height < 140) {
				System.out.println("나이는 적절하나, 키가 적절치 않음");
			} else if (height >= 140 && height <= 250.0){
				System.out.println("탑승 가능");
			}
			
		} else if (age >= 0 && age < 12){
			
			if(height >= 0 && height < 140) {
				System.out.println("나이와 키 모두 적절치 않음");
			} else if (height >= 140 && height <= 250.0) {
				System.out.println("키는 적절하나, 나이가 적절치 않음");
			}
		}
			
		
	}
	
}


























