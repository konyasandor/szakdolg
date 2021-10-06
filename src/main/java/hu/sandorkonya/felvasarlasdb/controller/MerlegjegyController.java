package hu.sandorkonya.felvasarlasdb.controller;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
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
	
	@GetMapping("merleg/vevomerlegjegylista")
	public String vevomerlegjegylistaView(Model model) {
		
		return "merleg/vevomerlegjegylista";
	}
	
	@GetMapping("/merlegjegytablelista")
	@ResponseBody
	public List<Keszlet> dataListTableFill(){
		
		return ks.findAll();
	}
	
	@GetMapping("merleg/ujmerlegjegy")
	@ResponseBody
		
		public Optional<Termelo> update(Long id){
			
			return ts.findById(id);
	}
	
	@PostMapping("merleg/savemerlegjegy")
    public String save(
    					@RequestParam String elsoOsztEgysegAr,
    					@RequestParam String masodOsztEgysegAr,
    					@RequestParam String harmadOsztEgysegAr,
    					@RequestParam String negyedOsztEgysegAr,
    					@RequestParam String vastagEgysegAr,
    					@RequestParam String vekonyEgysegAr,
    					@RequestParam String elsoOsztLevonas,
    					@RequestParam String masodOsztLevonas,
    					@RequestParam String harmadOsztLevonas,
    					@RequestParam String negyedOsztLevonas,
    					@RequestParam String vastagLevonas,
    					@RequestParam String vekonyLevonas,
    					@RequestParam String elsoOsztalySuly,
    					@RequestParam String masodOsztalySuly,
    					@RequestParam String harmadOsztalySuly,
    					@RequestParam String negyedOsztalySuly,
    					@RequestParam String vastagGyokerSuly,
    					@RequestParam String vekonyGyokerSuly,
						@RequestParam String elsoOsztalyErteke,
						@RequestParam String masodOsztalyErteke,
						@RequestParam String harmadOsztalyErteke,
						@RequestParam String negyedOsztalyErteke,
						@RequestParam String vastagErteke,
						@RequestParam String vekonyErteke,
						@RequestParam String osszAr,
						@RequestParam String eloleg,
						@RequestParam String kifizetendo,
						@RequestParam Long tId,
						@RequestParam String tNev,
						@RequestParam("leadasDatum")
    					@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
    					LocalDate leadasDatum) {
		
		Keszlet keszlet = new Keszlet();
		keszlet.setVevo(false);
		keszlet.setFizetve(false);
		
		
		keszlet.setLeadasDatum(leadasDatum);
		
		
		String elsoOsztEgysegArReplace = elsoOsztEgysegAr.replaceAll(" ","").trim();
		Double elsoOsztEgysegArD = Double.parseDouble(elsoOsztEgysegArReplace);
		keszlet.setElsoOsztEgysegAr(elsoOsztEgysegArD); 
		
		String masodOsztEgysegArReplace = masodOsztEgysegAr.replaceAll(" ","").trim();
		Double masodOsztEgysegArD = Double.parseDouble(masodOsztEgysegArReplace);
		keszlet.setMasodOsztEgysegAr(masodOsztEgysegArD); 
		
		String harmadOsztEgysegArReplace = harmadOsztEgysegAr.replaceAll(" ","").trim();
		Double harmadOsztEgysegArD = Double.parseDouble(harmadOsztEgysegArReplace);
		keszlet.setHarmadOsztEgysegAr(harmadOsztEgysegArD); 
		
		String negyedOsztEgysegArReplace = negyedOsztEgysegAr.replaceAll(" ","").trim();
		Double negyedOsztEgysegArD = Double.parseDouble(negyedOsztEgysegArReplace);
		keszlet.setNegyedOsztEgysegAr(negyedOsztEgysegArD);
		
		String vastagEgysegArReplace = vastagEgysegAr.replaceAll(" ","").trim();
		Double vastagEgysegArD = Double.parseDouble(vastagEgysegArReplace);
		keszlet.setVastagEgysegAr(vastagEgysegArD);
		
		String vekonyEgysegArReplace = vekonyEgysegAr.replaceAll(" ","").trim();
		Double vekonyEgysegArD = Double.parseDouble(vekonyEgysegArReplace);
		keszlet.setVekonyEgysegAr(vekonyEgysegArD);
		
		String elsoOsztLevonasReplace = elsoOsztLevonas.replaceAll(" ","").trim();
		Double elsoOsztLevonasD = Double.parseDouble(elsoOsztLevonasReplace);
		keszlet.setElsoOsztLevonas(elsoOsztLevonasD); 
		
		String masodOsztLevonasReplace = masodOsztLevonas.replaceAll(" ","").trim();
		Double masodOsztLevonasD = Double.parseDouble(masodOsztLevonasReplace);
		keszlet.setMasodOsztLevonas(masodOsztLevonasD); 
		
		String harmadOsztLevonasReplace = harmadOsztLevonas.replaceAll(" ","").trim();
		Double harmadOsztLevonasD = Double.parseDouble(harmadOsztLevonasReplace);
		keszlet.setHarmadOsztLevonas(harmadOsztLevonasD); 
		
		String negyedOsztLevonasReplace = negyedOsztLevonas.replaceAll(" ","").trim();
		Double negyedOsztLevonasD = Double.parseDouble(negyedOsztLevonasReplace);
		keszlet.setNegyedOsztLevonas(negyedOsztLevonasD);
		
		String vastagLevonasReplace = vastagLevonas.replaceAll(" ","").trim();
		Double vastagLevonasD = Double.parseDouble(vastagLevonasReplace);
		keszlet.setVastagLevonas(vastagLevonasD);
		
		String vekonyLevonasReplace = vekonyLevonas.replaceAll(" ","").trim();
		Double vekonyLevonasD = Double.parseDouble(vekonyLevonasReplace);
		keszlet.setVekonyLevonas(vekonyLevonasD);
		
		String elsoOsztalySulyReplace = elsoOsztalySuly.replaceAll(" ","").trim();
		Double elsoOsztalySulyD = Double.parseDouble(elsoOsztalySulyReplace);
		keszlet.setElsoOsztalySuly(elsoOsztalySulyD); 
		
		String masodOsztalySulyReplace = masodOsztalySuly.replaceAll(" ","").trim();
		Double masodOsztalySulyD = Double.parseDouble(masodOsztalySulyReplace);
		keszlet.setMasodOsztalySuly(masodOsztalySulyD); 
		
		String harmadOsztalySulyReplace = harmadOsztalySuly.replaceAll(" ","").trim();
		Double harmadOsztalySulyD = Double.parseDouble(harmadOsztalySulyReplace);
		keszlet.setHarmadOsztalySuly(harmadOsztalySulyD); 
		
		String negyedOsztalySulyReplace = negyedOsztalySuly.replaceAll(" ","").trim();
		Double negyedOsztalySulyD = Double.parseDouble(negyedOsztalySulyReplace);
		keszlet.setNegyedOsztalySuly(negyedOsztalySulyD);
		
		String vastagGyokerSulyReplace = vastagGyokerSuly.replaceAll(" ","").trim();
		Double vastagGyokerSulyD = Double.parseDouble(vastagGyokerSulyReplace);
		keszlet.setVastagGyokerSuly(vastagGyokerSulyD);
		
		String vekonyGyokerSulyReplace = vekonyGyokerSuly.replaceAll(" ","").trim();
		Double vekonyGyokerSulyD = Double.parseDouble(vekonyGyokerSulyReplace);
		keszlet.setVekonyGyokerSuly(vekonyGyokerSulyD);
		
		
		String elsoOsztalyErtekeReplace = elsoOsztalyErteke.replaceAll(" ","").trim();
		Double elsoOsztalyErtekeD = Double.parseDouble(elsoOsztalyErtekeReplace);
		keszlet.setElsoOsztalyErteke(elsoOsztalyErtekeD); 
		
		String masodOsztalyErtekeReplace = masodOsztalyErteke.replaceAll(" ","").trim();
		Double masodOsztalyErtekeD = Double.parseDouble(masodOsztalyErtekeReplace);
		keszlet.setMasodOsztalyErteke(masodOsztalyErtekeD); 
		
		String harmadOsztalyErtekeReplace = harmadOsztalyErteke.replaceAll(" ","").trim();
		Double harmadOsztalyErtekeD = Double.parseDouble(harmadOsztalyErtekeReplace);
		keszlet.setHarmadOsztalyErteke(harmadOsztalyErtekeD); 
		
		String negyedOsztalyErtekeReplace = negyedOsztalyErteke.replaceAll(" ","").trim();
		Double negyedOsztalyErtekeD = Double.parseDouble(negyedOsztalyErtekeReplace);
		keszlet.setNegyedOsztalyErteke(negyedOsztalyErtekeD);
		
		String vastagErtekeReplace = vastagErteke.replaceAll(" ","").trim();
		Double vastagErtekeD = Double.parseDouble(vastagErtekeReplace);
		keszlet.setVastagErteke(vastagErtekeD);
		
		String vekonyErtekeReplace = vekonyErteke.replaceAll(" ","").trim();
		Double vekonyErtekeD = Double.parseDouble(vekonyErtekeReplace);
		keszlet.setVekonyErteke(vekonyErtekeD);
		
		String osszArReplace = osszAr.replaceAll(" ","").trim();
		Double osszArD = Double.parseDouble(osszArReplace);
		keszlet.setOsszAr(osszArD); 
		
		String elolegReplace = eloleg.replaceAll(" ","").trim();
		Double elolegD = Double.parseDouble(elolegReplace);
		keszlet.setEloleg(elolegD); 
		
		String kifizetendoReplace = kifizetendo.replaceAll(" ","").trim();
		Double kifizetendoD = Double.parseDouble(kifizetendoReplace);
		keszlet.setKifizetendo(kifizetendoD); 
		
		keszlet.settId(tId);
		keszlet.settNev(tNev);
		keszlet.setPenznem("HUF");
		keszlet.setSzamlaSorszam("0");
		
        ks.save(keszlet);
        
        return "redirect:/merleg/merlegjegy";
    }
	
	@PostMapping("merleg/editmerlegjegy")
    public String edit(
    					@RequestParam String elsoOsztEgysegAr,
    					@RequestParam String masodOsztEgysegAr,
    					@RequestParam String harmadOsztEgysegAr,
    					@RequestParam String negyedOsztEgysegAr,
    					@RequestParam String vastagEgysegAr,
    					@RequestParam String vekonyEgysegAr,
    					@RequestParam String elsoOsztLevonas,
    					@RequestParam String masodOsztLevonas,
    					@RequestParam String harmadOsztLevonas,
    					@RequestParam String negyedOsztLevonas,
    					@RequestParam String vastagLevonas,
    					@RequestParam String vekonyLevonas,
    					@RequestParam String elsoOsztalySuly,
    					@RequestParam String masodOsztalySuly,
    					@RequestParam String harmadOsztalySuly,
    					@RequestParam String negyedOsztalySuly,
    					@RequestParam String vastagGyokerSuly,
    					@RequestParam String vekonyGyokerSuly,
						@RequestParam String elsoOsztalyErteke,
						@RequestParam String masodOsztalyErteke,
						@RequestParam String harmadOsztalyErteke,
						@RequestParam String negyedOsztalyErteke,
						@RequestParam String vastagErteke,
						@RequestParam String vekonyErteke,
						@RequestParam String osszAr,
						@RequestParam String eloleg,
						@RequestParam String kifizetendo,
						@RequestParam Long tId,
						@RequestParam String tNev,
						@RequestParam("leadasDatum")
    					@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
    					LocalDate leadasDatum,
						@RequestParam Long id) {
		
		Keszlet keszlet = new Keszlet();
		keszlet.setVevo(false);
		keszlet.setFizetve(false);
		
		
		keszlet.setLeadasDatum(leadasDatum);
		
		
		String elsoOsztEgysegArReplace = elsoOsztEgysegAr.replaceAll(" ","").trim();
		Double elsoOsztEgysegArD = Double.parseDouble(elsoOsztEgysegArReplace);
		keszlet.setElsoOsztEgysegAr(elsoOsztEgysegArD); 
		
		String masodOsztEgysegArReplace = masodOsztEgysegAr.replaceAll(" ","").trim();
		Double masodOsztEgysegArD = Double.parseDouble(masodOsztEgysegArReplace);
		keszlet.setMasodOsztEgysegAr(masodOsztEgysegArD); 
		
		String harmadOsztEgysegArReplace = harmadOsztEgysegAr.replaceAll(" ","").trim();
		Double harmadOsztEgysegArD = Double.parseDouble(harmadOsztEgysegArReplace);
		keszlet.setHarmadOsztEgysegAr(harmadOsztEgysegArD); 
		
		String negyedOsztEgysegArReplace = negyedOsztEgysegAr.replaceAll(" ","").trim();
		Double negyedOsztEgysegArD = Double.parseDouble(negyedOsztEgysegArReplace);
		keszlet.setNegyedOsztEgysegAr(negyedOsztEgysegArD);
		
		String vastagEgysegArReplace = vastagEgysegAr.replaceAll(" ","").trim();
		Double vastagEgysegArD = Double.parseDouble(vastagEgysegArReplace);
		keszlet.setVastagEgysegAr(vastagEgysegArD);
		
		String vekonyEgysegArReplace = vekonyEgysegAr.replaceAll(" ","").trim();
		Double vekonyEgysegArD = Double.parseDouble(vekonyEgysegArReplace);
		keszlet.setVekonyEgysegAr(vekonyEgysegArD);
		
		String elsoOsztLevonasReplace = elsoOsztLevonas.replaceAll(" ","").trim();
		Double elsoOsztLevonasD = Double.parseDouble(elsoOsztLevonasReplace);
		keszlet.setElsoOsztLevonas(elsoOsztLevonasD); 
		
		String masodOsztLevonasReplace = masodOsztLevonas.replaceAll(" ","").trim();
		Double masodOsztLevonasD = Double.parseDouble(masodOsztLevonasReplace);
		keszlet.setMasodOsztLevonas(masodOsztLevonasD); 
		
		String harmadOsztLevonasReplace = harmadOsztLevonas.replaceAll(" ","").trim();
		Double harmadOsztLevonasD = Double.parseDouble(harmadOsztLevonasReplace);
		keszlet.setHarmadOsztLevonas(harmadOsztLevonasD); 
		
		String negyedOsztLevonasReplace = negyedOsztLevonas.replaceAll(" ","").trim();
		Double negyedOsztLevonasD = Double.parseDouble(negyedOsztLevonasReplace);
		keszlet.setNegyedOsztLevonas(negyedOsztLevonasD);
		
		String vastagLevonasReplace = vastagLevonas.replaceAll(" ","").trim();
		Double vastagLevonasD = Double.parseDouble(vastagLevonasReplace);
		keszlet.setVastagLevonas(vastagLevonasD);
		
		String vekonyLevonasReplace = vekonyLevonas.replaceAll(" ","").trim();
		Double vekonyLevonasD = Double.parseDouble(vekonyLevonasReplace);
		keszlet.setVekonyLevonas(vekonyLevonasD);
		
		String elsoOsztalySulyReplace = elsoOsztalySuly.replaceAll(" ","").trim();
		Double elsoOsztalySulyD = Double.parseDouble(elsoOsztalySulyReplace);
		keszlet.setElsoOsztalySuly(elsoOsztalySulyD); 
		
		String masodOsztalySulyReplace = masodOsztalySuly.replaceAll(" ","").trim();
		Double masodOsztalySulyD = Double.parseDouble(masodOsztalySulyReplace);
		keszlet.setMasodOsztalySuly(masodOsztalySulyD); 
		
		String harmadOsztalySulyReplace = harmadOsztalySuly.replaceAll(" ","").trim();
		Double harmadOsztalySulyD = Double.parseDouble(harmadOsztalySulyReplace);
		keszlet.setHarmadOsztalySuly(harmadOsztalySulyD); 
		
		String negyedOsztalySulyReplace = negyedOsztalySuly.replaceAll(" ","").trim();
		Double negyedOsztalySulyD = Double.parseDouble(negyedOsztalySulyReplace);
		keszlet.setNegyedOsztalySuly(negyedOsztalySulyD);
		
		String vastagGyokerSulyReplace = vastagGyokerSuly.replaceAll(" ","").trim();
		Double vastagGyokerSulyD = Double.parseDouble(vastagGyokerSulyReplace);
		keszlet.setVastagGyokerSuly(vastagGyokerSulyD);
		
		String vekonyGyokerSulyReplace = vekonyGyokerSuly.replaceAll(" ","").trim();
		Double vekonyGyokerSulyD = Double.parseDouble(vekonyGyokerSulyReplace);
		keszlet.setVekonyGyokerSuly(vekonyGyokerSulyD);
		
		
		String elsoOsztalyErtekeReplace = elsoOsztalyErteke.replaceAll(" ","").trim();
		Double elsoOsztalyErtekeD = Double.parseDouble(elsoOsztalyErtekeReplace);
		keszlet.setElsoOsztalyErteke(elsoOsztalyErtekeD); 
		
		String masodOsztalyErtekeReplace = masodOsztalyErteke.replaceAll(" ","").trim();
		Double masodOsztalyErtekeD = Double.parseDouble(masodOsztalyErtekeReplace);
		keszlet.setMasodOsztalyErteke(masodOsztalyErtekeD); 
		
		String harmadOsztalyErtekeReplace = harmadOsztalyErteke.replaceAll(" ","").trim();
		Double harmadOsztalyErtekeD = Double.parseDouble(harmadOsztalyErtekeReplace);
		keszlet.setHarmadOsztalyErteke(harmadOsztalyErtekeD); 
		
		String negyedOsztalyErtekeReplace = negyedOsztalyErteke.replaceAll(" ","").trim();
		Double negyedOsztalyErtekeD = Double.parseDouble(negyedOsztalyErtekeReplace);
		keszlet.setNegyedOsztalyErteke(negyedOsztalyErtekeD);
		
		String vastagErtekeReplace = vastagErteke.replaceAll(" ","").trim();
		Double vastagErtekeD = Double.parseDouble(vastagErtekeReplace);
		keszlet.setVastagErteke(vastagErtekeD);
		
		String vekonyErtekeReplace = vekonyErteke.replaceAll(" ","").trim();
		Double vekonyErtekeD = Double.parseDouble(vekonyErtekeReplace);
		keszlet.setVekonyErteke(vekonyErtekeD);
		
		String osszArReplace = osszAr.replaceAll(" ","").trim();
		Double osszArD = Double.parseDouble(osszArReplace);
		keszlet.setOsszAr(osszArD); 
		
		String elolegReplace = eloleg.replaceAll(" ","").trim();
		Double elolegD = Double.parseDouble(elolegReplace);
		keszlet.setEloleg(elolegD); 
		
		String kifizetendoReplace = kifizetendo.replaceAll(" ","").trim();
		Double kifizetendoD = Double.parseDouble(kifizetendoReplace);
		keszlet.setKifizetendo(kifizetendoD); 
		
		keszlet.settId(tId);
		keszlet.settNev(tNev);
		keszlet.setPenznem("HUF");
		keszlet.setSzamlaSorszam("0");
		keszlet.setId(id);
        ks.save(keszlet);
        
        return "redirect:/merleg/merlegjegylista";
    }
	
	@PostMapping("merleg/savevevomerlegjegy")
    public String savevevo(@RequestParam String osszAr,
				    		@RequestParam String elsoOsztalySuly,
							@RequestParam String masodOsztalySuly,
							@RequestParam String harmadOsztalySuly,
							@RequestParam String negyedOsztalySuly,
							@RequestParam String vastagGyokerSuly,
							@RequestParam String vekonyGyokerSuly,
							@RequestParam String penznem,
							@RequestParam Long tId,
							@RequestParam String tNev,
							@RequestParam String eloleg,
							@RequestParam String kifizetendo,
							@RequestParam String szamlaSorszam,
							@RequestParam("leadasDatum")
	    					@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	    					LocalDate leadasDatum,
	    					@RequestParam("fizetesiHatarido")
							@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
							LocalDate fizetesiHatarido,
							@RequestParam(value="kifizetesDatum", required=false)
							@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
							LocalDate kifizetesDatum
							) {
						
		Keszlet keszlet = new Keszlet();
		
		String elsoOsztalySulyReplace = elsoOsztalySuly.replaceAll(" ","").trim();
		Double elsoOsztalySulyD = Double.parseDouble(elsoOsztalySulyReplace);
		keszlet.setElsoOsztalySuly(elsoOsztalySulyD); 
		
		String masodOsztalySulyReplace = masodOsztalySuly.replaceAll(" ","").trim();
		Double masodOsztalySulyD = Double.parseDouble(masodOsztalySulyReplace);
		keszlet.setMasodOsztalySuly(masodOsztalySulyD); 
		
		String harmadOsztalySulyReplace = harmadOsztalySuly.replaceAll(" ","").trim();
		Double harmadOsztalySulyD = Double.parseDouble(harmadOsztalySulyReplace);
		keszlet.setHarmadOsztalySuly(harmadOsztalySulyD); 
		
		String negyedOsztalySulyReplace = negyedOsztalySuly.replaceAll(" ","").trim();
		Double negyedOsztalySulyD = Double.parseDouble(negyedOsztalySulyReplace);
		keszlet.setNegyedOsztalySuly(negyedOsztalySulyD);
		
		String vastagGyokerSulyReplace = vastagGyokerSuly.replaceAll(" ","").trim();
		Double vastagGyokerSulyD = Double.parseDouble(vastagGyokerSulyReplace);
		keszlet.setVastagGyokerSuly(vastagGyokerSulyD);
		
		String vekonyGyokerSulyReplace = vekonyGyokerSuly.replaceAll(" ","").trim();
		Double vekonyGyokerSulyD = Double.parseDouble(vekonyGyokerSulyReplace);
		keszlet.setVekonyGyokerSuly(vekonyGyokerSulyD);
		
		String osszArReplace = osszAr.replaceAll(" ","").trim();
		Double osszArD = Double.parseDouble(osszArReplace);
		keszlet.setOsszAr(osszArD);
		
		String elolegReplace = eloleg.replaceAll(" ","").trim();
		Double elolegD = Double.parseDouble(elolegReplace);
		keszlet.setEloleg(elolegD); 
		
		String kifizetendoReplace = kifizetendo.replaceAll(" ","").trim();
		Double kifizetendoD = Double.parseDouble(kifizetendoReplace);
		keszlet.setKifizetendo(kifizetendoD); 
		
		keszlet.settId(tId);
		keszlet.settNev(tNev);
		keszlet.setSzamlaSorszam(szamlaSorszam);
		keszlet.setPenznem(penznem);
		keszlet.setVevo(true);
		
		keszlet.setFizetesiHatarido(fizetesiHatarido);
		
		keszlet.setLeadasDatum(leadasDatum);
		if(kifizetesDatum!=null) {
			keszlet.setKifizetesDatum(kifizetesDatum);
			keszlet.setFizetve(true);
		}else {
			keszlet.setFizetve(false);
		}
        ks.save(keszlet);
        
        return "redirect:/merleg/vevomerlegjegy";
    }
	
	@PostMapping("merleg/editvevomerlegjegy")
    public String editvevo(@RequestParam String osszAr,
				    		@RequestParam String elsoOsztalySuly,
							@RequestParam String masodOsztalySuly,
							@RequestParam String harmadOsztalySuly,
							@RequestParam String negyedOsztalySuly,
							@RequestParam String vastagGyokerSuly,
							@RequestParam String vekonyGyokerSuly,
							@RequestParam String penznem,
							@RequestParam Long tId,
							@RequestParam String tNev,
							@RequestParam String eloleg,
							@RequestParam String kifizetendo,
							@RequestParam String szamlaSorszam,
							@RequestParam(value="leadasDatum", required=false)
							@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	    					LocalDate leadasDatum,
	    					@RequestParam(value="fizetesiHatarido", required=false)
							@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
							LocalDate fizetesiHatarido,
							@RequestParam(value="kifizetesDatum", required=false)
							@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
							LocalDate kifizetesDatum,
							@RequestParam Long id
							
							) {
						
		Keszlet keszlet = new Keszlet();
		
		String elsoOsztalySulyReplace = elsoOsztalySuly.replaceAll(" ","").trim();
		Double elsoOsztalySulyD = Double.parseDouble(elsoOsztalySulyReplace);
		keszlet.setElsoOsztalySuly(elsoOsztalySulyD); 
		
		String masodOsztalySulyReplace = masodOsztalySuly.replaceAll(" ","").trim();
		Double masodOsztalySulyD = Double.parseDouble(masodOsztalySulyReplace);
		keszlet.setMasodOsztalySuly(masodOsztalySulyD); 
		
		String harmadOsztalySulyReplace = harmadOsztalySuly.replaceAll(" ","").trim();
		Double harmadOsztalySulyD = Double.parseDouble(harmadOsztalySulyReplace);
		keszlet.setHarmadOsztalySuly(harmadOsztalySulyD); 
		
		String negyedOsztalySulyReplace = negyedOsztalySuly.replaceAll(" ","").trim();
		Double negyedOsztalySulyD = Double.parseDouble(negyedOsztalySulyReplace);
		keszlet.setNegyedOsztalySuly(negyedOsztalySulyD);
		
		String vastagGyokerSulyReplace = vastagGyokerSuly.replaceAll(" ","").trim();
		Double vastagGyokerSulyD = Double.parseDouble(vastagGyokerSulyReplace);
		keszlet.setVastagGyokerSuly(vastagGyokerSulyD);
		
		String vekonyGyokerSulyReplace = vekonyGyokerSuly.replaceAll(" ","").trim();
		Double vekonyGyokerSulyD = Double.parseDouble(vekonyGyokerSulyReplace);
		keszlet.setVekonyGyokerSuly(vekonyGyokerSulyD);
		
		String osszArReplace = osszAr.replaceAll(" ","").trim();
		Double osszArD = Double.parseDouble(osszArReplace);
		keszlet.setOsszAr(osszArD);
		
		String elolegReplace = eloleg.replaceAll(" ","").trim();
		Double elolegD = Double.parseDouble(elolegReplace);
		keszlet.setEloleg(elolegD); 
		
		String kifizetendoReplace = kifizetendo.replaceAll(" ","").trim();
		Double kifizetendoD = Double.parseDouble(kifizetendoReplace);
		keszlet.setKifizetendo(kifizetendoD); 
		
		keszlet.settId(tId);
		keszlet.settNev(tNev);
		keszlet.setSzamlaSorszam(szamlaSorszam);
		keszlet.setPenznem(penznem);
		keszlet.setVevo(true);
		keszlet.setFizetve(false);
		keszlet.setFizetesiHatarido(fizetesiHatarido);
		keszlet.setKifizetesDatum(kifizetesDatum);
		keszlet.setLeadasDatum(leadasDatum);
		keszlet.setId(id);
        ks.save(keszlet);
        
        return "redirect:/merleg/merlegjegylista";
    }
	
	@PostMapping("merleg/ackvevomerlegjegy")
    public String ackvevo(
							
							@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
							LocalDate kifizetesDatum,
							@RequestParam Long id
							
							) {
						
        ks.updateVevo(id, kifizetesDatum);
        
        return "redirect:/merleg/vevomerlegjegylista";
	}
	
	@GetMapping("/felvasarlas/getmerlegjegy")
	@ResponseBody
	public Optional<Keszlet> getJegy(Long id){
		
		return ks.findById(id);
	}
	
	@GetMapping("/merleg/getmerlegjegy")
	@ResponseBody
	public Optional<Keszlet> getJegyMerlegTable(Long id){
		
		return ks.findById(id);
	}
	
	@GetMapping("/merleg/editugyfel")
	@ResponseBody
	public Optional<Termelo> getJegyMerlegTableUser(Long id){
		
		return ts.findById(id);
	}
	
	@RestController
	@RequestMapping("/merleg/deletemerlegjegy")
	public class DeleteUserController {  

	    @RequestMapping(method = RequestMethod.DELETE)
	    public String deleteMerlegjegy(@RequestParam("id") Long id) {
	    	
	    	ks.delete(id);
	        return "merleg/merlegjegylista";
	    }
	}
	
	@GetMapping("/merleg/getvevo")
	@ResponseBody
	public List<Keszlet> getVevo(){
		
		return ks.findVevo();
	}

}
