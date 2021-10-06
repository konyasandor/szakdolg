package hu.sandorkonya.felvasarlasdb.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import hu.sandorkonya.felvasarlasdb.model.Termelo;
import hu.sandorkonya.felvasarlasdb.model.TermeloId;
import hu.sandorkonya.felvasarlasdb.service.TermeloService;

@Controller
public class UgyfelSzerkesztesController {
	
	@Autowired
	TermeloService ts;
	
	private static final Logger logger = LoggerFactory.getLogger(UgyfelSzerkesztesController.class);
	
	//If the date of the String type passed by the current page does not match the Date type of the background entity class, you need to add this method.
	@InitBinder
	public void init(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
	
	@GetMapping("/uj/ugyfel")
	public String ugyfelView(Model model) {
		
		
		model.addAttribute("ugyfelek", ts.findAll());
		
		return "uj/ugyfelek";
	}
	
	@GetMapping("/uj/editugyfel")
	@ResponseBody
	public Optional<Termelo> update(Long id){
		
		return ts.findById(id);
	}
	
	@PostMapping("/savetermelo")
    public String save(
    					
    					@RequestParam(required=false) String termeloNev ,
    					@RequestParam(required=false) String termeloLnev,
    					@RequestParam(required=false) String termeloCim,
    					@RequestParam(required=false) String termeloOstermeloiIgazolvanySzam,
    					@RequestParam(required=false) String termeloAdoazonositoJel,
    					@RequestParam(required=false) String termeloAdoSzam,
    					@RequestParam(value="termeloSzuletesiIdo", required=false)
    					@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
    					LocalDate termeloSzuletesiIdo,
    					@RequestParam(required=false) String termeloSzuletesiHely,
    					@RequestParam(required=false) String termeloEdesAnyjaNeve,
    					@RequestParam(required=false) String termeloTajSzam,
    					@RequestParam(required=false) String termeloCsaladiGazdasagSzam,
    					@RequestParam(required=false) String termeloGlobalGapSzam,
    					@RequestParam(required=false) String termeloTelefonSzam,
    					@RequestParam(required=false) String termeloBankszamlaSzam
    				){
		Termelo termelo = new Termelo();
		
		termelo.setTermeloNev(termeloNev);
		termelo.setTermeloLnev(termeloLnev);
		termelo.setTermeloCim(termeloCim);
		termelo.setTermeloOstermeloiIgazolvanySzam(termeloOstermeloiIgazolvanySzam);
		termelo.setTermeloAdoazonositoJel(termeloAdoazonositoJel);
		termelo.setTermeloAdoSzam(termeloAdoSzam);
		termelo.setTermeloSzuletesiIdo(termeloSzuletesiIdo);
		termelo.setTermeloSzuletesiHely(termeloSzuletesiHely);
		termelo.setTermeloEdesAnyjaNeve(termeloEdesAnyjaNeve);
		termelo.setTermeloTajSzam(termeloTajSzam);
		termelo.setTermeloCsaladiGazdasagSzam(termeloCsaladiGazdasagSzam);
		termelo.setTermeloGlobalGapSzam(termeloGlobalGapSzam);
		termelo.setTermeloTelefonSzam(termeloTelefonSzam);
		termelo.setTermeloBankszamlaSzam(termeloBankszamlaSzam);
        ts.save(termelo);
        
        return "redirect:uj/ugyfel";
    }
	
	@PostMapping("/edittermelo")
    public String edit(
    					@RequestParam(required=false) Long id,
    					@RequestParam(required=false) String termeloNev ,
    					@RequestParam(required=false) String termeloLnev,
    					@RequestParam(required=false) String termeloCim,
    					@RequestParam(required=false) String termeloOstermeloiIgazolvanySzam,
    					@RequestParam(required=false) String termeloAdoazonositoJel,
    					@RequestParam(required=false) String termeloAdoSzam,
    					@RequestParam("termeloSzuletesiIdo")
    					@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
    					LocalDate termeloSzuletesiIdo,
    					@RequestParam(required=false) String termeloSzuletesiHely,
    					@RequestParam(required=false) String termeloEdesAnyjaNeve,
    					@RequestParam(required=false) String termeloTajSzam,
    					@RequestParam(required=false) String termeloCsaladiGazdasagSzam,
    					@RequestParam(required=false) String termeloGlobalGapSzam,
    					@RequestParam(required=false) String termeloTelefonSzam,
    					@RequestParam(required=false) String termeloBankszamlaSzam
    				){
		Termelo termelo = new Termelo();
		termelo.setId(id);
		termelo.setTermeloNev(termeloNev);
		termelo.setTermeloLnev(termeloLnev);
		termelo.setTermeloCim(termeloCim);
		termelo.setTermeloOstermeloiIgazolvanySzam(termeloOstermeloiIgazolvanySzam);
		termelo.setTermeloAdoazonositoJel(termeloAdoazonositoJel);
		termelo.setTermeloAdoSzam(termeloAdoSzam);
		termelo.setTermeloSzuletesiIdo(termeloSzuletesiIdo);
		termelo.setTermeloSzuletesiHely(termeloSzuletesiHely);
		termelo.setTermeloEdesAnyjaNeve(termeloEdesAnyjaNeve);
		termelo.setTermeloTajSzam(termeloTajSzam);
		termelo.setTermeloCsaladiGazdasagSzam(termeloCsaladiGazdasagSzam);
		termelo.setTermeloGlobalGapSzam(termeloGlobalGapSzam);
		termelo.setTermeloTelefonSzam(termeloTelefonSzam);
		termelo.setTermeloBankszamlaSzam(termeloBankszamlaSzam);
        ts.save(termelo);
        
        return "redirect:uj/ugyfel";
    }
	
	@RestController
	@RequestMapping("/uj/deletetermelo")
	public class DeleteUserController {  

	    @RequestMapping(method = RequestMethod.DELETE)
	    public String deleteSport(@RequestParam("id") Long id) {
	    	
	    	ts.delete(id);
	        return "uj/ugyfel";
	    }
	}
	
	/*
	@GetMapping("/uj/selectlist")
	@ResponseBody
	public List<TermeloId> selectView(){
		
		
		return ts.findNevId();
	}
	*/
}
