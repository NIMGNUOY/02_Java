package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.Hero;

public class HeroService {  // 기능제공용 클래스

	
	public void hero() {
		
		Hero hr1 = new Hero();
		
		hr1.setNickName("영돌");
		hr1.setJob("도적");
		hr1.setHp(1000);
		hr1.setMp(100);
		hr1.setLevel(1);
		hr1.setExp(0);
		
		System.out.printf("%s 직업으로 '%s' 님이 생성되었습니다.\n",
					hr1.getJob(), hr1.getNickName()
				);
		
		hr1.attack(100);
		hr1.magicJump();
		hr1.magicJump();
		hr1.magicJump();
		hr1.magicJump();
		hr1.magicJump();
		hr1.magicJump();
		hr1.magicJump();
		hr1.magicJump();
		hr1.magicJump();
		hr1.magicJump();
		hr1.magicJump();
		hr1.magicJump();
		hr1.magicJump();
		hr1.attack(400);
		hr1.attack(500);
		hr1.attack(200);
		hr1.attack(350);
		
		Hero hr2 = new Hero();
		
		hr2.setNickName("하인즈");
		hr2.setJob("마법사");
		hr2.setHp(400);
		hr2.setMp(1000);
		hr2.setLevel(1);
		hr2.setExp(0);
		
		System.out.printf("%s 직업으로 '%s' 님이 생성되었습니다.\n",
				hr2.getJob(), hr2.getNickName()
			);
		
		hr2.attack(500);
		hr2.magicJump();
		hr2.magicJump();
		hr2.magicJump();
		hr2.magicJump();
		hr2.magicJump();
		hr2.magicJump();
		hr2.magicJump();
		hr2.attack(200);
	}
	
	
	
	
	
}
