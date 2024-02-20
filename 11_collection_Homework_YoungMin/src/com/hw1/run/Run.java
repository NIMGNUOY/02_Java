package com.hw1.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {
	

	public static void main(String[] args) {
		
		Friend f = new Friend();
		List<Friend> friend = new ArrayList<Friend>();
		
		friend.add(new Friend ("짱구"));
		friend.add(new Friend ("철수"));
		friend.add(new Friend ("유리"));
		friend.add(new Friend ("훈이"));
		friend.add(new Friend ("맹구"));
		
		
		// Collections.addAll();
//		Collections.addAll(friend, new Friend("짱구"), new Friend("철수"),
//				new Friend("유리"), new Friend("훈이"), new Friend("맹구"));
		
		// List.of() : Java 9 이상의 버전에서 사용 가능
//		List<Friend> friend = List.of(new Friend("짱구"), new Friend("철수"),
//				new Friend("유리"), new Friend("훈이"), new Friend("맹구"));
	
		// Random random = new Random(); 
		// --> Java 에서 제공하는 난수 생성 메서드
		
		int random = (int) ( Math.random() * friend.size() );
		
		f.setName( friend.get(random).getName() );
		
		f.pickLeader();	
			
			
		
		}
	
}
