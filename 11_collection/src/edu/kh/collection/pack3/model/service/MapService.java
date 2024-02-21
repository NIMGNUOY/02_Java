package edu.kh.collection.pack3.model.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import edu.kh.collection.pack2.model.vo.Person;

public class MapService {

	/*
	 *	Map : 특정 키워드(Key)를 입력하면
	 *		해당되는 상세한 값(Value)를 얻을 수 있는
	 *		컬렉션 객체 
	 * 
	 * 	- K : V 형식으로 구성
	 *  - K : V 한 쌍을 "Entry"라고 부름
	 *  
	 *============================================================ 
	 *
	 *  - Key : 키워드 역할(== 변수명)
	 *  1) 중복 X 
	 *  -> 중복되는 Key 입력시 Value 를 덮어씌움
	 *  -> Key 역할의 객체는 hashCode(), equals() 
	 *  	오버라이딩이 필수적이다.
	 * 	
	 * 	2) 순서 유지 X (단, LinkedHashMap 제외)
	 * 
	 * 	** Key 만 묶어서 보면 Set 과 같은 특징을 지니고 있다 **
	 * 	-> Map.keySet(), Map.entrySet() 제공
	 * 
	 *============================================================ 
	 * 	
	 * 	- Value : 키워드에 해당하는 상세한 값
	 * 	  Key 로 인해서 모든 Value 가 구분할 수 있다.
	 * 	-> Map.get(key) , Map.remove(key) 형태로 사용
	 * 
	 */
	
	public void method1() {
		
		// HashMap 생성
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// 1. Value put(Key k , Value v) : Map 에 요소 추가
		// - Map 에 추가시 중복되는 key 가 없으면 null
		//				   중복되는 key 가 있으면 이전 value 반환
		
		System.out.println( map.put( 1, "졸림" ) );
		System.out.println( map.put( 2, "배고픔" ) );
		System.out.println( map.put( 3, "추움" ) );
		System.out.println( map.put( 3, "집가고싶음" ) ); 
		// 3 중복 --> 이전 value "추움" 반환
		
		System.out.println( map );
		// {1=졸림, 2=배고픔, 3=집가고싶음}
		// {K = V, K = V, K = V ...}
		
		System.out.println("--------------------------------------");
		
		// 2. V get(K k) : Key 에 해당하는 Value 를 반환하는 메서드
		//				 일치하는 Key 가 없다면 null 반환
		
		System.out.println( map.get( 3 ) );	// 집가고싶음
		System.out.println( map.get( 0 ) ); // null
		
		String temp = map.get( 2 );	// "배고픔"
		System.out.println( temp );
		
		// 3. int size() : Map 에 저장된 Entry(K:V)의 개수
		System.out.println( "size : "  + map.size() );
		
		System.out.println("--------------------------------------");
		
		// 4. V remove(K k) : 
		// - Key 가 일치하는 Entry 를 제거
		// - 일치하는 Key 가 있다면 Value, 없다면 null 반환
		System.out.println( "remove(2) : " + map.remove(2) ); // "배고픔"
		System.out.println( "remove(5) : " + map.remove(5) ); // null
		System.out.println( map );	// {2 : "배고픔"} 삭제 확인
		
		System.out.println("---------------------------------------");
		
		// 5. void clear() : 모든 Entry 삭제
		// 6. boolean isEmpty() : 비어있는지 확인
		
		System.out.println( "clear() 전 isEmpty() : " + map.isEmpty() ); // false
		
		map.clear();	// 모든 Entry 삭제
		
		System.out.println( "clear() 후 isEmpty() : " + map.isEmpty() ); // true
		
	}
	
	
	/**
	 * 	Map 요소(Entry) 순차 접근하기
	 * 	1. Map.keySet() 이용하기
	 */
	public void method2() { 
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("학원", "서울시 중구");
		map.put("집", "경기도 구리시");
		map.put("롯데타워", "서울시 송파구");
		map.put("63빌딩", "서울시 영등포구");
		
		// Set<K> Map.keySet() : 
		// - Map 에 있는 Key 만 뽑아내서 Set 형태로 만들어 반환
		
		Set<String> set = map.keySet();
		
		System.out.println( "keySet() : " + set );	// Key 값만 Set 형태로 반환
									// [집, 63빌딩, 학원, 롯데타워]
		
		// 향상된 for 문 + Set
		for (String key : set) {
			System.out.println( key + " : " + map.get(key) );
		}
		
	}
	
	
	/**
	 * 	Map 요소(Entry) 순차 접근하기
	 *  2. Map.entrySet() 이용하기
	 */
	public void method3() {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("학원", "서울시 중구");
		map.put("집", "경기도 구리시");
		map.put("롯데타워", "서울시 송파구");
		map.put("63빌딩", "서울시 영등포구");
		
		Set<Entry<String, String>> entrySet= map.entrySet();
		
		// 향상된 for 문 + entrySet 이용
		
		// Entry.getKey() : Key 만 얻어오기
		// Entry.getValue() : Value 만 얻어오기
		for(Entry<String, String> ent : entrySet) {
			System.out.printf( "Key : %s , Value : %s\n",
								ent.getKey(), ent.getValue() );
		}
		
	}
	
	
	/**
	 * 	Map 활용하기 - DTO 대체하기
	 * 	- 서로 다른 데이터를 한번에 묶어서 관리해야 하는 경우에 사용
	 */
	public void method4() {
		
		// DTO , VO 이용 방법
		Person p1 = new Person();
		
		p1.setName("손흥민");
		p1.setAge(29);
		p1.setGender('남');
		
		System.out.printf( "이름 : %s, 나이 : %d, 성별 : %c\n",
							p1.getName(), p1.getAge(), p1.getGender());
		
		System.out.println("------------------------------------------");
		
		// DTO 대신 Map 활용하기(계속 사용 X, 일회성일 때)
		// - Key 는 무조건 String 을 활용하는게 Best!!
		// - Value 의 타입이 모두 다름
		// 		-> Object 를 부모 타입 참조변수로 활용
		
		Map<String, Object> p2 = new HashMap<String, Object>();
		
		// 데이터 추가 
		p2.put("name", "김민재");
		p2.put("Age", 26);	// int 형을 썼지만 Integer 로 변환
		p2.put("gender", '남');	// char 형을 썼지만 Character 로 변환
		
		// 데이터 얻어오기
		System.out.printf( "이름 : %s, 나이 : %d, 성별 : %c\n",
				p2.get("name"), p2.get("Age"), p2.get("gender") );
		
	}
	
}





























