package edu.kh.array2.practice.service;

import java.util.Arrays;
import java.util.Scanner;

import javax.annotation.processing.AbstractProcessor;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice7() {
		
		String[] student = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		int num = 0;
		
		System.out.println("==1분단==");
		for(int row = 0; row < arr1.length; row ++) {
			
			for(int col = 0; col < arr1[row].length; col ++) {
				
				arr1[row][col] = student[num];
				num++;
				
				System.out.print(arr1[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("==2분단==");
		for(int row = 0; row < arr2.length; row ++) {
			
			for(int col = 0; col < arr2[row].length; col ++) {
				
				arr2[row][col] = student[num];
				num++;
				
				System.out.print(arr2[row][col] + " ");
				
			}
			System.out.println();
		}
		
	}

	public void practice8() {
	
		String[] student = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		int num = 0;
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
	
		System.out.println("==1분단==");
		for(int row = 0; row < arr1.length; row ++) {
			
			for(int col = 0; col < arr1[row].length; col ++) {
				
				arr1[row][col] = student[num];
				num ++;
				System.out.print(arr1[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("==2분단==");
		for(int row = 0; row < arr2.length; row++) {
			
			for(int col = 0; col < arr2[row].length; col ++) {
				
				arr2[row][col] = student[num];
				num++;
				System.out.print(arr2[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("===============================================");
		
		int seat = 0; // 분단 출력 변수
		int row = 0; // 몇번째 줄 출력 변수
		String direction = null; // "왼쪽" / "오른쪽" 출력 변수
		
		System.out.print("검색할 학생 이름을 검색해주세요 : ");
		String name = sc.next();
		
		for(int i = 0; i < arr1.length; i ++) {
			
			for(int j = 0; j < arr1[i].length; j ++) {
				
				if(arr1[i][j].equals(name)) {
					
					seat = 1;
					row = i + 1;
					direction = j == 0 ? "왼쪽" : "오른쪽" ; // 삼항연산자
				}
			}
		}
		
		for(int i = 0; i < arr2.length; i ++) {
			
			for(int j = 0; j < arr2[i].length; j ++) {
				
				if(arr2[i][j].equals(name)) {
					
					seat = 2;
					row = i + 1;
					direction = j == 0 ? "왼쪽" : "오른쪽" ;
				}
			}
		}
		
		if (seat != 0) {   // 검색값과 일치한 학생이 있는 경우
			System.out.printf("검색하신 %s 학생은 %d분단 %d번째 줄 %s에 있습니다.\n", name, seat, row, direction);
		} else if (seat == 0) {  // 검색값과 일치한 학생이 없는 경우
			System.out.println("검색하신 학생은 없습니다.");
		}
	}	
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] arr = new String[6][6];
		
		for(int i = 0; i < arr.length - 1; i ++) { // 한칸을 비워두기 위해 배열 길이에 - 1
			
			arr[0][i + 1] = i + " "; // 0행 index 만들기 0행0열 빈칸
			arr[i + 1][0] = i + " "; // 0열 index 만들기 0행0열 빈칸
		}
		// 빈 배열을 만들땐 배열 자료형을 String 으로 할것!!
		
		int rowIdx = 0;
		int colIdx = 0;
		
		while( true ) {
		
			System.out.print("행 인덱스 입력 : ");
			rowIdx = sc.nextInt();
			
			if(rowIdx < 0 || rowIdx > 4 ) {
				System.out.println("0 ~ 4 사이의 값을 입력해주세요.");
				continue;
			}
			break;
		}
		
		while(true) {
			
			System.out.print("열 인덱스 입력 : ");
			colIdx = sc.nextInt();
			
			if(colIdx < 0 || colIdx > 4) {
				System.out.println("0 ~ 4 사이의 값을 입력해주세요.");
				continue;
			} // 조건이 충족되면 프린트 수행후 continue 를 통해 반복문의 처음으로 
			  // 조건이 충족되지 않으면 break 를 통해 반복문 종료.
			break;
		}
		
		for(int row = 0; row < arr.length ; row ++) {
			
			for(int col = 0 ; col < arr[row].length ; col++) {
				
				if(row == rowIdx && col == colIdx) {
					arr[row +1][col +1] = "X ";  // 0행 과 0열은 index 행열 이기 때문에 + 1 로 위치를 맞춤
				}
				
				if(arr[row][col] == null) {  // null 표시를 없애기 위해 "  "; 를 대입해 빈칸으로
					arr[row][col] = "  ";
				}
				System.out.print(arr[row][col]);
			}
			System.out.println();
		}
		
	}

	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		/*
		String[][] arr = new String[6][6];
		
		for(int i = 0; i < arr.length - 1; i ++) {
			arr[0][i + 1] = i + " ";
			arr[i + 1][0] = i + " ";
		}
		
		int rowIdx = 0;
		int colIdx = 0;
		
		while(true) {
			
			System.out.print("행 인덱스 입력 : ");
			rowIdx = sc.nextInt();
			
			if(rowIdx < 0 || rowIdx > 4) {
				System.out.println("0 ~ 4 사이의 값을 입력해주세요");
				continue;
			}
			break;
		}
		
		while(true) {
			
			System.out.print("열 인덱스 입력 : ");
			colIdx = sc.nextInt();
			
			if(colIdx < 0 || colIdx > 4) {
				System.out.println("0 ~ 4 사이의 값을 입력해주세요");
				continue;
			}
			break;
		}
		
		for(int row = 0; row < arr.length; row ++) {
			
			for(int col = 0; col < arr[row].length; col++) {
				
				if(row == rowIdx && col == colIdx) {
					arr[row][col] = "X ";
				}
				if(arr[row][col] == null) {
					arr[row][col] = "  ";
				}
				System.out.print(arr[row][col]);
			}
			System.out.println();
		}
		*/
		
		String[][] arr = new String[6][6];
		
		for(int i = 0; i < arr.length - 1; i ++) {
			arr[0][i + 1] = i + " ";
			arr[i + 1][0] = i + " ";
		}
		
		
		while(true) {  // 전체 반복
			
			boolean flag = false; // 행 인덱스 값이 99 일때 반복 중단시킬 변수 flag
			int rowIdx = 0;
			int colIdx = 0;
			
			while(true) {
				
				System.out.print("행 인덱스 입력 : ");
				rowIdx = sc.nextInt();
				
				if (rowIdx == 99) {
					flag = true;   // 행 인덱스 값 99 일때 true 전환
					System.out.println("프로그램 종료");
				} else if(rowIdx < 0 || rowIdx > 4) {  // 이 조건이 처음에 있으면 99값이 입력됐을 때 조건에 충족되서
													   // 이 조건문의 결과가 먼저 출력되므로 뒤에 써줘야 함.
					System.out.println("0 ~ 4 사이의 값을 입력해주세요");
					continue;
				}
				break;
			}
			
			if(flag) { // 행 인덱스 값이 99가 입력이 됐다면 큰 while 반복문 종료 --> 프로그램 종료
				break;
			}
			
			while(true) {
				
				System.out.print("열 인덱스 입력 : ");
				colIdx = sc.nextInt();
				
				if(colIdx < 0 || colIdx > 4) {
					System.out.println("0 ~ 4 사이의 값을 입력해주세요");
					continue;
				} 
				break;
			}
			
			for(int row = 0; row < arr.length; row ++) {
				
				for(int col = 0; col < arr[row].length; col ++) {
					
					if(row == rowIdx && col == colIdx) {
						arr[row + 1][col + 1] = "X ";
					}
					if(arr[row][col] == null) {
						arr[row][col] = "  ";
						
					}
					System.out.print(arr[row][col]);
				}
				System.out.println();
			}
		}
	}

}






















