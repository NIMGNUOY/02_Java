package com.hw4.model.dto;


import java.util.Set;

public class Toy {

	private String name;
	private int age;
	private int price;
	private String color;
	private String manufactureDate;
	private Set<String> material;

	public Toy() {}

	public Toy(String name, int age, int price, String color, String manufactureDate, Set<String> material) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.manufactureDate = manufactureDate;
		this.material = material;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public Set<String> getMaterial() {
		return material;
	}

	public void setMaterial(Set<String> material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "이름 : " + name + " / 가격 : " + price + " / 색상 : " + color + " / 사용가능연령 : " + age
				+ " / 제조년월일 : " + manufactureDate + " / 재료 : " + materials();
	}
	
	public String materials() {
		
		StringBuilder sb = new StringBuilder();	// 가변성
		
		for(String materialList : material) {
			
			sb.append(materialList).append(", ");
			
		}
		
		if(sb.length() > 0 ) {
			
			sb.setLength(sb.length() - 2);	// 마지막 ", " 지우는 코드
			
		}
		
		return sb.toString();
	}
	
	
}

	
	
	
	
	
	

