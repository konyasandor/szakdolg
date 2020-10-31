package hu.sandorkonya.felvasarlasdb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String home(){
		return "index";
	}
	
	@RequestMapping("/termelomerlegjegy")
	public String termelomerlegjegy(){
		return "termelomerlegjegy";
	}

}
