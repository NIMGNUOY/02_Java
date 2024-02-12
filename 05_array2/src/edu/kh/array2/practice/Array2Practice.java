package edu.kh.array2.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Practice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		int[][] arr = new int[3][3];
		
		int num = 0;
		
		for(int row = 0; row < arr.length; row ++) {
			
			for(int col = 0; col < arr[row].length; col++) {
				
				int[] in_arr = {row, col};
				System.out.print(Arrays.toString(in_arr));
				if(col == 2) { // 행바꾸기
					System.out.println();
				}
			}
			
		}
		
	}
	
	public void practice2() {
		
		int[][] arr = new int[4][4];
		int num = 1;
		
		for(int row = 0; row < arr.length; row++) { // 행 반복
			
			
			for(int col = 0; col < arr[row].length; col ++) { // 열 반복
				
				arr[row][col] = num;
				num++;
				
				
				if(col  == 0 ) {
					System.out.printf("%3d " , arr[row][col]);
				} else if (col % 3 == 0) {
					System.out.printf("%3d\n", arr[row][col]);
				} else {
					System.out.printf("%3d", arr[row][col]);
				}
				
			}
			
		}


	}
	
	public void practice3() {
		
		int[][] arr = new int[4][4];
		int num = 16;
		
		for(int row = 0; row < arr.length; row++) {
			
			for(int col = 0; col < arr[row].length; col++) {
				
				arr[row][col] = num;
				num--;
				
				if(col == 0) {
					System.out.printf("%3d", arr[row][col]);
				} else if (col % 3 == 0) {
					System.out.printf("%3d\n", arr[row][col]);
				} else {
					System.out.printf("%3d", arr[row][col]);
				}
				
			}
			
		}
		
		
	}
	
	public void practice4() {
		
		int[][] arr = new int[4][4];
		
		int row_lastIndex = arr.length - 1;
		int col_lastIndex = arr[0].length - 1;
		
		for(int row = 0; row < row_lastIndex;  row++) {
			
			
			for(int col = 0; col < col_lastIndex ; col++) {
				
				int random = (int) ( Math.random() * 10 + 1 );
				
				arr[row][col] = random;
				
				// 난수대입과 동시에 행 , 열 합계
				arr[row][3] += arr[row][col]; // 행 합계
				arr[3][col] += arr[row][col]; // 열 합계
				// 행 , 열 합계 구하는법 알아두기!!
				
				
			}
			
		}
		
		for(int row = 0; row < arr.length ; row ++) {
			
			for (int col = 0 ; col < arr[row].length; col ++) {
				
				System.out.printf("%3d", arr[row][col]);
				
				if(row == row_lastIndex || col == col_lastIndex) {
					arr[row_lastIndex][col_lastIndex] += arr[row][col];
				}
			}
			System.out.println();
		}
		
	}
	
	public void practice5() {

		
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			
			System.out.print("행 크기 : ");
			int rowIndex = sc.nextInt();
			
			System.out.print("열 크기 : ");
			int colIndex = sc.nextInt();
			
			if(rowIndex < 1 || rowIndex > 10 || colIndex < 1 || colIndex > 10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			} else {
				
				char[][] arr = new char[rowIndex][colIndex];
				
				for(int row = 0; row < arr.length; row ++) {
					
					for(int col = 0; col < arr[row].length; col++) {
						
						arr[row][col] = (char) (Math.random() * 26 + 65);
					}
				}
				
				for(int row = 0; row < arr.length; row ++) {
					for(int col = 0; col < arr[row].length; col++) {
						System.out.printf("%2c", arr[row][col]);
					}
					System.out.println();
				}
				break;
			}
			
		}
		
	}

	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 개수 : ");
		int rowIdx = sc.nextInt();
		
		char[][] arr = new char[rowIdx][];   // 행의 개수만 정해줌
		char ch = 'a';
		
		for(int i = 0; i < rowIdx; i++) {
			System.out.print(i + "행의 길이 : ");
			int colIdx = sc.nextInt();
			
			arr[i] = new char[colIdx];  // 각 행의 열의 개수를 정해줌
			
		}
		
		for(int row = 0; row < arr.length; row++) {
			
			for (int col = 0 ; col < arr[row].length; col ++) {
				
				arr[row][col] = ch++; 
				
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
	}


}

























