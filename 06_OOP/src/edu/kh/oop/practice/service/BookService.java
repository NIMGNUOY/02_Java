package edu.kh.oop.practice.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {

	public void practice() {
		
		Book bInfo1 = new Book();
		Book bInfo2 = new Book("자바의정석", 30000, 02, "남궁성");
		System.out.println(bInfo1.toString());
		System.out.println(bInfo2.toString());
		System.out.println("========================================");
		
		// setter를 이용한 수정
		bInfo1.setTitle("C언어");
		bInfo1.setPrice(30000);
		bInfo1.setDiscountRate(0.1);
		bInfo1.setAuthor("홍길동");
		
		
		System.out.println("수정된 결과 확인");
		System.out.println(bInfo1.toString());
		System.out.println("========================================");
		
		System.out.println("도서명 = " + bInfo1.getTitle());
		System.out.println("할인된 가격 = " + (int)(bInfo1.getPrice() - bInfo1.getPrice() * bInfo1.getDiscountRate() ));
		
		System.out.println("도서명 = " + bInfo2.getTitle());
		System.out.println("할인된 가격 = " + (int)(bInfo2.getPrice() - bInfo2.getPrice() * bInfo2.getDiscountRate() ));
		
		
	}
	
}
