package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = i + 1;
			
			System.out.print(arr[i] + " ");
			
			if(i % 2 == 0) {
				
				sum += arr[i];
			}
			
		}
		System.out.println();
		
		System.out.printf("짝수 번째 index 합 : %d\n", sum);
		
	}
	
	public void practice2() {
		
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = 8; i >= 0; i --) {
			
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
			
			if(i % 2 == 1 ) {
				
				sum += arr[i];
			
			}
			
		}
		
		System.out.println();
		System.out.println("홀수 번째 index 합 : " + sum);
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		
		for (int i = 0; i < arr.length; i ++) {
			
			arr[i] = i + 1;
			
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length ; i++) {
			
			System.out.print("입력 " + i + " : ");
			int input = sc.nextInt();
			
			arr[i] = input;
			
		}
		
		boolean flag = false;
		
		System.out.print("검색할 값 : ");
		int input2 = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == input2) {
				
				System.out.printf("인덱스 : %d\n", i);
				flag = true;
				
			} 
			
		}
		
		if(!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.next();
		
		char[] arr = new char[input.length()];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = input.charAt(i);
			
		}
		
		System.out.print("검색할 문자 : ");
		char input2 = sc.next().charAt(0);
		
		for(int i = 0; i < arr.length; i++) {
			
			if(input2 == arr[i]) {
				
				System.out.printf("%s에 %s가 존재하는 위치(인덱스) : ");
				
			}
			
		}
		
	}

}




























