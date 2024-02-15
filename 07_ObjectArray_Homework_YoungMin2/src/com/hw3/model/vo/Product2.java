package com.hw3.model.vo;

import com.hw3.controller.ProductController2;

public class Product2 {

	private int pId;		//제품번호
	private String pName;	//제품명
	private int price;		//제품가격
	private double tax;		//제품세금
	
	public Product2() {
		ProductController2.count++;
	}
	
	public Product2(int pId, String pName, 
			int price, double tax) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
		
		ProductController2.count++;
	}
	
	public String information() {
		return "제품번호 : " + pId + "\n제품명 : " + pName
				+ "\n제품가격 : " + price + "\n제품세금 : " + tax;
	}
	
}
