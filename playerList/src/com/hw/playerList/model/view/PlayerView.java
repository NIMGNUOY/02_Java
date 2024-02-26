package com.hw.playerList.model.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.hw.playerList.model.service.PlayerService;
import com.hw.playerList.model.service.PlayerServiceImpl;

public class PlayerView {

	private BufferedReader br = null;
	
	private PlayerServiceImpl service = null;
	
	public PlayerView() {
		
		try {
			
			br = new BufferedReader( new InputStreamReader( System.in ) );
			service = new PlayerServiceImpl();
			
		} catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
	}	
	
	
	
}
