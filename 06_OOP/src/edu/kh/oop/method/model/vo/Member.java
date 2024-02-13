package edu.kh.oop.method.model.vo;
// vo = value object
public class Member { // 속성 + 기능

	// 필드 
	private String memberId;   // 아이디
	private String memberPw;   // 비밀번호
	private String memberName; // 이름
	private int memberAge;     // 나이
	
	// 생성자
	// 생성자 규칙 : 반환형이 없고, 클래스명과 이름이 같아야 함!
	// ctrl + space >> 첫번째꺼 enter(자동완성)
	public Member() {} // 기본 생성자
	
	// 매개변수 생성자 (필드 모두 초기화)
	// alt + shift + s >> Generate Constructor using Fields
	public Member(String id, String pw, String name, int age) {
		// 오버로딩 적용(기본 생성자와 매개변수 개수 다름)
		
		// 매개 변수로 전달받은 값을 필드로 대입시키기
		memberId = id;
		memberPw = pw;
		memberName = name;
		memberAge = age;
		// 매개변수와 필드변수의 이름이 같은 경우
		// this.필드변수 = 매개변수;
		
	}
	
	
	// 메서드(getter / setter 포함)
	
	// alt + shift + s >> r
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	
	
}
