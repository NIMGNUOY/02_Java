package com.hw2.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;

public class Zoo {

	private List<Animal> animalList = new ArrayList<Animal>();
	
	private Scanner sc = new Scanner(System.in);
	
	public Zoo() {}
	
	public void addAnimal(Animal animal) {
		
		animalList.add(animal);
		
	}
	
	public void showAnimals() {
		
		System.out.println("동물들의 울음소리를 들어보세요 : ");
		
		for(Animal am : animalList) {
			am.sound();
		}
		
	}
	
	public void displayMenu() {
		
		int menuNum = 0;
		
		do {
			try {
				
				System.out.println("****** KH 동물원 ******");
				System.out.println("원하는 작업을 선택하세요 : ");
				System.out.println("1. 동물의 울음소리 듣기");
				System.out.println("2. 종료");
				System.out.print("선택 : ");
				menuNum = sc.nextInt();
				
				switch(menuNum) {
				case 1 : showAnimals(); break;
				case 2 : System.out.println("프로그램을 종료합니다."); break;
				default : System.out.println("번호를 잘못 입력하였습니다.");
				}
				
			} catch (InputMismatchException e) {
				System.out.println("Error : 입력방식이 올바르지 않습니다. 다시 입력해주세요.");
				sc.nextLine();
			}
			
		} while (menuNum != 2);
		
		
	}
}
















