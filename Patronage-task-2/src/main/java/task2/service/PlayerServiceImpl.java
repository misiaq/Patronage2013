package task2.service;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


import org.springframework.stereotype.Service;

import task2.model.PlayerModel;



@Service("playerService")

public class PlayerServiceImpl implements PlayerService{

	
	private static List<PlayerModel> playersList = new ArrayList<PlayerModel>();
	
	
	@Override
	public String create(PlayerModel player){
		
		Integer thisTimeListSize = playersList.size();
		thisTimeListSize ++;
		
		Integer id = thisTimeListSize-1;
		playersList.add(player);
		
		String message = "New player with id:" +id+ " was created successfully!";
				
		return message;
		
	/*	playersList.setUsername(username)
		PlayerModel newPlayer = new PlayerModel();
		newPlayer.setUsername(playersList.getUsername());
		newPlayer.setEmail(playersList.getEmail());		
		newPlayer.setDate(new Date());
		return newPlayer;
	*/	
	}
	


	@Override
	public String update(Integer id, PlayerModel player){
		String message;
		if (id>=0 & id < playersList.size()){
		
			playersList.set(id, player);
			
			PlayerModel updatingPlayer = playersList.get(id);
			
			updatingPlayer.setUsername(player.getUsername());
			updatingPlayer.setEmail(player.getEmail());			
			
			message = "Player with id:" +id+ " was updated successfully!";
		
		}	
		else{
			message = "ERORR!!! Player with id:" +id+ " does not exist!";			
		}
			

		
		return message;	
	
		
	/*	PlayerModel updatePlayer = new PlayerModel();
		updatePlayer.setUsername(player.getUsername());
		updatePlayer.setEmail(player.getEmail());		
		updatePlayer.setDate(new Date());
		return updatePlayer;
		*/
	}
	
	@Override
	public PlayerModel get(Integer id){	
		String message;
		if (id>=0 & id < playersList.size()){
	
		return playersList.get(id); 
		}	
		else{
			message = "ERORR!!! Player with id:" +id+ " does not exist!";			
			return null;
		}
		
	}
	
	@Override
	public List<PlayerModel> playersList(){	
		String message;
		if (playersList.size()>1){
		return playersList; 
		}
		else{
			message = "ERORR!!! O players exist!";			
			return null;
		}
		
	}

	@Override
	public String delete(Integer id){
		String message;
		if (id>=0 & id < playersList.size()){
			playersList.remove(id);
			message = "Player with id:" +id+ " was removed successfully!";
		}
		else{
			message = "ERORR!!! Player with id:" +id+ " does not exist!";			
		}
		return message;		
	}
}
