package edu.kh.variable.ex1;

public class VariableExample2 {
	
	public static void main(String[] args) {
		
		/* 자바 기본 자료형 8가지
		 * 
		 * 논리형 : boolean(1byte)
		 * 정수형 : byte(1byte) , short(2byte) , int(4byte) , long(8byte)
		 * 실수형 : float(4byte) , double(8byte)
		 * 문자형 : char(2byte, 유니코드)
		 * 
		 */
		
		// 변수 선언 : 메모리에 값을 저장할 공간을 할당하는 것.
		// 변수 값 대입 : 변수에 값을 집어 넣는 것.
		
		// 카멜 표기법
		// -> 연결되는 두 단어 중 후속단어의 첫 문자를 대문자로 표기하는 법
		
		boolean booleanData;
		// 메모리에 논리값(true / false)을 저장할 공간을 1byte 할당하고
		// 할당된 공간을 booleanData 라고 부르겠다.
		
		booleanData = true; // booleanData 변수에 true 값을 집어 넣기
		
		System.out.println("booleanData : " + booleanData);
		
		
		byte byteNumber = 127;   // 128 넣는 순간 error -> -128 ~ 127
		// 메모리 정수 값을 저장할 공간을 1byte 할당하고
		// 할당된 공간을 byteNumber라고 부르겠다.
		// 선언된 byteNumber 변수에 처음으로 127을 넣음
		// --> 초기화 : 처음 변수에 값을 대입
		
		System.out.println("btyeNumber : " + byteNumber);
		
		short shortNumber = 32767; //  -32768 ~ 32767
		
		
		// 정수 자료형 기본형! (short, byte 는 옛날 코드의 잔재)
		int intNumber = 2147483647; //  -2147483648 ~ 2147483647 (약 21억)
	// 자료형 변수명 = 리터럴;
		
		// 프로그래밍에서는 대입되는 이 데이터(값 자체)를 리터럴 이라는 단어로도 표현합니다.
		
		
		// 리터럴 : 변수에 대입되거나 작성되어지는 값 자체
		// + 자료형에 따라 리터럴 표기법이 다름.
		
		long longNumber = 10000000000L; // L or l 둘다 가능
		// The literal 10000000000 of type int is out of range
		// -> 100억 이라는 값은 int의 범위를 벗어남. 약 21억 까지만 가능
		// 뒤에 L을 붙여줌으로써 long 자료형인것을 나타냄.
		
		float floatNumber = 1.2345f; // F or f 둘다 가능
		// 1.2345 까지만 쓰면 error(double 자료형이기 때문에)
		
		double doubleNumber = 3.141592; // d 를 뒤에 써도 된다(기본형이기 때문에 안써도됨)
		// double이 실수형의 기본형
		// (리터럴 표기법이 없는 실수는 double로 인식)
		
		
		// 문자형 리터럴 표기법 : '' (홑따옴표)
		// -> 문자 하나
		char ch = 'A';  // A
		char ch2 = 66;  // B
		
		/*
		 * char 자료형에 숫자가 대입될 수 있는 이유
		 * - 컴퓨터에는 문자표가 존재
		 *   숫자에 따라 지정된 문자 모양이 맵핑되고
		 *   'B' 문자 그대로 대입되면 변수에 숫자 66으로 변환되어 저장
		 * -> 반대로 생각하면 변수에 애초에 66 이라는 숫자를 저장하는 것이 가능
		 * 
		 */
		
		System.out.println("ch : " + ch);
		System.out.println("ch2 : " + ch2);
		
		
		// 변수 명명 규칙
		// 1. 대소문자 구분, 길이 제한 X
		int abcdefg123456789;
		int abcdefG123456789; // 대소문자 구분하기 때문에 g / G 로 다른 변수
		
		// 2. 예약어 사용 X
		// double double;  <-- X
		// double final;   <-- X
		
		// 3. 숫자로 시작 X
		// char 1abc; <-- X
		char a1bc; // O
		
		// 4. 특수문자 _ , $ 만 사용 가능(권장하지 않음)
		int $intNumber; // 문제는 없지만 개발자는 이렇게 작성하지 않음
		int int_Number; // JAVA 는 카멜 표기법 사용
						// _ 작성 표기법은 DB에서 사용 ex) MEMBER_NAME
		
		// 5. 카멜 표기법
		char helloWorldAppleBananaTomato;
		
		// 6. 변수명은 언어를 가리지 않음(하지만 영어를 씀)
		int 정수1번;
		double 실수2번 = 3.14;
		
		System.out.println(실수2번);
		
		//-------------------------------------------------------------
		
		final double PI_VALUE = 3.14;
		// PI_VALUE = 2.33;  --> ERROR 재대입 불가!
		
		/*
		 * 상수 (항상 같은 수) : 
		 * - 변수의 한 종류
		 * - 한번 값이 대입되면 다른 값을 재대입 할 수 없음!
		 * - 자료형 앞에 final 키워드를 작성
		 * 
		 * 상수의 명명 규칙 : 모두 대문자, 여러 단어 작성 시 '_' 사용
		 * - 상수를 사용하는 경우
		 * 1) 변하면 안되는 고정된 값을 저장할 때
		 * 2) 특정한 값에 의미를 부여하는 경우
		 * 
		 *
		 */
		
		final int LEFT_MOVE = -1;
		final int RIGHT_MOVE = 1;
		
		System.out.println(1 + 1.3);  // 1.0 + 1.3 = 2.3 --> 정수에서 실수로 변환 후 연산
									  // => 자동 형 변환(1(int) -> 1.0(double))
									  // 컴파일러가 자동으로 값의 범위가 작은 자료형을 값의 범위가 큰 자료형으로 변환
		
		
		
		
		
		
	}
}
