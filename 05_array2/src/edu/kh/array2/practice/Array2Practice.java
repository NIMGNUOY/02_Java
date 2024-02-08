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
		int[] row_arr = new int[4];
		
		for(int row = 0; row < arr.length; row++) { // 행 반복
			
			
			for(int col = 0; col < arr[row].length; col ++) { // 열 반복
				
				arr[row][col] = num;
				num++;
				
			}
			
		}

		System.out.println(Arrays.toString(row_arr));
	}
	
	public void practice3() {
		
		int[][] arr = new int[4][4];
		int num = 16;
		
		for(int row = 0; row < arr.length; row++) {
			
			for(int col = 0; col < arr[row].length; col++) {
				
				arr[row][col] = num;
				num--;
				
			}
			
		}
		System.out.println(Arrays.deepToString(arr));
		
	}
	
	public void practice4() {
		
		int[][] arr = new int[4][4];
		
		for(int row = 0; row < arr.length; row++) {
			
			for(int col = 0; col < arr[row].length; col++) {
				
				int random = (int) ( Math.random() * 10 + 1 );
				arr[row][col] = random;
				
			}
			
		}
		System.out.println(Arrays.deepToString(arr));
	}
	
}
























