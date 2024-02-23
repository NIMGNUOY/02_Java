package edu.kh.io.pack4.model.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterService {

	/*
	 * 	문자 기반 스트림
	 *  
	 * - 2byte 문자(char) 단위로 입/출력하는 스트림
	 * - Reader(입력), Writer(출력) 최상위 인터페이스
	 * - 문자만 작성된 파일, 채팅, 인터넷 요청 시 데이터 전달
	 * 
	 */
	
	/**
	 * 	문자 기반 파일 입력 (파일 읽어오기)
	 * + 보조 스트림 Buffered 사용
	 */
	public void fileInput() {
		
		FileReader fr = null;		// 문자 기반 파일 입력 스트림
		BufferedReader br = null;	// 문자 기반 보조 스트림
		
		try {
			
			// 문자 기반 스트림 생성
			fr = new FileReader ("/io_test/20240222/노래가사.txt");
			
			// 문자 기반 보조 스트림 생성
			br = new BufferedReader ( fr );
			
			String line = null;		// 한 줄을 읽어와 저장할 변수
			
			while (true) {
				
				line = br.readLine();
				
				if(line == null) break;		// 더이상 읽어올 내용이 없을 때
				
				System.out.println( line );
				
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				
				if(br != null) br.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	/**
	 * 	문자 기반 파일 출력
	 * + 보조 스트림 BufferedWriter 사용
	 */
	public void fileOutput() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("오늘은 2월 23일 금요일입니다 \n");
		sb.append("벌써 금요일이라니 기분이 좋군요 \n");
		sb.append("주말에 잠좀 많이 자야지 \n");
		sb.append("근데 월요일에 시험?");
		
		String content = sb.toString();
		
		// content 에 저장된 문자열을 
		// /io_test/20240222/출력테스트.txt 파일로 출력하기
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			// 파일과 출력 스트림을 연결(파일이 없으면 자동 생성)
			fw = new FileWriter("/io_test/20240222/출력테스트.txt");
			
			bw = new BufferedWriter( fw );	// 버퍼를 이용해서 성능 향상
			
			bw.write( content );	// content 에 저장된 내용을 연결된 파일에 출력
			
//			bw.flush();		close() 구문에 포함되어있기 때문에 안써도 된다
			
			System.out.println("출력 완료");
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				// close() 구문에 flush() 가 내장되어 있음
				if(bw != null) bw.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
}

























