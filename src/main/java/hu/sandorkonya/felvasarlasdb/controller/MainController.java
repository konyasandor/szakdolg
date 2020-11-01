package hu.sandorkonya.felvasarlasdb.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hu.sandorkonya.felvasarlasdb.model.Termelo;
import hu.sandorkonya.felvasarlasdb.service.TermeloService;

@Controller
public class MainController {
	
	@Autowired
	private TermeloService termeloService;
	
	
	
	
	@GetMapping("/")
	public String home(){
		return "index";
	}
	
	@GetMapping("/termelomerlegjegy")
	public String termelomerlegjegy(){
		return "termelomerlegjegy";
	}
	
	@GetMapping("/felvasarlasijegy")
	public String felvasarlasijegy(){
		return "felvasarlasijegy";
	}
	
	@GetMapping("/szamla")
	public String szamla(){
		return "szamla";
	}
	
	@GetMapping("/ugyfelszerkesztes")
	public String ugyfelszerkesztes(Model model){
		
		model.addAttribute("termelo", new Termelo());
		return "ugyfelszerkesztes";
	}
	
	@PostMapping("/ujtermelo")
	public String postIndex(@ModelAttribute Termelo termelo) {
			
		termeloService.save(termelo);
		return "redirect:/ugyfelszerkesztes";
	}
	
	
	@GetMapping("/beallitas")
	public String beallitas(){
		return "beallitas";
	}

}
