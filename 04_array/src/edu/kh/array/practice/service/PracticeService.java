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
		
		for(int i = 0; i < arr.length; i ++) {
			
			arr[i] = arr.length - i;
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
	
	public void practice8() {
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		boolean flag = false;
		/*
		if(input % 2 == 0 || input < 3) {
			
			System.out.println("다시 입력하세요.");
			System.out.print("정수 : ");
			int input2 = sc.nextInt();
			
			for(int i = 0; i < arr.length; i++) {
				
				
				
			}
			
		}
		*/
		
		
		
	}
	
	
	
	public void practice9() {
		
		int[] arr = new int[10];
		
		
		System.out.print("발생한 난수 : ");
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)( Math.random() * 10 + 1 );
			
			arr[i] = random;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice10() {
		
		int[] arr = new int[10];
		
		int max = 0;
		int min = 10;
		
		System.out.print("발생한 난수 : ");
		
		for(int i = 0; i < arr.length; i ++) {
			int random = (int) (Math.random() * 9 + 1);
			
			arr[i] = random;
			System.out.print(arr[i] + " ");
			
			
			if(arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	public void practice11() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			
			int random = (int) (Math.random() *  10 + 1);
			// 0.0 <= x < 1.0
			// 0.0 <= x * 9 < 9.0
			// 1.0 <= x * 9 + 1 < 10.0
			// 1 <= (int)(x * 9 + 1) < 10

			arr[i] = random;
		
			
			for(int x = 0; x < i; x++) {
				
				if (random == arr[x]) {
					
					i--;
					break;
					
				}
			}
			
			
		}
		System.out.println (Arrays.toString(arr) );
	}
	
	public void practice12() {
		
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			
			int random = (int) ( Math.random() * 45 + 1);
			
			lotto[i] = random;
			
			for(int x = 0; x < i; x ++) {
				
				if(random == lotto[x]) {
					
					i--;
					break;
					
				}
				
			}
			
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
	
	public void practice13() {
		
		System.out.print("문자열 : ");
		String input = sc.next();
		
		char[] ch = new char[input.length()];
		int length = input.length();
		
		for(int i = 0; i < ch.length; i ++) {
			
			ch[i] = input.charAt(i);
			
			
			for(int x = 0; x < i; x ++) {
				
				if(input.charAt(i) == ch[x]) {
					
					length --;
					
					
					break;
					
				}
				
			}
		}
		System.out.println("문자열에 있는 문자 : " + Arrays.toString(ch));
		System.out.println("문자 개수 : " + length);
		
	}
	
	public void practice14() {
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int input = sc.nextInt();
		
		String[] arr = new String[input];
		int count = 0; // 입력 문자열 누적횟수 카운트 변수
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.printf("%d번째 문자열 : ", (i + 1)  );
			
			String input2 = sc.next();
			arr[i] = input2 ;
			count ++;
		}
		System.out.println(Arrays.toString(arr));
		
		boolean flag = false;
		
		System.out.print("더 값을 입력하시겠습니까(Y/N) : ");
		char input3 = sc.next().charAt(0);
		
		if(input3 == 'y') {
			
			System.out.print("더 입력하고 싶은 개수 : ");
			int input4 = sc.nextInt();
			String[] arr_copy = new String[arr.length + input4];
			
			for(int i = 0; i < arr_copy.length; i++ ) {
				
				System.out.printf("%d번째 문자열 : ",count + 1);
				String input5 = sc.next();
				
				if(i < input) {
					arr_copy[i] = arr[i];
				} else if (i >= input) {
					arr_copy[i] = input5;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}
}




























