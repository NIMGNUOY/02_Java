package com.hw4.controller;

import com.hw4.model.vo.Member;

public class MemberController {

	public static final int SIZE = 10;
	
	private int memberCount;
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
		return 0;
	}
	
	public Member[] getMem() {
		
	}
	
	public Member checkId(String userId) {
		
	}
	
	public void insertMember(Member m) {
		
	}
	
	public Member searchMember(int menu, String search) {
		
	}
	
	public void updateMember(Member m, int menu, String update) {
		
	}
	
	public void deleteMember(String userId) {
		
	}
	
	public Member[] sortIdAsc() {
		
	}
	
	public Member[] sortIdDesc() {
		
	}
	
	public Member[] sortAgeAsc() {
		
	}
	
	public Member[] sortAgeDesc() {
		
	}
	
	public Member[] sortGenderDesc() {
		
	}
}























