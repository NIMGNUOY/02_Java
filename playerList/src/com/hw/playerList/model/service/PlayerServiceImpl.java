package com.hw.playerList.model.service;

import java.util.List;

import com.hw.playerList.model.dao.PlayerDAOImpl;
import com.hw.playerList.model.dto.Player;

public class PlayerServiceImpl implements PlayerService{
	
	private PlayerDAOImpl dao = null;

	
	public PlayerServiceImpl () throws Exception {
		
		dao = new PlayerDAOImpl();
	}
	
	@Override
	public String displayAllPlayers(){
		
		List<Player> playerList = dao.displayAllPlayers();
		StringBuilder sb = new StringBuilder();
		
		for(Player player : playerList) {
			
			sb.append( player );
			sb.append("\n");
			
		}
		
		return sb.toString();
	}

	@Override
	public Player DetailInformationForPlayer(int index) throws Exception {
		
		Player player = dao.DetailInformatrionForPlayer( index );
		
		if(player == null) return null;
		
		return player;
		
	}

	@Override
	public Player addPlayer(String name) {
		
		Player player = dao.addPlayer( name );
		
		return null;
	}

}
























