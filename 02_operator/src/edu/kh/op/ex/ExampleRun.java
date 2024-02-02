package edu.kh.op.ex;


public class ExampleRun { // 코드 실행용 클래스
	
	// main 메서드 필수 작성
	public static void main(String[] args) {
		
		// OpExample 생성 
		// -> OpExample 이라는 클래스(설계도)를
		//	이용해서 객체 생성을 하는데, 그 객체
		//	이름이 ex 이다
		
		
		OpExample ex = new OpExample();
		// 같은 package(edu.kh.op.ex)에 
		// 있기 때문에 따로 import 해줄 필요 X
		
		// 다른 package 에 있다면 import 작성!
		
		ex.ex1(); // ex 가 가지고 있는 ex1()
				  // 메서드를 실행
		
		ex.ex2();
		
		ex.ex3();
		
		ex.ex4();
	}

}
