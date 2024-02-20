package edu.kh.collection.pack1.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.pack1.model.vo.Student;

public class StudentService {

	// 속성(필드)
	private Scanner sc = new Scanner(System.in);
	
	
	// 학생 정보를 저장할 List 생성
	
	// java.util.List 인터페이스 : List 에 반드시 필요한 필수 기능을 
	//							  모아둔 인터페이스
	// -> 인터페이스 객체 생성 X, 부모 참조변수 O
	
	// java.util.ArrayList : 배열 형태 List (가장 대표적인 List 자식 클래스)
	
	// ArrayList() 기본 생성자 : 기본 크기 10짜리 리스트 생성
	//							-> 하지만 리스트는 크기가 늘었다 줄었다 하기 때문에 큰 의미 X
	
	// ArrayList(용량) : 용량만큼의 리스트 생성
	// 					-> 너무 큰 값을 작성하면 메모리를 많이 소모함.
	
	private List<Student> studentList = new ArrayList<Student>(); // 검색(조회)에 효율적
//	private List<Student> studentList = new LinkedList<Student>(); // 추가, 수정, 삭제에 효율적
	
	
	public StudentService() {	// 기본 생성자
		
		studentList.add( new Student("이순신", 19, "서울시 중랑구", 'M', 90) );
		studentList.add( new Student("홍길동", 17, "서울시 성북구", 'M', 80) );
		studentList.add( new Student("유관순", 18, "서울시 강남구", 'F', 95) );
		studentList.add( new Student("주몽", 25, "경기도 구리시", 'M', 100) );
		studentList.add( new Student("신사임당", 23, "경기도 성남시", 'F', 88) );
		
	}
	
	
	public void ex() {
		
		// List 테스트
		
		// List.add(Object e) : 리스트에 객체를 추가하는 메서드
		// --> 매개변수 타입이 Object == 모든 객체를 매개변수로 전달가능
		studentList.add( new Student() );	// 0번 인덱스 Student 객체 삽입
//		studentList.add( sc );				// 1번 인덱스 Scanner 객체 
//		studentList.add( "문자열" );		// 2번 인덱스 String 참조형 "문자열" 객체
//		studentList.add( new Object() );	// 3번 인덱스 
		
		// 컬렉션(Collection) 특징 : 여러타입의 데이터를 저장가능
		
		// Object List.get(index i) : 리스트에서 i번째 인덱스에 있는 객체를 반환
		// 반환형이 Object == 모든 객체를 반환할 수 있다.
		
		if(studentList.get(0) instanceof Student) {
			
			System.out.println( ((Student)studentList.get(0)).getName() );
			// 강제형변환 연산순위가 . 연산순위보다 낮기 때문에 
			// 강제형변환 연산부분을 () 소괄호 해준다
			
		} 
		
		// Student [name=null, age=0, region=null, gender=,score=0]
		// Student 클래스의 toString() 메서드
		
//		System.out.println( studentList.get(1) );
//		System.out.println( studentList.get(2) );
//		System.out.println( studentList.get(3) );
		
		// 제네릭스 (Generics)
		// -> 컬렉션에 저장되는 객체 타입을 한가지로 제한 : <E>
		
	}
	
	// 메뉴 출력용 메서드
	
