package com.hw.playerList.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.hw.playerList.model.dto.Player;
import com.hw.playerList.model.service.PlayerService;
import com.hw.playerList.model.service.PlayerServiceImpl;

public class PlayerView {

	private BufferedReader br = null;
	private PlayerService service = null;
	
	public PlayerView() {
		
		try {
			
			service = new PlayerServiceImpl();
			br = new BufferedReader ( new InputStreamReader( System.in ) );
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void startView() throws IOException, Exception {
		
		int menuNum = 0;
		
		do {
			
			menuNum = selectMenu();
			
			switch(menuNum) {
			
			case 1 : displayAllPlayers(); break;
			case 2 : addPlayer(); break;
			case 3 : updatePlayerInfo(); break;
			case 4 : deletePlayer(); break;
			case 5 : sortByNationality(); break;
			case 6 : playerWillingToTransfer(); break;
			case 0 : System.out.println("<<Program Exit>>"); break;
			default : System.out.println("### 메뉴목록에 있는 번호만 입력해 주세요 ###");break;
			
			}
			
			try {
				
			} catch(NumberFormatException e) {
				System.out.println("### 숫자만 입력해주세요 ###");
				menuNum = -1;
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		} while (menuNum != 0);
		
	}
	
	public int selectMenu() throws IOException, NumberFormatException{
		
		System.out.println("\n======== <<YB Agent Player List>> ========\n");
		System.out.println("1. Display All Players");
		System.out.println("2. Add Player");
		System.out.println("3. Update Player Information");
		System.out.println("4. Delete Player");
		System.out.println("5. Sort By Nationality");
		System.out.println("6. Player Willing to Transfer");
		System.out.println("0. Program Exit");
		
		System.out.print("Select Menu Number >> ");
		int input = Integer.parseInt(br.readLine());
		System.out.println();
		
		return input;
		
	}	
	
	public void displayAllPlayers() {
		
		System.out.println("\n==============[1. Display All Players]===============\n");
		
		List<Player> playerList = service.displayAllPlayers();
		
		int index = 1;
		
		for(int i = 0; i < playerList.size(); i ++) {
			
			String name = playerList.get(i).getName();
			
			int age = playerList.get(i).getAge();
			
			String nationality = playerList.get(i).getNationality();
			
			String team = playerList.get(i).getTeam();
			
			int backNum = playerList.get(i).getBackNum();
			
			String transferIntention = playerList.get(i).isTranferIntention() ? "O" : "X";
			
			System.out.printf("Player %d. Name : %s, Age : %d, Nationality : %s, Team : %s, BackNumber : %d, TranferIntention : %2s\n"
					, i + 1, name, age, nationality, team, backNum, transferIntention );
					
			
		}
		System.out.println("============================================================");
		
	}
	
	public void addPlayer() throws IOException , Exception{
		
		System.out.println("\n==============[2. Add Player]===============\n");
		
		System.out.print("Name : ");
		String name = br.readLine();
		
		System.out.print("Age : ");
		int age = Integer.parseInt(br.readLine());
		
		System.out.print("Nationality : ");
		String nationality = br.readLine();
		
		System.out.print("Team : ");
		String team = br.readLine();
		
		System.out.print("Back Number : ");
		int backNum = Integer.parseInt(br.readLine());
		
		int result = service.addPlayer(name, age, nationality, team, backNum);
		
		if(result == -1) System.out.println("### 이미 등록된 선수입니다 ###");
		
		else System.out.println("*** " + (result + 1) + "번째 선수 등록이 완료되었습니다 ***");
		
		System.out.println("=====================================================");
		
	}
	
	
	public void updatePlayerInfo() throws Exception {
		
		System.out.println("\n==============[3. Update Player Information]===============\n");
		
		System.out.print("Index Number Input >> ");
		int index = Integer.parseInt(br.readLine()) -1;
		
		Player player = service.updatePlayerInfo( index );
		System.out.println( player );
		
		if(player == null) System.out.println("### 입력한 인덱스에 등록된 선수가 없습니다 ###");
		
		System.out.print("Update Team : ");
		String team = br.readLine();
		
		System.out.print("Update BackNumber : ");
		int backNum = Integer.parseInt(br.readLine());
		
		System.out.print("Transfer Intention(O / X) : ");
		String transferIntention = br.readLine();
		
		player.setTeam(team);
		player.setBackNum(backNum);
		if(transferIntention.equalsIgnoreCase("O")) {
			player.setTranferIntention(true);
		} else if (transferIntention.equalsIgnoreCase("X")) {
			player.setTranferIntention(false);
		}
		
		System.out.println( "Player " + (index + 1) + ". " + player  );
		
		
		
	}
	
	public void deletePlayer() throws Exception {
		
		System.out.println("\n============== [4. Delete Player] ===============\n");
		
		List<Player> playerList = service.displayAllPlayers();
		
		System.out.print("Select Index Number >> ");
		
		int index = Integer.parseInt(br.readLine()) - 1 ;
		
		boolean result = service.deletePlayer( index );
		
		if(result) {
			
			System.out.print(playerList.get(index).getName() + " 선수 정보를 삭제 하시겠습니까? (y/n) : ");
			String answer = br.readLine();
			
			if(answer.equalsIgnoreCase("Y")) {
				
				System.out.println(playerList.get(index).getName() + " 선수 정보가 삭제 되었습니다.");
				playerList.remove(index);
				
			} else if (answer.equalsIgnoreCase("N")) {
				System.out.println("선수 정보 삭제를 취소하였습니다.");
			}
			
		} else {
			System.out.println("### 입력한 인덱스에 등록된 선수가 없습니다 ###");
		}
		
	}
	
	public void sortByNationality() {
		
		System.out.println("\n============== [5. Sort By Nationality] ===============\n");
		
		Map<String, List<Player>> sortByNationality = service.sortByNationality();
		
		for(Entry<String, List<Player>> entry : sortByNationality.entrySet()) {
			
			System.out.printf("\n========= [%s] =========\n", entry.getKey());
			
			int index = 1;
			
			for(Player player : entry.getValue()) {
				
				String bool = player.isTranferIntention() ? "O" : "X";
				
				System.out.println(index + ". Name : " + player.getName() + " / Age : " + player.getAge() + " / Team : " + player.getTeam()
									+ " / BackNumber : " + player.getBackNum() + " / TransferIntention : " + bool);
				index++;
				
			}
			
		}
		System.out.println("=============================================================");
	}
	
	
	public void playerWillingToTransfer() throws IOException {
		
		System.out.println("\n============== [6. Player Willing To Transfer] ===============\n");
		
		List<Player> playerList = service.playerWillingToTransfer();
		
		
		int index = 1;
		
		for(Player player : playerList) {
			System.out.println(index + ". Name : " + player.getName() + " / Age : " + player.getAge() + " / Team : " + player.getTeam() );
			index ++;
		}
		
		System.out.println("-------------------------------------------------------------");
		
				
		for(Player player : playerList) {
			System.out.print(player.getName() + "이/가 원하는 팀 : ");
			String team = br.readLine();
			
			System.out.println("==> Name : " + player.getName() + " / Want to transfer to : " + team);
			
			
		}
		
	}
}



















