package com.hw.playerList.model.service;

import java.util.List;

import com.hw.playerList.model.dto.Player;

public interface PlayerService {

	public abstract String displayAllPlayers();

	public abstract Player DetailInformationForPlayer(int index) throws Exception;

	public abstract Player addPlayer(String name, int age, int backNum, String nationality, String team);

	
	
}
