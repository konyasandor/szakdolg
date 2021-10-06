package hu.sandorkonya.felvasarlasdb.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hu.sandorkonya.felvasarlasdb.model.Chart;
import hu.sandorkonya.felvasarlasdb.model.Keszlet;
import hu.sandorkonya.felvasarlasdb.model.Termelo;
import hu.sandorkonya.felvasarlasdb.service.BeallitasService;
import hu.sandorkonya.felvasarlasdb.service.KeszletService;
import hu.sandorkonya.felvasarlasdb.service.TermeloService;

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
	public String home(Model model){
		
		model.addAttribute("elsoOsztSulyTermelo", String.format("%,.0f", keszletService.elsoOsztalySulyTermelo()));
		model.addAttribute("masodOsztSulyTermelo", String.format("%,.0f",keszletService.masodOsztalySulyTermelo()));
		model.addAttribute("harmadOsztSulyTermelo", String.format("%,.0f",keszletService.harmadOsztalySulyTermelo()));
		model.addAttribute("negyedOsztSulyTermelo", String.format("%,.0f",keszletService.negyeddOsztalySulyTermelo()));
		model.addAttribute("vastagGyokerSulyTermelo", String.format("%,.0f",keszletService.vastagGyokerSulyTermelo()));
		model.addAttribute("vekonyGyokerSulyTermelo", String.format("%,.0f",keszletService.vekonyGyokerSulyTermelo()));
		model.addAttribute("osszArTermelo", String.format("%,.0f",keszletService.osszArTermelo()));
		
		model.addAttribute("elsoOsztSulyVevo", String.format("%,.0f", keszletService.elsoOsztalySulyVevo()));
		model.addAttribute("masodOsztSulyVevo", String.format("%,.0f", keszletService.masodOsztalySulyVevo()));
		model.addAttribute("harmadOsztSulyVevo", String.format("%,.0f", keszletService.harmadOsztalySulyVevo()));
		model.addAttribute("negyedOsztSulyVevo", String.format("%,.0f", keszletService.negyeddOsztalySulyVevo()));
		model.addAttribute("vastagGyokerSulyVevo", String.format("%,.0f", keszletService.vastagGyokerSulyVevo()));
		model.addAttribute("vekonyGyokerSulyVevo", String.format("%,.0f", keszletService.vekonyGyokerSulyVevo()));
		model.addAttribute("osszArVevo", String.format("%,.0f", keszletService.osszArVevo()));
		
		model.addAttribute("elsoOsztSulyTelep", String.format("%,.0f", keszletService.elsoOsztalySulyTelep()));
		model.addAttribute("masodOsztSulyTelep", String.format("%,.0f", keszletService.masodOsztalySulyTelep()));
		model.addAttribute("harmadOsztSulyTelep", String.format("%,.0f", keszletService.harmadOsztalySulyTelep()));
		model.addAttribute("negyedOsztSulyTelep", String.format("%,.0f", keszletService.negyedOsztalySulyTelep()));
		model.addAttribute("vastagGyokerSulyTelep", String.format("%,.0f", keszletService.vastagGyokerSulyTelep()));
		model.addAttribute("vekonyGyokerSulyTelep", String.format("%,.0f", keszletService.vekonyGyokerSulyTelep()));
		
		
		
		return "index";
	}
	
	@GetMapping("/chart")
	@ResponseBody
	public List<Chart> update(){
		
		return keszletService.napiOszzSuly();
	}
	
	@GetMapping("/termelok")
	@ResponseBody
	public List<Termelo> dataTableFill(){
		
		return termeloService.findAll();
	}
	
	
	
	
	
	//**********************   Termelői Mérlegjegy ***************************//
	@GetMapping("/termelomerlegjegy")
	public String termelomerlegjegy( Model model){
		
		model.addAttribute("beallitas", beallitasService.findVetel());
		return "termelomerlegjegy";
	}
	
	@GetMapping("/termelokeresmerleg")
	public String SearchMerleg(@RequestParam String termeloNevKeres,  Model model) {
		
		model.addAttribute("termelok", termeloService.search(termeloNevKeres));
		model.addAttribute("beallitas", beallitasService.findVetel());
		
		return "termelomerlegjegy";
		
	}
	
	@GetMapping("/addtermelomerlegjegy")
	public String AddTermelo(@RequestParam (required = false) Long termelo,  Model model) {
		
		model.addAttribute("termelok", termeloService.edit(termelo));
		model.addAttribute("beallitas", beallitasService.findVetel());
		
		
		return "ujmerlegjegy";
		
	}
	
	
	
	@PostMapping("/ujmerlegjegyment")
	public String postIndexMerlegjegy(@RequestParam Long tId,
										@RequestParam String tNev,
										@RequestParam Double elsoOsztalySuly,
										@RequestParam Double masodOsztalySuly,
										@RequestParam Double harmadOsztalySuly,
										@RequestParam Double negyedOsztalySuly,
										@RequestParam Double vastagGyokerSuly,
										@RequestParam Double vekonyGyokerSuly,
										@RequestParam Double osszAr
							) {
		
		Keszlet ujKeszlet = new Keszlet();
		
		ujKeszlet.settId(tId);
		ujKeszlet.settNev(tNev);
		ujKeszlet.setElsoOsztalySuly(elsoOsztalySuly);
		ujKeszlet.setMasodOsztalySuly(masodOsztalySuly);
		ujKeszlet.setHarmadOsztalySuly(harmadOsztalySuly);
		ujKeszlet.setNegyedOsztalySuly(negyedOsztalySuly);
		ujKeszlet.setVastagGyokerSuly(vastagGyokerSuly);
		ujKeszlet.setVekonyGyokerSuly(vekonyGyokerSuly);
		ujKeszlet.setOsszAr(osszAr);
		ujKeszlet.setVevo(false);
		
		keszletService.save(ujKeszlet);
		return "redirect:/termelomerlegjegy";
	}
	
	//**********************   Vevői Mérlegjegy ***************************//
	
	@GetMapping("/vevoimerlegjegy")
	public String vevomerlegjegy( Model model){
		
		model.addAttribute("beallitas", beallitasService.findEladas());
		return "vevoimerlegjegy";
	}
	
	@GetMapping("/vevokeresmerleg")
	public String SearchMerlegVevo(@RequestParam String vevoNevKeres,  Model model) {
		
		model.addAttribute("termelok", termeloService.search(vevoNevKeres));
		model.addAttribute("beallitas", beallitasService.findEladas());
		
		return "vevoimerlegjegy";
		
	}
	
	@GetMapping("/addvevomerlegjegy")
	public String AddVevo(@RequestParam (required = false) Long termelo,  Model model) {
		
		model.addAttribute("termelok", termeloService.edit(termelo));
		model.addAttribute("beallitas", beallitasService.findEladas());
		
		
		return "ujmerlegjegyvevo";
		
	}
	@GetMapping("/ujmerlegjegyvevo")
	public String postIndexMerlegjegyVevo(Model model) {
		
		model.addAttribute("beallitas", beallitasService.findVetel());
		
		
		return "redirect:/vevoimerlegjegy";
	}
	
	@PostMapping("/ujmerlegjegyvevoment")
	public String postIndexMerlegjegyEladas(Model model,
			@RequestParam Long tId,
			@RequestParam String tNev,
			@RequestParam Double elsoOsztalySuly,
			@RequestParam Double masodOsztalySuly,
			@RequestParam Double harmadOsztalySuly,
			@RequestParam Double negyedOsztalySuly,
			@RequestParam Double vastagGyokerSuly,
			@RequestParam Double vekonyGyokerSuly,
			@RequestParam Double osszAr) {
		
		model.addAttribute("beallitas", beallitasService.findEladas());
		Keszlet ujKeszlet = new Keszlet();
		
		ujKeszlet.settId(tId);
		ujKeszlet.settNev(tNev);
		ujKeszlet.setElsoOsztalySuly(elsoOsztalySuly);
		ujKeszlet.setMasodOsztalySuly(masodOsztalySuly);
		ujKeszlet.setHarmadOsztalySuly(harmadOsztalySuly);
		ujKeszlet.setNegyedOsztalySuly(negyedOsztalySuly);
		ujKeszlet.setVastagGyokerSuly(vastagGyokerSuly);
		ujKeszlet.setVekonyGyokerSuly(vekonyGyokerSuly);
		ujKeszlet.setOsszAr(osszAr);
		ujKeszlet.setVevo(true);
		
		keszletService.save(ujKeszlet);
		return "redirect:/termelomerlegjegy";
	}
	

	//**********************   Felvasarlasi jegy ********************//
	@GetMapping("/felvasarlasijegy")
	public String felvasarlasijegy(){
		return "felvasarlasijegy";
	}
	
	//**********************   Egyedi lekérdezések *******************************//
	@GetMapping("/egyedilekerdezesek")
	public String egyedilekerdezesek(){
		return "egyedilekerdezesek";
	}
	
	//**********************   Ügyfél szerkesztés/mentés ************//
	@GetMapping("/ugyfelszerkesztes")
	public String ugyfelszerkesztes() {
		return "ugyfelszerkesztes";
	}
	
	@GetMapping("/ugyfelmentes")
	public String ugyfelmentes(Model model){
		
		return "ugyfelmentes";
	}
	
	@PostMapping("/ujtermelo")
	public String postIndex(@RequestParam String termeloNev,
							@RequestParam (required = false) String termeloLnev,
							@RequestParam String termeloCim,
							@RequestParam String termeloSzuletesiHely,
							@RequestParam LocalDate termeloSzuletesiIdo,
							@RequestParam String termeloEdesAnyjaNeve,
							@RequestParam String termeloTelefonSzam,
							@RequestParam String termeloTajSzam,
							@RequestParam String termeloOstermeloiIgazolvanySzam,
							@RequestParam Date termeloOstermeloiIgazolvanyErvenyesseg,
							@RequestParam String termeloAdoazonositoJel,
							@RequestParam String termeloAdoSzam,
							@RequestParam String termeloCsaladiGazdasagSzam,
							@RequestParam String termeloGlobalGapSzam,
							@RequestParam String termeloBankszamlaSzam) {
		
		Termelo ujTermelo = new Termelo();
		
		ujTermelo.setTermeloNev(termeloNev);
		ujTermelo.setTermeloLnev(termeloLnev);
		ujTermelo.setTermeloCim(termeloCim);
		ujTermelo.setTermeloSzuletesiHely(termeloSzuletesiHely);
		ujTermelo.setTermeloSzuletesiIdo(termeloSzuletesiIdo);
		ujTermelo.setTermeloEdesAnyjaNeve(termeloEdesAnyjaNeve);
		ujTermelo.setTermeloTelefonSzam(termeloTelefonSzam);
		ujTermelo.setTermeloTajSzam(termeloTajSzam);
		ujTermelo.setTermeloOstermeloiIgazolvanySzam(termeloOstermeloiIgazolvanySzam);
		ujTermelo.setTermeloOstermeloiIgazolvanyErvenyesseg(termeloOstermeloiIgazolvanyErvenyesseg);
		ujTermelo.setTermeloAdoazonositoJel(termeloAdoazonositoJel);
		ujTermelo.setTermeloAdoSzam(termeloAdoSzam);
		ujTermelo.setTermeloCsaladiGazdasagSzam(termeloCsaladiGazdasagSzam);
		ujTermelo.setTermeloGlobalGapSzam(termeloGlobalGapSzam);
		ujTermelo.setTermeloBankszamlaSzam(termeloBankszamlaSzam);
	
		
		termeloService.save(ujTermelo);
		return "redirect:/ugyfelszerkesztes";
	}
	
	@GetMapping("/termelokeres")
	public String Search(@RequestParam String termeloNevKeres, Model model) {
		
		model.addAttribute("termelok", termeloService.search(termeloNevKeres));
		
		return "ugyfelszerkesztes";
		
	}
	
	
	@PostMapping("/szerkesztesment")
	public String postIndexEdit(@RequestParam Long termeloId,
								@RequestParam String termeloNev,
								@RequestParam (required = false) String termeloLnev,
								@RequestParam String termeloCim,
								@RequestParam String termeloSzuletesiHely,
								@RequestParam LocalDate termeloSzuletesiIdo,
								@RequestParam String termeloEdesAnyjaNeve,
								@RequestParam String termeloTelefonSzam,
								@RequestParam String termeloTajSzam,
								@RequestParam String termeloOstermeloiIgazolvanySzam,
								@RequestParam Date termeloOstermeloiIgazolvanyErvenyesseg,
								@RequestParam String termeloAdoazonositoJel,
								@RequestParam String termeloAdoSzam,
								@RequestParam String termeloCsaladiGazdasagSzam,
								@RequestParam String termeloGlobalGapSzam,
								@RequestParam String termeloBankszamlaSzam) {
		
		Termelo termeloModositott = new Termelo();
		
		termeloModositott.setId(termeloId);
		termeloModositott.setTermeloNev(termeloNev);
		termeloModositott.setTermeloLnev(termeloLnev);
		termeloModositott.setTermeloCim(termeloCim);
		termeloModositott.setTermeloSzuletesiHely(termeloSzuletesiHely);
		termeloModositott.setTermeloSzuletesiIdo(termeloSzuletesiIdo);
		termeloModositott.setTermeloEdesAnyjaNeve(termeloEdesAnyjaNeve);
		termeloModositott.setTermeloTelefonSzam(termeloTelefonSzam);
		termeloModositott.setTermeloTajSzam(termeloTajSzam);
		termeloModositott.setTermeloOstermeloiIgazolvanySzam(termeloOstermeloiIgazolvanySzam);
		termeloModositott.setTermeloOstermeloiIgazolvanyErvenyesseg(termeloOstermeloiIgazolvanyErvenyesseg);
		termeloModositott.setTermeloAdoazonositoJel(termeloAdoazonositoJel);
		termeloModositott.setTermeloAdoSzam(termeloAdoSzam);
		termeloModositott.setTermeloCsaladiGazdasagSzam(termeloCsaladiGazdasagSzam);
		termeloModositott.setTermeloGlobalGapSzam(termeloGlobalGapSzam);
		termeloModositott.setTermeloBankszamlaSzam(termeloBankszamlaSzam);
		
		termeloService.save(termeloModositott);
		return "redirect:/ugyfelszerkesztes";
	}
	
	
	//**********************   Beállítás ****************************//
	

}
