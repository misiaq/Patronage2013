package task2.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import task2.model.PlayerModel;



@Service("playerService")

public class PlayerServiceImpl implements PlayerService{

	
	@Override
	public PlayerModel create(PlayerModel player){
		PlayerModel newPlayer = new PlayerModel();
		newPlayer.setUsername(player.getUsername());
		newPlayer.setEmail(player.getEmail());		
		newPlayer.setDate(new Date());
		return newPlayer;
		
	}

	@Override
	public PlayerModel update(PlayerModel player){
		PlayerModel updatePlayer = new PlayerModel();
		updatePlayer.setUsername(player.getUsername());
		updatePlayer.setEmail(player.getEmail());		
		updatePlayer.setDate(new Date());
		return updatePlayer;
	}
	
}
