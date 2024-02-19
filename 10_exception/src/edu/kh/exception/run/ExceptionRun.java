package edu.kh.exception.run;

import edu.kh.exception.model.service.ExceptionService;

public class ExceptionRun {

	public static void main(String[] args) {
		
		ExceptionService es = new ExceptionService();
		
		//es.ex1();
		// num1 / 0 --> ArithmeticException(산술적 예외) 발생
		//				('0' 으로 나눌 수 없다.)
		
		//es.ex2();
		// num1 / 0 --> ArithmeticException(산술적 예외) 발생
		//				('0' 으로 나눌 수 없다.)
		// String / String --> InputMismatchException
		
		//es.ex3();
		
		es.ex4();
	
	}
	
}














