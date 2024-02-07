package edu.kh.oop.basic;

public class AccountRun {
	
	public static void main(String[] args) {
		
		Account ac = new Account();
		
		// setter 정보 입력
		ac.setName("홍길동");
		ac.setAccountNumber("486-910568-23485");
		ac.setBalance(10000);
		ac.setPassword("asdf1234");
		
		// getter 정보 획득
		ac.getName();
		ac.getAccountNumber();
		ac.getBalance();
		ac.getPassword();
		
		// 입금
		ac.deposit(3000);
		
		ac.deposit(5000);
		
		ac.withdraw("asdf1234", 8000);
		
		ac.withdraw("asdf1234", 8000);
		
		ac.withdraw("asdf1234", 8000);
		ac.withdraw("fdsa4321", 1000);
		
		
		
		
	}

}
