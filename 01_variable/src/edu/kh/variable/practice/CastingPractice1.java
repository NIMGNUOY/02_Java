package edu.kh.variable.practice;

public class CastingPractice1 {
	
	public static void main (String[] args) {
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 - (2 * iNum2)); // 2
		System.out.println((int)dNum); // 2
		
		System.out.println((double)(2 * iNum2) + (int)dNum); // 10.0
		System.out.println((double)iNum1); // 10.0
		
		System.out.println((double)iNum1 / iNum2);
		System.out.println(dNum);
		
		System.out.println((int)fNum);
		System.out.println(iNum1 / (int)fNum);
		
		System.out.println(iNum1 / fNum); // int -> float 형변환
										// float  : 소수점 아래 8번째 자리까지 연산 후 반올림
		System.out.println((double)iNum1 / fNum); // float -> double 형변환
										// double : 소수점 아래 16번째 자리까지 연산 후 반올림
		
		System.out.println("'" + ch + "'");
		System.out.println((int)ch);
		System.out.println(ch + iNum1);
		System.out.println((char)(ch + iNum1)); // 'A' 가 int 로 형변환 후
												// 65 + 10 의 값이 다시 char 로 형 변환
		
		
		
	}
	
}
