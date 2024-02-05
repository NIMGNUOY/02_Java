package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {

	Scanner sc = new Scanner(System.in);
	
	/*
	 * for 문 
	 * - 끝이 정해져 있는 (횟수가 지정되어 있는) 반복문
	 * 
	 * [작성법]
	 * 
	 * for (초기식; 조건식; 증감식) {
	 * 		조건식이 true 라면 반복 수행할 코드
	 * }
	 * 
	 * - 초기식 : for 문을 제어하는 용도의 변수 선언
	 * - 조건식 : for 문의 반복 여부를 지정하는 식
	 * 			 보통 초기식에 사용된 변수를 이용하여 조건식 작성
	 * - 증감식 : 초기식에 사용된 변수를 for 문이 끝날 때마다
	 * 			증가 또는 감소시켜 조건식의 결과를 변하게 하는 식
	 * 
	 */
	
	public void ex1() {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
	}
	
	public void ex2() {
		
		// 1부터 입력받은 수까지 1씩 증가하며 출력
		
		System.out.print("입력값 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		
	}
	
	public void ex3() {
		
		// 영어 알파벳 A 부터 Z까지 한 줄로 출력
		// ABCDEFG .... XYZ
		
		// char 자료형은 문자형이지만 실제로 정수(문자표 번호)를 저장한다
		
		for (int i = 'A'; i <= 'Z'; i++) {
			
			System.out.print((char)i);  // char 자료형으로 강제 형변환
			
		}
		
		System.out.println("\n-------------------------------");
		
		for (char i = 'A'; i <= 'Z'; i++) { // 변수를 char 로 줌
			
			System.out.print(i);  // 강제 형변환 할 필요 X
			
		}
	}
	
	public void ex4() {
		
		// 정수 5개를 입력 받아서 합계 구하기
		
		// ex ) 
		// 입력 1 : 10
		// 입력 2 : 20
		// 입력 3 : 30
		// 입력 4 : 40
		// 입력 5 : 50
		// 합계  : 150
		
		
		int sum = 0;
		
		for (int i = 1; i <= 5; i++) {
			
			System.out.print("입력 " + i + " : ");
			int value = sc.nextInt();
			
			sum += value;
			
			
		}
		
		System.out.printf("합계 : %d\n", sum );
		
		
	}
	
	public void ex5() {
		
		// 1~20 까지 1씩 증가하면서 출력
		// 단, 입력받은 수의 배수는 양쪽에 () 표시
		
		// ex)
		// 괄호를 표시할 배수 : 3
		// 1 2 (3) 4 5 (6) 7 ... (18) 19 20
		System.out.print("괄호를 표시할 배수 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= 20; i ++) {
			
			if(i % input == 0) {
				
				System.out.print("(" + i + ") ");
				
			} else {
				
				System.out.print(i + " ");
				
			}
		
		}
		
	}
	
	public void ex6() {
		
		// [구구단 출력]
		// 2 ~ 9 사이의 수를 하나 입력받아
		// 해당 단을 출력
		// 단, 입력받은 수가 2 ~ 9 사이 숫자가 아니면
		// "잘못 입력하셨습니다" 출력
		
		/* 단 입력 : 5
		 * 5 X 1 = 5
		 * 5 X 2 = 10
		 * 5 X 3 = 15
		 * 5 X 4 = 20
		 * 5 X 5 = 25
		 * 5 X 6 = 30
		 * 5 X 7 = 35
		 * 5 X 8 = 40
		 * 5 X 9 = 45 
		 */
		
		System.out.print("단 입력 : ");
		int num = sc.nextInt();
		
		if (num < 1 || num > 9) {
			
			System.out.println("잘못 입력하셨습니다");
			
		} else {
			
			for(int i = 1; i <= 9; i++) {
				
				System.out.println(num + " X "+ i + " = " + (num * i));
				
			}
		}
		
	}
	
	public void ex7() {
		
		// 구구단 모두 출력하기
		
		for (int x = 2; x <= 9; x++) {
			
			
			for (int y = 1; y <= 9; y++) {

				if ( x * y < 10) {
					
					System.out.printf("%d X %1d = %2d   ", x, y, x * y);
					
				} else {
					
					System.out.printf("%d X %1d = %2d   ", x, y, x * y);
					
				}
				
			}
			System.out.println();
			
		}
		
		System.out.println("\n역순출력=============================================================");
		
		for (int x = 9; x >= 2; x--) {
			
			
			for (int y = 1; y <= 9; y++) {

				if ( x * y < 10) {
					
					System.out.printf("%d X %1d = %2d   ", x, y, x * y);
					
				} else {
					
					System.out.printf("%d X %1d = %2d   ", x, y, x * y);
					
				}
				
			}
			System.out.println();
			
		}
	}
	
	public void ex8() {
		
		// 숫자 세기 count
		
		// 1부터 20까지 1씩 증가하면서
		// 입력받은 수의 배수의 총 개수 출력
		// 입력받은 수의 배수의 합계 출력
		
		// 배수 입력 : 3
		// 3 6 9 12 15 18 : 6개
		// 3의 배수 합계 : 63
		
		System.out.print("배수 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= 20; i++) {
			
			if(i % num == 0) {
				
				System.out.print(i + " ");
				
				sum += i;
			}
			
			
		}
		System.out.printf(" : %d개\n", 20/num);
		System.out.println(num + "의 배수의 합계 : " + sum);
	}
	
}




























