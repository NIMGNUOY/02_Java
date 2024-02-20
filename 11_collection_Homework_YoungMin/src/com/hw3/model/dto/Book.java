package com.hw3.model.dto;

public class Book {

	private int bNum;
	private String bName;
	private String author;
	private int price;
	private String publish;
	
	public Book() {}

	public Book(int bNum, String bName, String author, int price, String publish) {
		super();
		this.bNum = bNum;
		this.bName = bName;
		this.author = author;
		this.price = price;
		this.publish = publish;
	}

	public int getbNum() {
		return bNum;
	}

	public void setbNum(int bNum) {
		this.bNum = bNum;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	@Override
	public String toString() {
		return bNum + "번 도서 : " + "[도서제목 : " + bName + " / 도서저자 : " + author + " / 도서가격 : " + 
				price + " / 출판사 : " + publish + "]";
	}
	
	
	
}
