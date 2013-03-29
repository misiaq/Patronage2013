package task2.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import task2.model.PlayerModel;
import task2.model.Message;
import task2.service.PlayerService;


@Controller
@RequestMapping("/")
public class JSONController {

	private PlayerService playerService;

	@RequestMapping(value="/hello/{param}", method = RequestMethod.GET)

	public @ResponseBody Message getShopInJSON(@PathVariable String param) {

		Message somebody = new Message();
		somebody.setMessage("Hello, "+param+"!");
		
		return somebody;

	}
	
	@RequestMapping(
            value = "/players", method = RequestMethod.POST,
            consumes = { MediaType.APPLICATION_JSON_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
	
    public @ResponseBody String create(@RequestBody PlayerModel player) {
		return playerService.create(player);
    }
	
    @RequestMapping(value = "/players/{playerId}", method = RequestMethod.PUT,
    		consumes = { MediaType.APPLICATION_JSON_VALUE },
    		produces = { MediaType.APPLICATION_JSON_VALUE })
    
    public @ResponseBody String update(@PathVariable String playerId, @RequestBody PlayerModel player) {
    	
    	return playerService.update(Integer.parseInt(playerId), player);
    }

    @RequestMapping(value = "/players/{playerId}", method = RequestMethod.GET,
    		consumes = { MediaType.APPLICATION_JSON_VALUE },
    		produces = { MediaType.APPLICATION_JSON_VALUE })
    
    public @ResponseBody PlayerModel get(@PathVariable String playerId) {
    	
    	return playerService.get(Integer.parseInt(playerId));
    }	

    @RequestMapping(value = "/players", method = RequestMethod.GET,
    		consumes = { MediaType.APPLICATION_JSON_VALUE },
    		produces = { MediaType.APPLICATION_JSON_VALUE })
    
    public @ResponseBody List<PlayerModel> playerList() {
    	
    	return playerService.playersList();
    }	
    
    @RequestMapping(value = "/players/{playerId}", method = RequestMethod.DELETE,
    		consumes = { MediaType.APPLICATION_JSON_VALUE },
    		produces = { MediaType.APPLICATION_JSON_VALUE })
    
    public @ResponseBody String delete(@PathVariable String playerId) {
    	
    	return playerService.delete(Integer.parseInt(playerId));
    }	
    
    
    
    @Autowired
    public void setSimpleService(@Qualifier("playerService") PlayerService playerService) {
        this.playerService = playerService;
    }
	
}