package hu.sandorkonya.felvasarlasdb.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hu.sandorkonya.felvasarlasdb.model.Beallitas;
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
		
		model.addAttribute("termelo", keszletService.termeloAll());
		model.addAttribute("elado", keszletService.vevoAll());
		
		return "index";
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
	
	@GetMapping("/ujmerlegjegy")
	public String postIndexMerlegjegy(Model model) {
		
		model.addAttribute("beallitas", beallitasService.findVetel());
		
		
		return "redirect:/termelomerlegjegy";
	}
	
	@PostMapping("/ujmerlegjegyment")
	public String postIndexMerlegjegy(@RequestParam Long tId,
										@RequestParam String tNev,
										@RequestParam Integer elsoOsztalySuly,
										@RequestParam Integer masodOsztalySuly,
										@RequestParam Integer harmadOsztalySuly,
										@RequestParam Integer negyedOsztalySuly,
										@RequestParam Integer vastagGyokerSuly,
										@RequestParam Integer vekonyGyokerSuly,
										@RequestParam Integer osszAr
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
			@RequestParam Integer elsoOsztalySuly,
			@RequestParam Integer masodOsztalySuly,
			@RequestParam Integer harmadOsztalySuly,
			@RequestParam Integer negyedOsztalySuly,
			@RequestParam Integer vastagGyokerSuly,
			@RequestParam Integer vekonyGyokerSuly,
			@RequestParam Integer osszAr) {
		
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
		
		return "ugyfelmentes";
	}
	
	@PostMapping("/ujtermelo")
	public String postIndex(@RequestParam String termeloNev,
							@RequestParam (required = false) String termeloLnev,
							@RequestParam String termeloCim,
							@RequestParam String termeloSzuletesiHely,
							@RequestParam Date termeloSzuletesiIdo,
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
	
	@GetMapping("/edittermelo")
	public String Edit(@RequestParam Long termelo, Model model) {
		//
		model.addAttribute("termelo", termeloService.edit(termelo));
		
		return "ugyfelszerkesztesment";
		
	}
	
	@PostMapping("/szerkesztesment")
	public String postIndexEdit(@RequestParam Long termeloId,
								@RequestParam String termeloNev,
								@RequestParam (required = false) String termeloLnev,
								@RequestParam String termeloCim,
								@RequestParam String termeloSzuletesiHely,
								@RequestParam Date termeloSzuletesiIdo,
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
	@GetMapping("/beallitas")
	public String beallitas(Model model){
		
		return "beallitas";
	}
	
	@PostMapping("/ujbeallitasVetel")
	public String postIndexBeallitasVetel(@RequestParam Integer elsoOsztalyAr,
									@RequestParam Integer masodOsztalyAr,
									@RequestParam Integer harmadOsztalyAr,
									@RequestParam Integer negyedOsztalyAr,
									@RequestParam Integer vastagGyokerAr,
									@RequestParam Integer vekonyGyokerAr) {
		
		Beallitas beallitas = new Beallitas();
		
		beallitas.setElsoOsztalyAr(elsoOsztalyAr);
		beallitas.setMasodOsztalyAr(masodOsztalyAr);
		beallitas.setHarmadOsztalyAr(harmadOsztalyAr);
		beallitas.setNegyedOsztalyAr(negyedOsztalyAr);
		beallitas.setVastagGyokerAr(vastagGyokerAr);
		beallitas.setVekonyGyokerAr(vekonyGyokerAr);
		
		
		beallitasService.saveVetel(beallitas);
		return "redirect:/beallitas";
	}
	
	@PostMapping("/ujbeallitasEladas")
	public String postIndexBeallitasEladas(@RequestParam Integer elsoOsztalyAr,
									@RequestParam Integer masodOsztalyAr,
									@RequestParam Integer harmadOsztalyAr,
									@RequestParam Integer negyedOsztalyAr,
									@RequestParam Integer vastagGyokerAr,
									@RequestParam Integer vekonyGyokerAr) {
		
		Beallitas beallitas = new Beallitas();
		
		beallitas.setElsoOsztalyAr(elsoOsztalyAr);
		beallitas.setMasodOsztalyAr(masodOsztalyAr);
		beallitas.setHarmadOsztalyAr(harmadOsztalyAr);
		beallitas.setNegyedOsztalyAr(negyedOsztalyAr);
		beallitas.setVastagGyokerAr(vastagGyokerAr);
		beallitas.setVekonyGyokerAr(vekonyGyokerAr);
		
		
		beallitasService.saveEladas(beallitas);
		return "redirect:/beallitas";
	}

}
