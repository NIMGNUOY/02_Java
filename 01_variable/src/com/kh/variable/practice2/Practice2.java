package com.kh.variable.practice2;

import java.util.Scanner;

public class Practice2 {

	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		String str1 = sc.next();
		// == char str1 = sc.next().charAt(0);
		
		System.out.printf("%s unicode : %d\n", str1.charAt(0), (int)str1.charAt(0));
		// == System.out.printf("%s unicode : %d\n", str1, (int)str1);
		
		
		
	}
	
}