	/**
	 * alt + shift + j 
	 * 메서드 설명용 주석
	 * @author youngMin@gmail.com
	 */
	public void displayMenu() {
		
		int menuNum = 0;	// 메뉴 선택용 변수
		
		do {
			
			System.out.println("\n===== 학생 관리 프로그램 =====\n");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 정보 전체 조회");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 제거");
			System.out.println("5. 이름으로 검색(일치)");
			System.out.println("6. 이름으로 검색(포함)");
			System.out.println("7. 나이순으로 정렬"); // Comparable
			System.out.println("8. 이름순으로 정렬"); // Comparator
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 번호 선택 : ");
			
			try {
				// 예외 발생 가능한 코드 입력
				menuNum = sc.nextInt();
				System.out.println();
				
				switch(menuNum) {
				
				case 1 : System.out.println( addStudent() ); break;
				case 2 : selectAllStudent(); break;
				case 3 : System.out.println( updateStudent() ); break;
				case 4 : System.out.println( removeStudent() ); break;
				case 5 : searchName1(); break;
				case 6 : searchName2(); break;
				case 7 : sortByAge(); break;
				case 8 : sortByName(); break;	
				case 0 : System.out.println("프로그램 종료"); break;
				default : System.out.println("메뉴에 작성된 번호만 입력하세요.");
				
				}
				
			} catch (InputMismatchException e) {
				System.out.println("\nError : 입력형식이 유효하지 않습니다. 다시 시도해주세요.");
				sc.nextLine();	// 입력버퍼에 남아있는 잘못된 코드 제거
				
				menuNum = -1;	// 첫 반복시에 잘못 입력하는 경우 
								// menuNum 이 0 을 가지고 있어 종료되는데
								// 이를 방지하기 위해 임의값 -1 대입
			}
			
			
		} while(menuNum != 0);	// menuNum == 0 이 되면 반복문 중지
		
	}
	
	/**
	 *  1. 학생 정보 추가 메서드
	 *  - 추가 성공 시 "성공" 실패 시 "실패" 문자열 반환
	 */
	public String addStudent() throws InputMismatchException{
		
		System.out.println("===== 학생 정보 추가 =====");
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();	// 입력 버퍼 개행 문자 제거용
		
		System.out.print("지역 : ");
		String region = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		// Student 객체 생성 후 List 에 추가하기
		if(studentList.add( new Student(name, age, region, gender, score) )) {
			// true 학생 정보 입력 성공
			
			return "성공";
			
		} else {
			// false 학생 정보 입력 실패
			return "실패";
			
		}
		// boolean java.util.List.add(Student e)  --> true / false 로 반환
		// (반환형)				-> 제네릭 <Student> 로 인해 List 에 추가할 
		//						   수 있는 객체 타입이 Student 로 제한됨
		
		
	}
	
	
	/**
	 *  전체 학생 조회 메서드
	 *  - List 가 비어있는 경우 "학생 정보가 없습니다" 출력
	 *  - 있는 경우 전체 학생 출력
	 */
	public void selectAllStudent() {
		
		// List 에 저장된 데이터의 개수를 얻어오는 방법 : int List.size()
		// -> 배열명.length 대신 사용
		
		System.out.println("===== 전체 학생 조회 =====\n");
		
		// studentList 가 비어있는 경우 "학생 정보가 없습니다" 출력
		//if(studentList.size() == 0 )
		if(studentList.isEmpty()) {		// 컬렉션이 비어있다면 true 반환
			System.out.println("학생 정보가 없습니다.");
			return;	// 현제 메서드를 종료하고 호출한 곳으로 돌아감.
					// 단, 반환값은 없다(void)
		} 
		
		// 일반 for 문
		
//		for(int i = 0; i < studentList.size(); i++) {
//			System.out.println( studentList.get(i) );
//		}
		
		// 향상된 for 문 (for each 문)
		// - 컬렉션, 배열의 모든 요소를 순차적으로 반복접근 할 수 있는 for 문
		// (순차적 : 0 번 인덱스 ~ 마지막 인덱스까지 인덱스를 1씩 증가)
		
		// 작성법
		// for( 컬렉션 또는 배열에서 꺼낸 한개의 요소를 저장할 변수 : 컬렉션 명 또는 배열명 )
		
		int idx = 0;
		for( Student std : studentList ) {
			// std 에는 for 문 반복시 마다 0, 1, 2 ... 인덱스 요소를 한번씩 저장됨
			System.out.print( (idx++) + "번 : " );
			System.out.println( std ); // 오버라이딩을 해놓았기 때문에 toString() 메서드 출력
		}
		
	}
	
	
	/**
	 * 	학생 정보 수정 메서드
	 *  - 학생 정보가 studentList에 있는지 검사 -> 없다면 "입력된 학생 정보가 없습니다" 문자열 반환
	 *  - 입력된 숫자가 0 보다 작은지 검사, 작다면 "음수는 입력할 수 없습니다" 문자열 반환
	 *  - studentList 범위 내 인덱스 번호인지 검사 -> 초과했다면 "범위를 넘어선 값을 입력할 수 없습니다" 문자열 반환
	 *  - 수정이 완료되었다면, "000의 정보가 변경되었습니다" 문자열 반환
	 */
	public String updateStudent() throws InputMismatchException {
		// 4) 만약 문자열을 입력한 경우 -> 예외처리 throws
		
		// Student List.set(int index, Student e)
		// -> List 의 index 번째 요소를 전달받은 e 로 변경
		// -> 반환값 Student == 변경전의 Student 객체가 담겨있다
		
		System.out.println("===== 학생 정보 수정 =====\n");
		System.out.print("인덱스 번호 입력 : ");
		int idx = sc.nextInt();
		
		// 1) 학생 정보가 studentList에 있는지 검사 -> 없다면 "입력된 학생 정보가 없습니다" 문자열 반환
		if( studentList.isEmpty() ) {
			
			return "입력된 학생 정보가 없습니다.";
			
		// 2) 입력된 숫자가 0 보다 작은지 검사, 작다면 "음수는 입력할 수 없습니다" 문자열 반환	
		} else if (idx < 0) {
			
			return "음수는 입력할 수 없습니다.";
			
		// 3) studentList 범위 내 인덱스 번호인지 검사 -> 초과했다면 "범위를 넘어선 값을 입력할 수 없습니다" 문자열 반환	
		} else if ( idx >= studentList.size() ) {
			
			return "범위를 넘어선 값을 입력할 수 없습니다.";
			
		} else {
			
			// 수정 코드 작성
			System.out.println( idx + "번째에 저장된 학생 정보 :" );
			System.out.println( studentList.get(idx) );
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			sc.nextLine();	// 입력 버퍼 개행 문자 제거용
			
			System.out.print("지역 : ");
			String region = sc.nextLine();
			
			System.out.print("성별(M/F) : ");
			char gender = sc.next().charAt(0);
			
			System.out.print("점수 : ");
			int score = sc.nextInt();
			
			// 입력받은 idx 번째에 새로운 학생 정보(위에 입력받은 값)를 세팅
			// idx 번째에 있던 기존 학생 정보가 반환되고, 그 객체를 temp 에 저장한다.
			// temp 변수에는 변경전의 학생 정보가 담겨있다
			Student temp = studentList.set(idx, new Student (name, age, region, gender, score));
			
			return temp.getName() + "의 정보가 변경되었습니다.";
		}
		
		
	}
	
	
	/**
	 * 학생 정보 제거 메서드
	 * @return String
	 */
	public String removeStudent() throws InputMismatchException {
		
		// Student List.remove(int index)
		// 리스트에서 index 번째 요소를 제거
		// 이 때 제거된 요소가 반환된다. ex) Student List.set(int index, Student e)
		// * List 는 중간에 비어있는 인덱스가 없게 하기 위해서 
		// remove() 동작 시 뒤쪽 요소를 한 칸씩 당겨온다.	cf) 객체 배열
		
		System.out.println("===== 학생 정보 제거 =====\n");
		
		System.out.print("인덱스 번호 입력 : ");
		int idx = sc.nextInt();
		
		// 1) 학생 정보가 studentList에 있는지 검사 -> 없다면 "입력된 학생 정보가 없습니다" 문자열 반환
		if( studentList.isEmpty() ) {
					
			return "입력된 학생 정보가 없습니다.";
					
		// 2) 입력된 숫자가 0 보다 작은지 검사, 작다면 "음수는 입력할 수 없습니다" 문자열 반환	
		} else if (idx < 0) {
					
			return "음수는 입력할 수 없습니다.";
					
		// 3) studentList 범위 내 인덱스 번호인지 검사 -> 초과했다면 "범위를 넘어선 값을 입력할 수 없습니다" 문자열 반환	
		} else if ( idx >= studentList.size() ) {
					
			return "범위를 넘어선 값을 입력할 수 없습니다.";
					
		} else {
					
			// 학생 정보 제거 코드
			
			System.out.print("정말 삭제 하시겠습니까?(y/n) : ");
			char answer = sc.next().toUpperCase().charAt(0);
			//			String 대문자 -> 대문자 0 번째 index 문자
			
			// String.toUpperCase() : 문자열을 대문자로 변경
			// String.toLowerCase() : 문자열을 소문자로 변경
			
			if(answer == 'Y') {
				
				Student temp = studentList.remove(idx);
				return temp.getName() + "의 정보가 제거되었습니다.\n" + 
						"총 학생수 : " + studentList.size() + "명";
				
			} else {
				return "취소";		// displayMenu() 메서드로 돌아감
			}
					
		}
		
	}

	
	/**
	 * 이름이 일치하는 학생을 찾아서 조회하는 메서드(**완전 일치**)
	 * 1) 검색할 이름 입력받아 studentList 에서 꺼내온 Student 객체의 name 값이 같은지 비교
	 * 2) 일치하는 경우, Student 객체를 출력
	 * 3) 일치하는 이름이 없는 경우, "검색 결과가 없습니다" 출력
	 */
	public void searchName1() throws InputMismatchException {
		
		System.out.println("===== 학생 정보 검색(일치) =====\n");
		
		if(studentList.isEmpty()) {
			System.out.println("등록된 학생 정보가 없습니다.");
		}
		
		System.out.print("이름 검색 : ");
		String name = sc.next();
		
		boolean flag = false;
		
		for(int i = 0; i < studentList.size(); i ++) {
			
			if (studentList.get(i).getName().equals(name)) {
				
				System.out.println( i + "번째 학생 정보 : " + studentList.get(i) );
				flag = true;
				
			} 
		}
		
		if(!flag) {
			System.out.println("검색 결과가 없습니다.");
		}
		
	}
	
	
	/**
	 * 이름에 특정 문자열이 포함되는 학생을 찾아서 조회하는 메서드
	 * 1) 문자열 입력받아 studentList 에서 꺼내온 Student 객체의 name 값에 포함되는 문자열인지 검사
	 * 2) 포함되는 문자열을 찾은 경우, Student 객체를 출력
	 * 3) 포함되는 문자열이 없는 경우, "검색 결과가 없습니다." 출력
	 */
	public void searchName2() throws InputMismatchException {
		// boolean String.contains(문자열) : String 에 문자열이 포함되어 있으면 true / 없으면 false
		
		System.out.println("===== 학생 정보 검색(포함) =====\n");
		System.out.print("이름 검색 : ");
		String name = sc.next();
		
		if(studentList.isEmpty()) {
			System.out.println("등록된 학생 정보가 없습니다.");
		}
		
		boolean flag = false;
		
		for(int i = 0; i < studentList.size(); i ++) {
			
			if(studentList.get(i).getName().contains(name)) {
				
				System.out.println( i + "번째 학생 정보 : " + studentList.get(i) );
				flag = true;
				
			}
			
		}
		
		if(!flag) {
			System.out.println("검색 결과가 없습니다.");
		}
		
		
	}
	
	
	public void sortByAge() {
		// 나이에 따라 오름차순 정렬
		Collections.sort( studentList );
		
		// 정렬된 결과 출력하기
		for( Student std : studentList ) {
			System.out.println( std );
		}
	}
	
	public void sortByName() {
		
		// 이름에 따라 정렬하는 Comparator 객체 생성
		Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
		// Comparator 인터페이스의 static 메서드인 comparing() 을 사용하여
		// Comparator 객체를 생성
		// -> comparing() 는 주어진 키(key)를 기반으로 객체를 비교함
		// Student::getName : 메서드 레퍼런스(Method Reference)
		// -> Student 클래스의 getName() 메서드를 가리키는 것.
		// -> 이 메서드를 비교의 키로 사용하여 각 Student 객체를 비교하고 정렬함.
		// --> Comparator.comparing(Student::getName)은 이름(name)을 기준으로
		//	   학생(Student) 객체를 비교하는 Comparator 를 생성
		
		
		// 이름에 따라 정렬
		Collections.sort( studentList, nameComparator );
		
		// 정렬된 결과 출력
		for ( Student std : studentList ) {
			System.out.println( std );
		}
		
	}
}





























