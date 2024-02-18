package com.hw4.controller;

import java.util.Arrays;

import com.hw4.model.vo.Member;

public class MemberController {

	public static final int SIZE = 10;
	
	private int memberCount = 0;
	
	private Member[] mem = new Member[SIZE];	
	
	{
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		memberCount = 5;
	}
	
	public int getMemberCount() {  // 멤버 카운트
		return this.memberCount;
	}
	
	public Member[] getMem() {
		
		return this.mem;		// 현재 회원 객체 배열의 주소 값을 반환해주는 메소드
		
	}
	
	public Member checkId(String userId) {
		
		Member m = null; // Member 자료형을 가진 변수 m 에 null 대입
		
		for(int i = 0 ; i < memberCount; i ++) {
			
			if(mem[i].getUserId().equals(userId)) {
				m = mem[i];		// 해당 아이디의 회원 정보를 반환
			} 
			
		}
		return m;		// 해당 아이디를 가진 회원이 없으면 null 반환
		
		
	}
	
	public void insertMember(Member m) {
		
		mem[memberCount] = m;
		memberCount ++;
		
	}
	
	public Member searchMember(int menu, String search) {
		
		
		
		switch (menu) {
		
		case 1 : for(int i = 0; i < memberCount; i++) {
			if(mem[i].getUserId().equals(search)) {
				return mem[i];
			}
		}
		case 2 : for(int i = 0; i < memberCount; i++) {
			if(mem[i].getName().equals(search)) {
				return mem[i];
			}
		}
		case 3 : for(int i = 0; i < memberCount; i ++) {
			if(mem[i].getEmail().equals(search)) {  
				return mem[i];
			}
		}
		default : return null;
		}
		
	}
	
	public void updateMember(Member m, int menu, String update) {
		
		switch(menu) {
		
		case 1 : m.setUserPwd(update); break;
		case 2 : m.setName(update); break;
		case 3 : m.setEmail(update); break;
		
		}
		
	}
	
	public void deleteMember(String userId) {
		
		for(int i = 0; i < memberCount; i ++) {
			
			if(mem[i].getUserId().equals(userId)) {
				
				for(int j = 0 ; j < memberCount; j ++) {
					
					mem[i] = mem[j + 1];		// 배열 한칸씩 앞으로 당기기
					
				}
				break;		// NullPointerException 방지
			}
		}
		memberCount --;
		
	}
	
	/*
	public Member[] sortIdAsc() {
		
		
		Member[] m = new Member[memberCount];
		
		
		
		for(int i = 0; i < memberCount; i ++) {
			
			Arrays.sort(mem[i].getUserId());
		}
		 
		
		return m;
	}
	
	public Member[] sortIdDesc() {
		
		
		
	}
	
	public Member[] sortAgeAsc() {
		
	}
	
	public Member[] sortAgeDesc() {
		
	}
	
	public Member[] sortGenderDesc() {
		
	}
	*/
}























