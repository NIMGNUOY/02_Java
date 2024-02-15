package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {
	

	public static void main(String[] args) {
		
		
		Student[] students = new Student[3];
		students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		// 향상된 for 문
		for(Student std : students) {   // 배열의 길이만큼 반복
			System.out.println( std.information() );
		}
		
		/*
		for(int i = 0; i < std.length; i ++) {
			System.out.println( std[i].information() );
		}
		*/
		System.out.println("================================================================================================");
		
		Employee[] emp = new Employee[10];
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(true) {
			
			
			System.out.println("사원 정보 입력");
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			
			System.out.print("부서 : ");
			String dept = sc.next();
			
			emp[count]= new Employee(name, age, height, weight, salary, dept);
			count ++;
			
			System.out.print("추가할 사원 정보가 있습니까?(y/n) : ");
			String str = sc.next().toUpperCase();   // toUpperCase() --> 받은 문자를 대문자로 바꿔줌
			
			if(str.equals("N")) break;
			
			
		}
		
		// 현재까지 기록된 사원들의 정보를 모두 출력
		for(Employee empInfo : emp) {
			
			// NullPointerException -> empInfo 배열의 0 , 1 번째 index 를 제외한 2 ~ 9 번
			//						   index 가 null 값이기 때문에 에러
			if(empInfo == null) break;
								  
			
			System.out.println( empInfo.information() );
		}
		
		
	}
			
	
}









