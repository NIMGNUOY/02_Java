package com.hw4.model.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.hw4.model.dto.Toy;

public class ToyFactory {

	/*
	1. 장난감은 똑같은 재료를 중복으로 저장할 수 없다.
	2. 똑같은 장난감을 만들 수 없다.
	3. 장난감을 저장할 컬렉션에 중복된 장난감이 있어서는 안된다.
	4. 재료는 { 고유번호 : 재료명 } 형식으로 작성되어 있어야 한다.
	5. 재료의 고유번호는 중복될 수 없다.
	6. 재료 등록 시 이미 등록된 고유번호의 재료가 있으면, 덮어쓰겠냐는 질문을 하고 y/n
	으로 답변을 입력받아 처리해야 한다.
	7. 재료 삭제 시 고유번호가 아닌, 재료명을 입력받아 같은 재료명이 있으면 삭제한다.
	*/
	
	/*
	 * 1. HashMap 사용 { K : V }
	 * 2. Set 객체 특징 사용
	 */
	
	private Scanner sc = new Scanner(System.in);
	
	private Map<Integer, String> materialName = new HashMap<Integer, String>();
	
	private Set<Toy> toySet = new HashSet<Toy>();
	
	{
		materialName.put(1, "면직물");
		materialName.put(2, "플라스틱");
		materialName.put(3, "유리");
		materialName.put(4, "고무");
	}
	
	{
//		toySet.add( new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", materials()) );
//		toySet.add( new Toy("허기워기", 5, 12000, "파란색", "19950805", materials()) );
//		toySet.add( new Toy("키시미시", 5, 15000, "분홍색", "19950805", materials()) );
//		toySet.add( new Toy("캣냅", 8, 27000, "보라색", "19950805", materials()) );
//		toySet.add( new Toy("파피", 12, 57000, "빨간색", "19950805", materials()) );
	}
	
}


























