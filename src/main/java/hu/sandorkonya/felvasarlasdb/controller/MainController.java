package hu.sandorkonya.felvasarlasdb.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import hu.sandorkonya.felvasarlasdb.model.Termelo;
import hu.sandorkonya.felvasarlasdb.service.TermeloService;

@Controller
public class MainController {
	
	@Autowired
	private TermeloService termeloService;
	
	
	//If the date of the String type passed by the current page does not match the Date type of the background entity class, you need to add this method.
	@InitBinder
	public void init(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
	
	//**********************   Főoldal ******************************//
	@GetMapping("/")
	public String home(){
		return "index";
	}
	
	//**********************   Mérlegjegy ***************************//
	@GetMapping("/termelomerlegjegy")
	public String termelomerlegjegy(){
		return "termelomerlegjegy";
	}
	
	//**********************   Felvasarlasi jegy ********************//
	@GetMapping("/felvasarlasijegy")
	public String felvasarlasijegy(){
		return "felvasarlasijegy";
	}
	
	//**********************   Számla *******************************//
	@GetMapping("/szamla")
	public String szamla(){
		return "szamla";
	}
	
	//**********************   Ügyfél szerkesztés/mentés ************//
	@GetMapping("/ugyfelszerkesztes")
	public String ugyfelszerkesztes() {
		return "ugyfelszerkesztes";
	}
	
	@GetMapping("/ugyfelmentes")
	public String ugyfelmentes(Model model){
		
		model.addAttribute("termelo", new Termelo());
		return "ugyfelmentes";
	}
	
	@PostMapping("/ujtermelo")
	public String postIndex(@ModelAttribute Termelo termelo) {
		
		termeloService.save(termelo);
		return "redirect:/ugyfelszerkesztes";
	}
	
	@GetMapping("/termelokeres")
	public String Search(@RequestParam String termeloNevKeres, Model model) {
		
		model.addAttribute("termelok", termeloService.search(termeloNevKeres));
		
		return "ugyfelszerkesztes";
		
	}
	
	@GetMapping("/edittermelo")
	public String Edit(@RequestParam Long termelo, Model model) {
		
		model.addAttribute("termelo", termeloService.edit(termelo));
		
		return "ugyfelszerkesztes";
		
	}
	
	
	//**********************   Beállítás ****************************//
	@GetMapping("/beallitas")
	public String beallitas(){
		return "beallitas";
	}

}
