package edu.kh.objarray.practice.model.service;

import java.util.Scanner;

import edu.kh.objarray.practice.model.vo.Employee;

public class EmployeeService {
	
	private Scanner sc = new Scanner(System.in);
	
	private Employee[] employees = new Employee[3];
	
	public void displayMenu() {
		
		int sel = 0;
		do {
			
			System.out.println("=== 직원 관리 프로그램 ===");
			System.out.println("1. 직원 정보 입력(3명)");
			System.out.println("2. 모든 직원 정보 출력");
			System.out.println("3. 특정 직원 정보 출력(이름 검색)");
			System.out.println("4. 특정 직원 급여/연봉 출력(사번 검색)");
			System.out.println("5. 모든 직원 급여 합/연봉 합 출력");
			System.out.println("6. 모든 직원중 급여가 가장 높은 직원의 이름, 부서, 급여 출력");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 >> ");
			sel = sc.nextInt();
			sc.nextLine();
			
			switch (sel) {
			case 1: initEmployee(); break;
			case 2: System.out.println( allEmployeesInformation() ); break;
			case 3: System.out.println( searchEmployee() ); break;
			case 4: System.out.println( salaryCheck() ); break;
			case 5: System.out.println( allSalaryCheck() ); break;
			case 6: topSalaryEmployee(); break;
			case 0: System.out.println("프로그램 종료."); break;

			default: System.out.println("잘못 입력하셨습니다.");
			}
			
		}while(sel != 0);
		
	}
	
	// 3명의 직원 정보를 입력받아 배열에 각 요소에 초기화  
	public void initEmployee() {
		// 사번, 이름, 부서, 직급, 급여 순서로 입력받기
		for(int i = 0; i < employees.length; i ++) {
			
			System.out.print("===" + (i + 1) + "번째 사원 정보 입력===\n");
			
			System.out.print("사번 : ");
			int eNum = sc.nextInt();
			
			System.out.print("이름 : ");
			String eName = sc.next();
			
			System.out.print("부서 : ");
			String eDept = sc.next();
			
			System.out.print("직급 : ");
			String job = sc.next();
			
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			
			employees[i] = new Employee(eNum, eName, eDept, job, salary);
		}
	}
	
	
	// 모든 직원 정보를 하나의 문자열로 반환
	public String allEmployeesInformation() {
		
		String str = "";
		
		for(int i = 0; i < employees.length; i ++) {
			str += "사번 : " + employees[i].geteNum() + ", 이름 : " + employees[i].geteName() + 
					", 부서 : " + employees[i].geteDept() + ", 직급 : " + employees[i].getJob() + 
					", 급여 : "+ employees[i].getSalary() + "\n";
		}
		return str;
	}
	
	// 특정 사원 정보 반환 메소드(이름 검색)
	// 일치하는 이름이 없을 경우 "일치하는 이름의 사원이 없습니다." 반환
	public String searchEmployee() {
		
		System.out.println("=== 특정 사원 정보 출력(이름 검색) ===");
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		String str1 = "";
		String str2 = "";
		boolean flag = false;
		
		for(int i = 0; i < employees.length; i++) {
			
			if(employees[i].geteName().equals(name)) {
				str1 = "사번 : " + employees[i].geteNum() + ", 이름 : " + employees[i].geteName() + 
						", 부서 : " + employees[i].geteDept() + ", 직급 : " + employees[i].getJob() +
						", 급여 : " + employees[i].getSalary() + "\n";
				
				flag = true;
			} else {
				str2 =  "일치하는 이름의 사원이 없습니다";
				
			}
		}
		
		if(flag) {
			return str1;
		} else {
			return str2;
		}
		
	}
	
	
	// 입력받은 사번과 일치하는 직원의 급여, 연봉 정보 반환(연봉 == 급여 * 12)
	// 일치하지 않는 경우 "사번이 일치하는 직원 없습니다." 반환
	public String salaryCheck() {
		
		System.out.println("=== 급여/연봉 조회 ===");
		System.out.print("사번 입력 : ");
		int num = sc.nextInt();
		
		boolean flag = false;
		String str1 = "";
		String str2 = "";
		
		for(int i = 0; i < employees.length; i++) {
			
			if(employees[i].geteNum() == num) {
				str1 = "급여 : " + employees[i].getSalary() + " / 연봉 : " + employees[i].getSalary() * 12 ;
				flag = true;
			} else {
				str2 = "사번과 일치하는 직원이 없습니다";
			}
		}
		
		if(flag) {
			return str1;
		} else {
			return str2;
		}
	}
	
	
	// 모든 사원 급여 합 반환
	public int allSalaryCheck() {
		
		System.out.println("=== 모든 사원 급여 합/연봉 합 ===");
		
		int sum_year = 0;
		
		
		for(int i = 0; i < employees.length; i++) {
			
			sum_year += employees[i].getSalary() * 12;
			
			
		}
		System.out.printf("전 직원 급여 합 : %d\n", sum_year / 12);
		System.out.print("전 직원 연봉 합 : ");
		return sum_year;
		
		
	}
	
	// 모든 직원중 급여가 가장 높은 직원 출력
	// (동일한 급여인 경우 사번이 낮은 사람이 출력)
	public void topSalaryEmployee() {
	
		
		int max = employees[0].getSalary();
		
		for(int i = 0; i < employees.length; i++) {
			
			if(employees[i].getSalary() > max) {
				
				max = employees[i].getSalary();
				
			} 
			
		}
		
		
	}
	
	
}
