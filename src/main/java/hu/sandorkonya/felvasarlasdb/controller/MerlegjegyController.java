package hu.sandorkonya.felvasarlasdb.controller;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hu.sandorkonya.felvasarlasdb.model.Keszlet;
import hu.sandorkonya.felvasarlasdb.model.Termelo;
import hu.sandorkonya.felvasarlasdb.service.BeallitasService;
import hu.sandorkonya.felvasarlasdb.service.KeszletService;
import hu.sandorkonya.felvasarlasdb.service.TermeloService;

@Controller
public class MerlegjegyController {
	
	@Autowired
	KeszletService ks;
	@Autowired
	BeallitasService bs;
	@Autowired
	TermeloService ts;
	
	@InitBinder
	public void init(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
	
	@GetMapping("/merleg/merlegjegy")
	public String merlegjegyView(Model model) {
		model.addAttribute("beallitas", bs.findVetel());
		//model.addAttribute("ugyfelek", ts.findAll());
		return "merleg/merlegjegy";
	}
	
	@GetMapping("merleg/vevomerlegjegy")
	public String vevomerlegjegyView(Model model) {
		model.addAttribute("beallitas", bs.findVetel());
		//model.addAttribute("ugyfelek", ts.findAll());
		return "merleg/vevomerlegjegy";
	}
	
	@GetMapping("merleg/merlegjegylista")
	public String merlegjegylistaView(Model model) {
		
		return "merleg/merlegjegylista";
	}
	
	@GetMapping("merleg/ujmerlegjegy")
	@ResponseBody
		
		public Optional<Termelo> update(Long id){
			
			return ts.findById(id);
	}
	
	@PostMapping("merleg/savemerlegjegy")
    public String save(Keszlet keszlet) {
		
		keszlet.setVevo(false);
		keszlet.setFizetve(false);
		
		LocalDate date = LocalDate.now();
		keszlet.setLeadasDatum(date);
        ks.save(keszlet);
        
        return "redirect:/merleg/merlegjegy";
    }
	
	
	
	@PostMapping("merleg/savevevomerlegjegy")
    public String savevevo(Keszlet keszlet) {
		
		keszlet.setVevo(true);
		keszlet.setFizetve(false);
		
		LocalDate date = LocalDate.now();
		keszlet.setLeadasDatum(date);
        ks.save(keszlet);
        
        return "redirect:/merleg/merlegjegy";
    }
	
	

}
