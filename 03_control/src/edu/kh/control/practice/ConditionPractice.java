package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		if (input <= 0) {
			System.out.println("양수만 입력해주세요.");
		} else if (input % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
	}
	
	public void practice2() {
		
		System.out.print("국어점수 : ");
		int v1 = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int v2 = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int v3 = sc.nextInt();
		
		if ( v1 < 40 || v2 < 40 || v3 < 40 || ((v1 + v2 + v3) / 3) < 60) {
			System.out.println("불합격입니다.");
		} else {
			System.out.println("국어 : " +v1);
			System.out.println("수학 : " +v2);
			System.out.println("영어 : " +v3);
			System.out.println("합계 : " + (v1+v2+v3));
			System.out.printf("평균 : %.1f\n", (float)(v1+v2+v3)/3 );
			System.out.println("축하합니다, 합격입니다");
			
		}
	}
	/*
	public void practice3 () {
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int input = sc.nextInt();
		
		if (input < 1 || input > 12) {
			System.out.printf("%d월은 잘못 입력된 달입니다.", input);
		} else if (input <= 7) {
			
			if(input % 2 == 1) {
				System.out.printf("%d월은 31일까지 있습니다.",input);
			} else {
				System.out.printf("%d월은 30일까지 있습니다.",input);
			}
		} else if (input >= 8) {
			
			if(input % 2 == 0) {
				System.out.printf("%d월은 31일까지 있습니다.",input);
			} else {
				System.out.printf("%d월은 30일까지 있습니다.",input);
			}
		}
	}
	*/
	
	public void practice3() {
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int input = sc.nextInt();
		
		switch (input) {
		
		case 1,3,5,7,8,10,12 : System.out.printf("%d월은 31일까지 있습니다.",input); break;
		case 2,4,6,9,11 : System.out.printf("%d월은 30일까지 있습니다.",input); break;
		default:  System.out.printf("%d월은 잘못 입력된 달입니다.",input); break;
		}
	}
	
	public void practice4() {
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double BMI = weight / (height * height);
		
		if(BMI < 18.5) {
			System.out.printf("BMI 지수 : %.14f\n저체중", BMI);
		} else if (BMI >= 18.5 && BMI < 23) {
			System.out.printf("BMI 지수 : %.14f\n정상체중",BMI);
		} else if (BMI >= 23 && BMI < 25) {
			System.out.printf("BMI 지수 : %.14f\n과체중",BMI);
		} else if (BMI >= 25 && BMI < 30) {
			System.out.printf("BMI 지수 : %.14f\n비만", BMI);
		} else if (BMI >= 30) {
			System.out.printf("BMI 지수 : %.14f\n고도 비만", BMI);
		}
		
	}
	
	public void practice5() {
		
		System.out.print("중간 고사 점수 : ");
		int input1 = sc.nextInt();
		double v1 = 0.2 * input1;
		
		System.out.print("기말 고사 점수 : ");
		int input2 = sc.nextInt();
		double v2 = 0.3 * input2;
		
		System.out.print("과제 점수 : ");
		int input3 = sc.nextInt();
		double v3 = 0.3 * input3;
		
		System.out.print("출석 횟수 : ");
		int input4 = sc.nextInt();
		double v4 = input4;
		
		// 중간고사 점수 : 점수 * 0.2
		// 기말고사 점수 : 점수 * 0.3
		// 과제 점수 : 점수 * 0.3
		// 출석 횟수 점수 : 출석횟수
		System.out.printf("중간 고사 점수(20) : %.1f\n", v1);
		System.out.printf("기말 고사 점수(30) : %.1f\n", v2);
		System.out.printf("과제 점수(20) : %.1f\n", v3);
		System.out.printf("출석 점수(20) : %.1f\n", v4);
		System.out.printf("총점 : %.1f\n", (v1+v2+v3+v4));
		
		if ((v4 / 20) < 0.7) {
			
			System.out.printf("Fail [출석횟수 부족 (%d/20)]\n" , input4);
			
		} else if ((v1+v2+v3+v4) < 70) {
			
			System.out.println("Fail [점수 미달]");
			
		} else {
			
			System.out.println("Pass");
			
		}
		
	}
}





























