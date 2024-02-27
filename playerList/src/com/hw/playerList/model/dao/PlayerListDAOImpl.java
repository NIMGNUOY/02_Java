package com.hw.playerList.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.hw.playerList.model.dto.Player;

public class PlayerListDAOImpl implements PlayerListDAO {
	
	private final String FILE_PATH = "/homework/PlayerList.dat";
	
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	
	private List<Player> playerList = null;
	
	public PlayerListDAOImpl() throws FileNotFoundException, IOException, ClassNotFoundException{
		
		File file = new File( FILE_PATH );
		
		if(file.exists()) {		// 파일이 존재하면
			
			
			try {
				
				ois = new ObjectInputStream ( new FileInputStream( FILE_PATH ) );
				playerList = (ArrayList<Player>) ois.readObject();
				
			} finally {
				
				if(ois != null) ois.close();
				
			}
			
		} else {
			
			File directory = new File ("/homework");
			
			if( !directory.exists() ) directory.mkdir();
			
			playerList = new ArrayList<Player>();
			
			playerList.add( new Player ("손흥민", 33, "Republic of Korea", "TottenHam Hotspurs", 7, false) );
			playerList.add( new Player ("김민재", 29, "Republic of Korea", "Bayern Munich", 3, false) );
			playerList.add( new Player ("킬리안 음바페", 27, "France", "Paris Saint", 10, true) );
			playerList.add( new Player ("엘링 홀란드", 25, "Norway", "Manchester City", 9, false) );
			playerList.add( new Player ("모하메드 살라", 33, "Egypt", "Liverpool", 11, false) );
			
			try {
				
				oos = new ObjectOutputStream ( new FileOutputStream( FILE_PATH ) );
				oos.writeObject(playerList);
				
			} finally {
				
				if(oos != null) oos.close();
				
			}
			
			System.out.println("*** PlayerList.dat 파일 생성 완료 ***");
			
		}
		
	}

	@Override
	public void saveFile() throws Exception {
		
		
		try {
			
			oos = new ObjectOutputStream ( new FileOutputStream( FILE_PATH ) );
			oos.writeObject(playerList);
			
		} finally {
			
			if(oos != null) oos.close();
			
			
		}
		
	}
	
	
	@Override
	public List<Player> displayAllPlayers() {
		
		return playerList;
	}

	@Override
	public int addPlayer(String name, int age, String nationality, String team, int backNum) throws Exception {
		
		for(Player player : playerList) {
			
			if(player.getName().equals(name)) {
				return -1;
			}
		
		}
		
		playerList.add( new Player(name, age, nationality, team, backNum, false) );
		saveFile();
		
		return playerList.size() - 1;
		
	}

	@Override
	public Player updatePlayerInfo(int index) throws Exception, IOException  {
		
		if(index < 0 || index >= playerList.size()) return null;
		
		saveFile();
		return playerList.get(index);
		
	}

	@Override
	public boolean deletePlayer(int index) throws Exception, IOException {
		
		if(index < 0 || index >= playerList.size()) return false;
	
		saveFile();
		
		return true;
	}

	@Override
	public Map<String, List<Player>> sortByNationality() {
		
		Map<String, List<Player>> sortByNationality = new HashMap<String, List<Player>>();
		
		for(Player player : playerList) {
			
			String nationality = player.getNationality();
			
			sortByNationality.putIfAbsent(nationality, new ArrayList<Player>());
			
			sortByNationality.get(nationality).add(player);
			
		}
		
		return sortByNationality;
	}

	@Override
	public List<Player> playerWillingToTransfer() {
		
		List<Player> TransferPlayer = new ArrayList<Player>();
		
		for(Player player : playerList) {
			
			if(player.isTranferIntention()) {
				TransferPlayer.add(player);
			}
		}
		
		return TransferPlayer;
	}

	
}
			
			

























