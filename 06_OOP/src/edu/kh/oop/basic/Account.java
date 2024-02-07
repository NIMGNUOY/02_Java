package edu.kh.oop.basic;

import java.util.Scanner;

public class Account {
	
	Scanner sc = new Scanner(System.in);

	// 이름
	// 계좌 번호
	// 잔액
	// 비밀번호
	// 추상화 + 캡슐화
	/*
	 * [메서드]
	 * getter / setter
	 * deposit() : 전달받은 금액을 잔액에
	 * 		누적한 후, 현재 잔액을 콘솔에 출력
	 * withdraw() : 비밀번호와 출금할 금액을
	 * 			전달받아와, 조건에 맞으면 잔액에서
	 * 			차감 후 현재 잔액 출력
	 * 		조건 1) 비밀번호와 일치하지 않으면 "비밀번호 불일치" 출력
	 * 			 2) 출금할 금액이 잔액보다 크면 "잔액 부족" 출력
	 * 
	 */
	
	// 추상화
	
	private String name;
	private String accountNumber;
	private int balance;
	private String password;
	
	// 캡슐화
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	// 입금
	public void deposit(int x) {
		
		balance += x;
		System.out.println("잔액 : " + balance);
		
	}
	
	public void withdraw(String pw, int y) {
		
		if(balance < y) {
			System.out.println("잔액 부족");
			System.out.println("잔액 : " + balance);
			return;
		} else if (!password.equals(pw)) {  // String 비교 할때 equal 연산자!!
			System.out.println("비밀번호 불일치");
			return; // 메서드 종료 -> 호출한 곳으로 돌아감
		} else {
			balance -= y;
			System.out.println("잔액 : " + balance);
		}
		
	}
	
}



















