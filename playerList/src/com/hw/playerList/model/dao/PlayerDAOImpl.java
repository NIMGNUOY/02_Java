package com.hw.playerList.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.hw.playerList.model.dto.Player;

public class PlayerDAOImpl implements PlayerDAO{
	
	private final String FILE_PATH = "/io_test/players.dat";
	
	ObjectInputStream ois = null;
	ObjectOutputStream oos = null;
	List<Player> playerList = null;
	
	public PlayerDAOImpl() throws Exception {
		
		File file = new File( FILE_PATH );
		
		if(file.exists()) {
			
			try {
				
				// 있던 파일을 자바에 입력받음
				ois = new ObjectInputStream ( new FileInputStream( FILE_PATH ) );
				
				playerList = (List<Player>) ois.readObject();
				
			} finally {
				
				if(ois != null) ois.close();
				
			}
			
		} else {
			
			File directory = new File("/io_test");
			
			if( !directory.exists() ) directory.mkdir();
			
			playerList = new ArrayList<Player>();
			
			playerList.add( new Player ("손흥민", 33, 7, "Republic of Korea", "TottenHam Spurs") );
			playerList.add( new Player ("김민재", 29, 3, "Republic of Korea", "Bayern Munich") );
			playerList.add( new Player ("킬리안 음바페", 27, 10, "French", "Paris Saint") );
			playerList.add( new Player ("엘링 홀란드", 25, 9, "Norway", "Mancherster City") );
			playerList.add( new Player ("모하메드 살라", 33, 11, "Egypt", "Liverpool") );
			
			try {
				
				oos = new ObjectOutputStream( new FileOutputStream(FILE_PATH) );
				oos.writeObject( playerList );
				
				
			} finally {
				
				if(oos != null) oos.close();
				
			}			
			System.out.println("===== 파일 생성 완료 =====");
		}
		
	}
	

	@Override
	public List<Player> displayAllPlayers() {
		
		return playerList;
		
	}


	public Player DetailInformatrionForPlayer(int index) {
		
		if( index < 0 || index >= playerList.size() ) return null;
		
		Player player = playerList.get(index);
		
		return player;
	}


	public void addPlayer(String name, int age, int backNum, String nationality, String team) {
		// TODO Auto-generated method stub
		
	}


	


	

}
