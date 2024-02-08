package edu.kh.oop.abstraction.model.vo;

public class Hero {  // 영웅 클래스

	// 추상화
	// 멤버 변수
	private String nickName;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private int exp;
	
	// 캡슐화
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public void attack(int expUp) {
		
		System.out.printf("%s 은/는 공격을 했다!\n", nickName);
		exp += expUp;
		System.out.println("현재 exp : " + exp);
		if(exp >= 500 * level) {
			
			level++;
			System.out.println("레벨이 올랐습니다.");
			System.out.println("현재 레벨 : " + level);
			
		}
		System.out.println("==========================================");
	}
	
	public void magicJump() {
		
		
		if(mp < 10) {
			
			System.out.println("더 이상 매직 점프할 수 없어요!");
			
		} else {
			
			System.out.println(nickName + "의 점프!");
			mp -= 10;
			System.out.println("현재 mp : " + mp);
			
		}
		
		System.out.println("==========================================");
	}
}























