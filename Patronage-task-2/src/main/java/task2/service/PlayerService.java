package task2.service;

import java.util.List;

import task2.model.PlayerModel;



public interface PlayerService {
	 String create(PlayerModel player);
	 String update(Integer id, PlayerModel player);
	 PlayerModel get(Integer id);
	 List<PlayerModel> playersList();
	 String delete(Integer id);
	 


}
