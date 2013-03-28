package task2.service;

import task2.model.PlayerModel;



public interface PlayerService {
	 String create(PlayerModel player);
	 String update(Integer id, PlayerModel player);
	/* PlayerModel get(Long id);
	 PlayerModel list(PlayerModel player);
	 PlayerModel delete(Long id);
	 */


}
