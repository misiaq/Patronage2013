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
		
		playersList.set(id, player);
		
		String message = "Player with id:" +id+ " was updated successfully!";
		
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
		return playersList.get(id); 
	}
	

	public List<PlayerModel> playersList(){	
		return playersList; 
	}

	@Override
	public String delete(Integer id){
		
		playersList.remove(id);
		
		String message = "Player with id:" +id+ " was removed successfully!";
		
		return message;		
	}
}
