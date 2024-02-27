package com.hw.playerList.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.hw.playerList.model.dao.PlayerListDAO;
import com.hw.playerList.model.dao.PlayerListDAOImpl;
import com.hw.playerList.model.dto.Player;

public class PlayerServiceImpl implements PlayerService{
	
	private PlayerListDAO dao = null;
	
	public PlayerServiceImpl() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		
		dao = new PlayerListDAOImpl();
	}

	@Override
	public List<Player> displayAllPlayers() {
		
		List<Player> playerList = dao.displayAllPlayers();
		
		return playerList;
	}

	@Override
	public int addPlayer(String name, int age, String nationality, String team, int backNum) throws Exception {
		
		int result = dao.addPlayer(name, age, nationality, team, backNum);
		
		if(result == -1) return -1;
		
		return result;
	}

	@Override
	public Player updatePlayerInfo(int index) throws Exception{
		
		Player player = dao.updatePlayerInfo( index );
		
		if(player == null) return null;
		
		
		
		return player;
	}

	@Override
	public boolean deletePlayer( int index ) throws Exception{
		
		boolean result = dao.deletePlayer(index);
		
		return result;
	}

	@Override
	public Map<String, List<Player>> sortByNationality() {
		
		Map<String, List<Player>> sortByNationality = dao.sortByNationality();
		return sortByNationality;
	}

	@Override
	public List<Player> playerWillingToTransfer() {
		List<Player> playerList = dao.playerWillingToTransfer();
		return playerList;
	}

}
