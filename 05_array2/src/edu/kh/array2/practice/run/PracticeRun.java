package edu.kh.array2.practice.run;

import edu.kh.array2.practice.service.PracticeService;

public class PracticeRun {

	public static void main(String[] args) {
		
		PracticeService ps = new PracticeService();
		
		//ps.practice7();
		//ps.practice8();

		//ps.practice9();    //continue 질문하기

		
		//	반복문 실행 시 continue 아래 부분은 실행하지 않고 반복문 다시 실행
		//	for 문의 경우 증감식으로 이동, while(do~while)문의 경우 조건식으로 이동
		//	전체 반복 중에 특정 조건을 만족하는 경우를 제외하고자 할 때 유용

		ps.practice10();
	}
	
	
	
}
