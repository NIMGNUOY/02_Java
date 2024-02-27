package com.hw.playerList.model.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.hw.playerList.model.dto.Player;
import com.hw.playerList.model.service.PlayerService;
import com.hw.playerList.model.service.PlayerServiceImpl;

public class PlayerView {

	private BufferedReader br = null;
	
	private PlayerService service = null;
	
	public PlayerView() {
		
		try {
			
			br = new BufferedReader( new InputStreamReader( System.in ) );
			service = new PlayerServiceImpl();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}	
	
	public void startMenu() {
		
		int menuNum = 0;
		
		do {
			
			System.out.println("======= <<Start Menu>> =======");
			System.out.println("1. Display All Players");
			System.out.println("2. Detail Information for Player");
			System.out.println("3. Add Player Information");
			System.out.println("4. Update Player Information");
			System.out.println("5. Sort by Nationality ");
			System.out.println("6. Delete Player Information");
			System.out.println("0. Program Exit");
			System.out.print("Select Menu Number >> ");
			
			try {
				
				menuNum = Integer.parseInt( br.readLine() );
				
				switch(menuNum) {
				
				case 1 : displayAllPlayers(); break;
				case 2 : DetailInformationForPlayer(); break;
				case 3 : addPlayer(); break;
				case 4 : /*UpdatePlayer();*/ break;
				case 5 : /*SortByNationality();*/ break;
				case 6 : /*DeletePlayer();*/ break;
				case 0 : System.out.println("==== 프로그램 종료 ====="); break;
				default : System.out.println("### 메뉴 목록에 있는 번호를 선택해 주세요 ###");
				
				}
				
			} catch (Exception e) {
				System.out.println("### 예외 발생 ###");
				menuNum = -1;
			}
			
		} while(menuNum != 0);
		
	}
	
	
	public void displayAllPlayers() throws Exception {
		
		System.out.println("\n=================[1. Display All Players]================\n");
		
		String content = service.displayAllPlayers();
		
		System.out.println( content );
		
		System.out.println("===========================================================");
		
	}
	
	public void DetailInformationForPlayer() throws Exception{
		
		System.out.println("\n=================[2. Detail Information for Player]================\n");
		
		System.out.print("인덱스 번호 입력 : ");
		int index = Integer.parseInt( br.readLine() );
		
		Player player = service.DetailInformationForPlayer( index );
		
		if(player == null)  System.out.println("### 입력한 인덱스에 해당하는 선수가 없습니다 ###");
		
		else System.out.println( player );
		
		
		System.out.println("===========================================================");
		
	}
	
	
	public void addPlayer() throws Exception{
		
		System.out.println("\n=================[4. Add Player Information]================\n");
		
		
		System.out.print("Name : ");
		String name = br.readLine();
		
		
		System.out.print("Age : ");
		int age = Integer.parseInt(br.readLine());
		
		System.out.print("BackNumber : ");
		int backNum = Integer.parseInt(br.readLine());
		
		System.out.print("Nationality : ");
		String nationality = br.readLine();
		
		System.out.print("Team : ");
		String team = br.readLine();
		
		Player player = service.addPlayer( name, age, backNum,
									nationality, team);
	
		
	}
	
}
























