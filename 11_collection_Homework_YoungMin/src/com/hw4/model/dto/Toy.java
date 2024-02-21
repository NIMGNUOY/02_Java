package com.hw4.model.dto;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import com.hw4.model.service.ToyFactory;

public  class Toy implements Comparable<Toy> {

	private String name;
	private int useAge;
	private int price;
	private String color;
	private int date;
	private String ingredient;
	
	public Toy() {}

	public Toy(String name, int useAge, int price, String color, int date, String ingredient) {
		super();
		this.name = name;
		this.useAge = useAge;
		this.price = price;
		this.color = color;
		this.date = date;
		this.ingredient = ingredient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUseAge() {
		return useAge;
	}

	public void setUseAge(int useAge) {
		this.useAge = useAge;
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

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	@Override
	public String toString() {
		return "이름 : " + name + " / 가격 : " + price + " / 색상 : " + color + 
				" / 사용가능연령 : " + useAge + " / 제조년월일 : " + date + " / 재료 : " + ingredient;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, date, ingredient, name, price, useAge);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return Objects.equals(color, other.color) && date == other.date && Objects.equals(ingredient, other.ingredient)
				&& Objects.equals(name, other.name) && price == other.price && useAge == other.useAge;
	}

	@Override
	public int compareTo(Toy toy) {
		
		return this.date - toy.date;
		// return (this.date - toy.date) * -1   --> 내림차순 정렬을 위해 음수로 만듬
	}

	

}

	
	
	
	
	
	

