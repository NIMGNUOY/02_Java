package com.kh.variable.practice2;

import java.util.Scanner;

public class Practice3 {
	
	public void ex4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double score1 = sc.nextDouble();
		
		System.out.print("수학 : ");
		double score2 = sc.nextDouble();
		
		System.out.print("영어 : ");
		double score3 = sc.nextDouble();
		
		System.out.printf("총 점수는 : %d점 입니다.\n", (int)(score1 + score2 + score3));
		
		System.out.printf("평균 점수는 : %d점 입니다.\n",(int)((score1 + score2 + score3) / 3) );
		
	}

	
	public void ex5() {
		
		// sc.next() 와 sc.nextLine() 의 차이
		
		// next() : 띄어쓰기 입력불가, 띄어쓰기를 
		//			구분인자로 생각해서 각각 저장
		// -> 안녕하세요(O), 안녕 하세요(X)
		// nextLine() : 문자열에 띄어쓰기 가능,
		//				줄 구분까지 저장
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 1 : ");
		String input1 = sc.nextLine();
		// '안녕 하세요' 출력
		
		System.out.print("문자열 입력 2 : ");
		String input2 = sc.next();
		// 띄어쓰기 X --> '안녕' 출력
		
		System.out.println(input1);
		System.out.println(input2);
		
	}
	
	
	public void ex6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input1 = sc.nextInt();
		// nextInt(), next(), nextDouble()...
		// 뒤에 sc.nextLine() 사용 시
		
		sc.nextLine(); // 입력버퍼에 남은 
					   // 개행문자 제거 필수!!
		
		System.out.println(input1);
		
		System.out.print("문자열 입력 : ");
		String input2 = sc.nextLine();
		
		System.out.println(input2);
		
	}
}