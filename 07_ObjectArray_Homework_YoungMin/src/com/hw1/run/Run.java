package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		// 1. 객체배열을 크기를 3으로 할당 한 뒤 3개의 생성자를 이용하여 각각 생성한 후 출력
		Employee[] emp = new Employee[3];
		
		emp[0] = new Employee();  // 기본 생성자 --> JVM에 의한 기본값을 가지고 있음
 		emp[1] = new Employee(1,"홍길동", 19, 'M', "01022224444","서울 잠실"); // 생성자 2
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01 , 
								"01011112222", "서울 마곡"); // 생성자 3
		
		// for 문으로 작성하기
		for(int i = 0; i < emp.length; i ++) {
			
			System.out.println("emp[" + i + "] : " + emp[i].information());
		}
		System.out.println("===============================================================================================");
		// setter 메서드를 이용해 값 넣어주기
		emp[0] = new Employee(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주" );
		emp[1] = new Employee(1,"홍길동", "기획부", "부장", 19, 'M', 4000000 ,0.3, "01022224444", "서울 잠실");
		
		System.out.println("emp[0] : " + emp[0].information());
		System.out.println("emp[1] : " + emp[1].information());
		System.out.println("===============================================================================================");
		// for 문으로 작성하기
		int sum = 0;
		
		for(int i = 0; i < emp.length; i ++) {
			
			int sumSalary = (emp[i].getSalary() + (int)(emp[i].getSalary() * emp[i].getBonusPoint())) * 12;
			System.out.printf("%s의 연봉 : %d\n", emp[i].getEmpName(), sumSalary);
			sum += sumSalary;
		}
		
		System.out.println("===============================================================================================");
		System.out.printf("직원들의 연봉의 평균 : %d원\n", sum / 3);
		
	}
	
}
