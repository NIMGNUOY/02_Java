package edu.kh.inheritance.model.dto;

// 상속 계층 구조
// Object
//    ㄴ Person
//          ㄴEmployee ㄴ Student
//				  ㄴ GrandChild1
public class GrandChild1 extends Employee{ 
				// final 예약어로 만든 class는 상속 불가
	
	// final 메서드 확인(오버라이딩 불가)
	/*
	@Override
	public void onlyEmployee() {
		// Cannot override the final method from Employee
		// final 예약어로 만든 메서드는 오버라이딩 불가
	}
	*/
	
}
