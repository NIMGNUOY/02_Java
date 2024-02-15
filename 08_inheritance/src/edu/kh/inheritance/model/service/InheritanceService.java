package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.Employee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

// 비즈니스 로직 처리하는 클래스

public class InheritanceService {

	// 상속 확인 예제
	public void ex1() {
		
		Person p = new Person();
		
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		
		System.out.println("--------------------------------");
		
		// Person 을 상속받은 Student 가 Person 의 필드, 메서드를
		// 정말 사용할 수 있는가?
		
		// Student 객체 생성
		Student std = new Student();
		
		// Student 만의 고유한 필드 (학년, 반)
		std.setGrade(3);
		std.setClassRoom(5);
		
		// Person 클래스로부터 상속받은 필드, 메서드 확인
		std.setName("고길동");
		std.setAge(18);
		std.setNationality("대한민국");
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getGrade() + "학년");
		System.out.println(std.getClassRoom() + "반");
		
		System.out.println("---------------------------------");
		
		Employee emp = new Employee();
		
		// Employee 만의 고유 메서드
		emp.setCompany("KH정보교육원");
		
		// Person 클래스로부터 상속받은 메서드
		emp.setName("송영민");
		emp.setAge(15);
		emp.setNationality("미국");
		
		System.out.println(emp.getCompany());
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		
		p.breath();
		p.move();
		std.breath();
		std.move();
		emp.breath();
		emp.move();
		
		// 상속의 특징 : 코드 추가 및 수정에 용이함
		//				코드 길이 감소 및 중복 제거 효과
		
	}
	
	// super() 생성자 이용방법
	public void ex2() {
		
		// Student 매개변수 5개짜리 생성자
		
		Student std = new Student("나카무라", 17, "일본", 1, 3);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality()); // Person 매개변수 생성자
		
		System.out.println(std.getGrade() + "학년");
		System.out.println(std.getClassRoom() + "반"); // Student 매개변수 생성자
		
		// super 매개변수 생성자를 사용하지 않으면 Person 매개변수 생성자를
		// 이용하지 못해서 이름, 나이, 국적 은 JVM 의 기본값이 설정된다
		
	}
	
	
	// 오버라이딩 확인 예제
	public void ex3() {
		
		Student std = new Student();
		Employee emp = new Employee();
		
		std.move(); // 오버라이딩 X -> Person 의 메서드 수행
		System.out.println();
		emp.move(); // 오버라이딩 O -> Employee 클래스에서 오버라이딩한
					//				  메서드 수행
		
	}
	
	// toString() 오버라이딩 확인 예제
	public void ex4() {
		
		Person p = new Person("김철수", 17, "한국");
		System.out.println( p.toString() );
		System.out.println( p ); // 위의 값과 동일한 값 출력
		// print 구문 수행 시 참조변수명을 작성하면
		// 자동으로 toString() 메서드를 호출해서 출력해준다.
		System.out.println("-----------------------------------");
		
		Student std = new Student("Harry", 18, "잉글랜드", 2, 6);
		System.out.println( std.toString() );
		System.out.println( std );
		System.out.println("-----------------------------------");
		
		Employee emp = new Employee("타키야", 29, "일본", "토요타");
		
		System.out.println( emp.toString() );
		System.out.println( emp );
	}
}



















