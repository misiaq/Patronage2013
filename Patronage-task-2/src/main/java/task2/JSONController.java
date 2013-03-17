package task2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import task2.HelloSomebody;

@Controller
@RequestMapping("/")
public class JSONController {

	@RequestMapping(value="{hello}", method = RequestMethod.GET)

	public @ResponseBody HelloSomebody getShopInJSON(@RequestParam(value = "param") String name) {

		HelloSomebody somebody = new HelloSomebody();
		somebody.setMessage("Hello, "+name+"!");
		
		return somebody;

	}
	
}