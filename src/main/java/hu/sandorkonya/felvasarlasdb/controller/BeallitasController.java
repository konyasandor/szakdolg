package hu.sandorkonya.felvasarlasdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hu.sandorkonya.felvasarlasdb.model.Beallitas;
import hu.sandorkonya.felvasarlasdb.service.BeallitasService;

@Controller
public class BeallitasController {
	
	@Autowired
	private BeallitasService beallitasService;
	
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
