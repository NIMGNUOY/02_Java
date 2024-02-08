package edu.kh.oop.cls.model.vo;

public class Student {  // 클래스 선언부
//[접근제한자] [예약어] class 클래스명
	
	// 접근제한자 public : 같은 프로젝트 내에서 어떤 클래스에서든
	//					  import 할 수 있음을 나타냄
	// 					  == 어떤 패키지에서든 (전체)
	
	
	// 1. 필드(field) : 객체의 속성을 작성하는 클래스 내부 영역
	// 		== 멤버 변수 : 메서드 밖에 작성된 변수
	
	// 인스턴스 변수 : 필드에 작성되는 일반 변수
	// ex) private int age;
	
	// 클래스 변수 (== static 변수) : 필드에 static 예약어가 작성된 변수
	// ex) public static String schoolName;
	
	/*
	 * 필드 구성 (대괄호는 생략 가능)
	 * 		[접근제한자]		[예약어]		자료형			변수명		[= 초기값;] 
	 * 	+	public				final			기본자료형
	 * 	#	protected			static			(참조형)
	 * 	~	(default)			final static	배열	
	 * 	-	private				static final	클래스명
	 * 
	 *  필드의 접근 제한자 뜻 : 직접 접근 가능한 범위를 나타냄
	 */
	
	// final 필드명은 대문자로 작성
	/* ex)
	 * public class Academy { 
			private final int TEMP1 = 100; // final 키워드가 붙은 필드명은 
							  // 모두 대문자로 표기
			private int temp4;
	 * }
	 */
	
	public int v1 = 10;
	protected int v2 = 20;
	int v3 = 30;  // (default)
	private int v4 = 40;
	
	public void ex() {
		
		TestVO test = new TestVO();
		
		// 필드 접근제한자
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		
		
	}
	
	//--------------------------------------------------
	
	public static String schoolName = "KH고등학교";
	// 프로그램이 시작되자마자 static 영역에 메모리가 할당됨(JVM 읽음)
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//--------------------------------------------------------
	
	/*
	 * *** 오버 로딩 작성 규칙 ***
		1. 메서드 이름이 동일해야 한다.
		2. 매개변수의 자료형, 개수, 순서가 달라야한다.
		3. 리턴타입은 같아도되고, 달라도된다.
			(매개변수명은 신경쓰지 않음)
	*/
	
	// 2. 생성자 (constructor)
	/*
	 * - new 연산자를 통해서 객체를 생성할 때
	 * 	 생성된 객체의 필드 값 초기화 + 지정된 기능을 수행하는 역할
	 *  
	 * - 생성자 작성 규칙
	 * 	 1) 생성자의 이름은 반드시 클래스명과 같아야 한다.
	 * 	 2) 반환형이 존재하지 않는다.
	 * 	 
	 * - 생성자 종류
	 * 	 1) 기본 생성자
	 *   2) 매개 변수 생성자
	 * 
	 */
	
	// 기본 생성자
	//[접근제한자] 클래스명 () { 코드 }
	public Student() {
		// 객체가 생성될 때 수행할 코드	
		System.out.println("기본생성자에 의해서 Student 객체가 생성됨");
	}
	
	
	
	
	
	
	
	
	// 3. 메서드 (method)
}























