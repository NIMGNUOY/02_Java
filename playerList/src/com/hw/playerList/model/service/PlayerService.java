package com.hw.playerList.model.service;

import java.util.List;
import java.util.Map;

import com.hw.playerList.model.dto.Player;

public interface PlayerService {

	List<Player> displayAllPlayers();

	int addPlayer(String name, int age, String nationality, String team, int backNum) throws Exception;

	Player updatePlayerInfo(int index) throws Exception;

	boolean deletePlayer( int index ) throws Exception;

	Map<String, List<Player>> sortByNationality();

	List<Player> playerWillingToTransfer();

}
