package edu.kh.lambda.test.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.kh.lambda.test.LambdaTest;

public class TestRun {

	public static void main(String[] args) {
		
		LambdaTest lt = new LambdaTest();
		
		lt.ex();
		
		System.out.println("----------------------------------");
		
		// Comparator 의 compare 메서드를 람다식으로 대체하여 사용해보기
		
		// 숫자 리스트 생성
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(5);
		numbers.add(17);
		numbers.add(56);
		numbers.add(9);
		
		System.out.println("정렬 전 : " + numbers);
		
		// 숫자를 오름차순으로 정렬하는 람다식
		Collections.sort(numbers, (a, b) -> a - b);
		
		System.out.println("정렬 후 : " + numbers);
		
		// 숫자를 내림차순으로 정렬하는 람다식
		Collections.sort(numbers, (a, b) -> b - a);
		
	}
	
}
