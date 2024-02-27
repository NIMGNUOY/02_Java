package com.hw.playerList.run;

import java.io.IOException;

import com.hw.playerList.view.PlayerView;

public class PlayerListRun {

	public static void main(String[] args) {
		
		PlayerView pv = new PlayerView();
		
		try {
			pv.startView();
		} catch (IOException e) {
			System.out.println("### 입/출력 관련 예외 발생 ###");
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
}
