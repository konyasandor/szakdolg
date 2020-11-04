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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hu.sandorkonya.felvasarlasdb.model.Beallitas;
import hu.sandorkonya.felvasarlasdb.model.Keszlet;
import hu.sandorkonya.felvasarlasdb.model.Termelo;
import hu.sandorkonya.felvasarlasdb.service.BeallitasService;
import hu.sandorkonya.felvasarlasdb.service.KeszletService;
import hu.sandorkonya.felvasarlasdb.service.TermeloService;
import javassist.expr.NewArray;

@Controller
public class MainController {
	
	@Autowired
	private TermeloService termeloService;
	
	@Autowired
	private BeallitasService beallitasService;
	
	@Autowired
	private KeszletService keszletService;
	
	
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
	public String termelomerlegjegy(Model model){
		model.addAttribute("keszlet", new Keszlet());
		
		model.addAttribute("beallitas", beallitasService.findAll());
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
		
		return "ugyfelszerkesztesment";
		
	}
	
	@PostMapping("/ugyfelszerkesztesment")
	public String postIndexEdit(@ModelAttribute Termelo termeloModositott) {
		
		termeloService.save(termeloModositott);
		return "redirect:/ugyfelszerkesztes";
	}
	
	
	//**********************   Beállítás ****************************//
	@GetMapping("/beallitas")
	public String beallitas(Model model){
		model.addAttribute("beallitas", new Beallitas() );
		return "beallitas";
	}
	
	@PostMapping("/ujbeallitas")
	public String postIndexBeallitas(@ModelAttribute Beallitas beallitas) {
		
		beallitasService.save(beallitas);
		return "redirect:/beallitas";
	}

}
