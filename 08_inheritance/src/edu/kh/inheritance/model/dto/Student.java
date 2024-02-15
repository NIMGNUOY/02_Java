package edu.kh.inheritance.model.dto;

/*
 * 	<가계도>
 * 		Object
 * 			ㄴ Person
 * 					ㄴ Student ㄴEmployee
 * 
 */



public class Student extends Person {
	// Student 클래스에 Person 클래스 내용을 연장한다
	// 부모 - Person , 자식 - Student
	// == Student 클래스에 Person 클래스 내용(필드, 메서드)을 
	//   추가하여 확장한다
	
	// ** 상속 **
	// 자식 extends 부모 {}
	
	// 필드
//	private String name;
//	private int age;
//	private String nationality;
	private int grade;				// 학년
	private int classRoom;			// 반
	
	public Student() {}				// 기본 생성자

	// 매개변수 생성자
	public Student(String name, int age, String nationality, int grade, int classRoom) {
//		this.name = name;
//		this.age = age;
//		this.nationality = nationality;
		/*
		setName(name);
		setAge(age);
		setNationality(nationality);
		*/
		// 부모의 setter 를 이용할 수 있지만 비효율적

		//super();  // --> 부모 Person 의 기본생성자
		
		super(name, age, nationality); // --> 부모 Person 의 매개변수 생성자
		this.grade = grade;
		this.classRoom = classRoom;
	}
	
	// getter / setter
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getNationality() {
//		return nationality;
//	}
//
//	public void setNationality(String nationality) {
//		this.nationality = nationality;
//	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	@Override
	public String toString() {
		
		// super.toString() --> Person 클래스의 toString() 메서드
		return super.toString() + " / " + grade + " / " + classRoom; 
	}
	
}
























