package edu.kh.io.pack3.model.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import edu.kh.io.pack3.model.dto.Member;

public class ObjectService {

	/*
	 *	ObjectInputStream  /  ObjectOutputStream
	 *
	 * - Java 객체(Instance == Object)를 입/출력할 때
	 * 	사용하는 바이트 기반 "보조" 스트림 (기반 스트림 X)
	 * 	(보조 스트림은 단독으로 사용 불가능)
	 * 
	 * *** 직렬화(Serializable) ***
	 * - 객체를 직렬(직선) 형태로 변환
	 * 
	 * 
	 */

	/**
	 * 	객체를 외부 파일로 출력
	 */
	public void objectOutput() {
		
		// 스트림 참조변수 선언
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			
			// .dat 확장자 : data 를 담고 있는 파일을 나타내는 확장자
			fos = new FileOutputStream( "/io_test/20240222/Member.dat" );
			oos = new ObjectOutputStream(fos );	// 객체 보조 스트림 생성
			
			// Member 객체 하나 생성
			
			Member member = new Member("member01", "pass01!", "손흥민", 30);
			
			// ObjectOutputStream 을 이용해서 Member 객체를 출력하기
			oos.writeObject( member );	// 객체 출력
			
			System.out.println("회원 출력 완료");	// NotSerializableException
													// : edu.kh.io.pack3.model.dto.Member
													// 직렬화가 되지 않음 
													// --> Serializable 인터페이스 상속
			
			
			
			
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				
				if(oos != null) oos.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	/**
	 * 	외부 파일로 부터 객체 입력 받기
	 */
	public void objectInput() {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			
			// 파일 입력 기반 스트림 생성
			fis = new FileInputStream("/io_test/20240222/Member.dat");
			
			// 객체 입력 보조 스트림 생성
			ois = new ObjectInputStream(fis);
			
			// 스트림을 이용해 파일에 작성된 직렬화된 Member 객체를 읽어와
			// 역직렬화를 수행하여 정상적인 Member 객체로 변경
			
			// Object ois.readObject() : 직렬화된 객체를 읽어와 역직렬화
			//								+ Member 객체로 변경(다운 캐스팅)
			//									(반환값이 Object 최상위 부모 이기 때문에)
			
			Member member = (Member) ois.readObject();
			
			// 읽어온 내용 확인
			System.out.println( member );
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				
				if(ois != null) ois.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

























