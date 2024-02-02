package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int input1 = sc.nextInt();
		System.out.print("사탕 개수: ");
		int input2 = sc.nextInt();
		
		System.out.printf("1인당 사탕 개수 : %d\n", input2 / input1);
		System.out.printf("남는 사탕 개수 : %d\n", input2 % input1);
		
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String input1 = sc.next();
		
		System.out.print("학년 : ");
		int input2 = sc.nextInt();
		
		System.out.print("반 : ");
		int input3 = sc.nextInt();
		
		System.out.print("번호 : ");
		int input4 = sc.nextInt();
		
		System.out.print("성별 : ");
		String input5 = sc.next();
		
		System.out.print("성적 : ");
		float input6 = sc.nextFloat();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다\n", input2, input3, input4, input1, input5, input6);
		
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int input1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int input2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int input3 = sc.nextInt();
		
		System.out.printf("합계 : %d\n", input1 + input2 + input3);
		System.out.printf("평균 : %.1f\n", (float)(input1 + input2 + input3) / 3);
		
		boolean result = (input1 >= 40) && (input2 >= 40) && (input3 >= 40) && ((input1 + input2 + input3) / 3 >= 60); 
		// 논리값 여러개 작성 가능
		System.out.println(result ? "합격" : "불합격");
		
	}

}
