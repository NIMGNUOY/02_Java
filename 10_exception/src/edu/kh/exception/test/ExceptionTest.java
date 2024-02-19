package edu.kh.exception.test;

import java.util.Arrays;

public class ExceptionTest {

	public static void main(String[] args) {
		
		// 컴파일 에러 => 개발자가 코드 잘못쓴 경우
		// int a = 66.6;	// Type mismatch: cannot convert from double to int
							// 자료형이 맞지 않아 연산 불가하여 "컴파일 에러"가 발생(코드 틀림)
		int a = (int)99.9; 	// 코드로 수정 가능!
		
		// 런타임 에러 => 프로그램 수행 중 발생하는 에러
		//				  주로 'if 문' 으로 처리 가능하다.
		int[] arr = new int[3]; 	// 길이 3 : index 0, 1, 2 
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
//		arr[3] = 40;		// 컴파일 에러 X, 런타임 에러		
							// ArrayIndexOutOfBoundsException : 배열 범위 초과 예외
		
		if( 3 > arr.length ) {		// 배열 인덱스 범위 초과 시
			System.out.println("배열 범위를 초과했습니다.");
		} else {
			System.out.println( Arrays.toString(arr) );
		}
		
		// java.lang.Exception --> 모든 '예외 (Exception)' 클래스의 최상위 부모
		
		// Exception 클래스 --> 객체로 만들어지면 예외가 발생함
		//						java 실행 시 발생하는 예외는 모두 클래스로 작성되어 있음
		
		// unchecked Exception : 선택적 예외처리
		// --> 프로그래머의 부주의로 인한 오류인 경우가 많기 때문에
		//	   예외 처리보다는 코드를 수정해야 하는 경우가 많음
		
		// checked Exception : 예외처리 필수
		
		// *** try ~ catch 문을 이용하여 예외 처리 ***
		// try : Exception (예외)가 발생할 가능성이 있는 코드를 안에 기술
		//		--> 수행 중 예외 발생 시 , 예외 객체가 던져짐(throw)
		
		// catch(던진 것을 받다) : try 에서 던져진 예외를 잡아서 처리
		//						--> 예외를 잡아서 처리했기 때문에 프로그램이 종료되지 않음
		
		// finally : Exception 발생 여부와 관계없이 꼭 처리해야 하는 로직 기술
		
		// 작성법 
//		try {
//			예외발생 가능성있는 코드 기술
//		} catch(ArrayIndexOutOfException e) {
//			System.out.println("배열 범위 초과");
//		} catch(NullPointerException) {
//			수행할 코드; 
//		}
	}
	
}
		
		
























