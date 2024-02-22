package com.hw4.model.dto;

import java.util.Objects;
import java.util.Set;

public class ToySolution {

	private String name;
	private int age;
	private int price;
	private String color;
	private String manufactureDate;
	private Set<String> materials;

	public ToySolution() {
		// TODO Auto-generated constructor stub
	}

	public ToySolution(String name, int age, int price, String color, String manufactureDate, Set<String> materials) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.manufactureDate = manufactureDate;
		this.materials = materials;
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

	public Set<String> getMaterials() {
		return materials;
	}

	public void setMaterials(Set<String> materials) {
		this.materials = materials;
	}

	// materials 안에 있는 모든 재료를 문자열 형태로 만들어 반환하는 메서드
	public String getMaterialsAsString() {
		
		StringBuilder sb = new StringBuilder();		// 가변성
		
		for(String material : materials) {
			sb.append(material).append(", ");
		}
		// ex) [고무, 플라스틱, ] --> sb.length() = 10
		
		// 마지막 쉼표와 공백 제거하기
		if(sb.length() > 0) {	// sb.length() > 0 이란 말은 sb 객체내에 값이 있다라는 뜻으로
								// 객첵 내 값 + ", " 인 상태 이므로
								// setLength() 메서드를 사용하여 마지막 문자 2개만큼의 길이를
								// 줄여 쉼표와 공백을 없앤다.
			sb.setLength(sb.length() - 2);
		}
		
		return sb.toString();
		
	}
	
	
	@Override
	public String toString() {
		return String.format("이름 : %s / 가격 : %d / 색상 : %s / 사용가능연령 : %d / 제조년월일 : %s / 재료 : %s",
				name, price, color, age, manufactureDate, getMaterialsAsString());
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, color, manufactureDate, materials, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToySolution other = (ToySolution) obj;
		return age == other.age && Objects.equals(color, other.color)
				&& Objects.equals(manufactureDate, other.manufactureDate) && Objects.equals(materials, other.materials)
				&& Objects.equals(name, other.name) && price == other.price;
	}
	
	
	
}


















