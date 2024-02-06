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
		
		System.out.printf("%s에 %s가 존재하는 위치(인덱스) : ", input, input2);
		
		int count = 0;
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++) {
			
			String result = "";
			
			if(input2 == arr[i]) {
				
				result += i + " ";
				count ++;
				flag = true;
				
			}
			System.out.print(result);
		}
		
		if(!flag) {
			System.out.println("입력한 문자가 존재하지 않습니다.");
			
		}
		System.out.println();
		System.out.println(input2 + " 개수 : " + count);
		
	}
	
	public void practice6() {
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			int num2 = sc.nextInt();
			
			arr[i] = num2;
			sum += num2;
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총합 : " + sum);
	}

	public void practice7() {
		
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.next();
		
		char[] arr = new char[idNum.length()];  // 14
		
		
		for(int i = 0; i < arr.length; i++) {
			
			if(i <= 7) {
				arr[i] = idNum.charAt(i);
			} else {
				arr[i] = '*';
			}
			
		}
		System.out.println(arr);
		
	}
	
}




























