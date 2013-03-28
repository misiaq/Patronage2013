package task2.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import task2.HelloSomebody;
import task2.model.PlayerModel;
import task2.service.PlayerService;


@Controller
@RequestMapping("/")
public class JSONController {

	private PlayerService playerService;

	@RequestMapping(value="/hello/{param}", method = RequestMethod.GET)

	public @ResponseBody HelloSomebody getShopInJSON(@PathVariable String param) {

		HelloSomebody somebody = new HelloSomebody();
		somebody.setMessage("Hello, "+param+"!");
		
		return somebody;

	}
	
	@RequestMapping(
            value = "/players", method = RequestMethod.POST,
            consumes = { MediaType.APPLICATION_JSON_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
	
    public @ResponseBody PlayerModel create(@RequestBody PlayerModel player) {
     
        PlayerModel newPlayer = playerService.create(player);

        // Add some code...

        return newPlayer;
    }
	
    @Autowired
    public void setSimpleService(@Qualifier("playerService") PlayerService playerService) {
        this.playerService = playerService;
    }
	
}