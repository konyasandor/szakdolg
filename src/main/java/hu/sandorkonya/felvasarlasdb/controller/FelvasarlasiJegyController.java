package hu.sandorkonya.felvasarlasdb.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

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

import hu.sandorkonya.felvasarlasdb.model.AlFelvasarlasiJegy;
import hu.sandorkonya.felvasarlasdb.model.FelvasarlasiJegy;
import hu.sandorkonya.felvasarlasdb.model.Keszlet;
import hu.sandorkonya.felvasarlasdb.model.Merlegjegyhova;
import hu.sandorkonya.felvasarlasdb.model.Termelo;
import hu.sandorkonya.felvasarlasdb.model.TermeloId;
import hu.sandorkonya.felvasarlasdb.service.AlfelvasarlasiJegyService;
import hu.sandorkonya.felvasarlasdb.service.BeallitasService;
import hu.sandorkonya.felvasarlasdb.service.FelvasarlasService;
import hu.sandorkonya.felvasarlasdb.service.KeszletService;
import hu.sandorkonya.felvasarlasdb.service.MerlegJegyHovaService;
import hu.sandorkonya.felvasarlasdb.service.TermeloService;

@Controller
public class FelvasarlasiJegyController {

	@Autowired
	FelvasarlasService fs;
	@Autowired
	KeszletService ks;
	@Autowired
	TermeloService ts;
	@Autowired
	AlfelvasarlasiJegyService afs;
	@Autowired
	MerlegJegyHovaService mjhs;
	@Autowired
	BeallitasService bs;
	
	@InitBinder
	public void init(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
	
	@GetMapping("/felvasarlas/felvasarlasijegy")
	public String felvasarlasiJegyView(Model model) {
		
		model.addAttribute("termelo", ts.findNevId());
		
		
		
		return "felvasarlas/felvasarlasijegy";
	}
	
	@GetMapping("/felvasarlasjegytablelista")
	@ResponseBody
	public List<FelvasarlasiJegy> dataListTableFill(){
		
		return fs.findAll();
	}
	
	@GetMapping("/merlegjegyUnpaid")
	@ResponseBody
	public List<Keszlet> unpaidMerlegjegyListFill(){
		
		return ks.findUnpaid();
	}
	
	@PostMapping("felvasarlas/savefelvasarlasijegy")
    public String savevevo(@RequestParam (value="id") Long value){
		
		
		
		
		FelvasarlasiJegy felvasarlasiJegy = new FelvasarlasiJegy();
		
		felvasarlasiJegy.settId(value);
		LocalDate date = LocalDate.now();
		felvasarlasiJegy.setFelvasarlasiJegyKeszitese(date);
		
        fs.save(felvasarlasiJegy);
        
        return "redirect:/felvasarlas/ujfelvasarlasijegy";
    }
	
	@GetMapping("/felvasarlas/ujfelvasarlasijegy")
	public String felvasarlasiJegyUjView(Model model) {
		
		model.addAttribute("termelo", ts.findNevId());
		
		model.addAttribute("felvasarlasiJegy", fs.findLast());
		
		model.addAttribute("beallitas", bs.findVetel());
		
		return "felvasarlas/ujfelvasarlasijegy";
	}
	
	@PostMapping("felvasarlas/savealfelvasarlasijegy")
	public void saveAljegy(AlFelvasarlasiJegy alfelvasarlasijegy) {
		
		afs.save(alfelvasarlasijegy);
	}
	
	@PostMapping("/felvasarlas/savemjh")
		public void savemjh(@RequestParam Long mId,
								@RequestParam Long fId) {
		
		Merlegjegyhova mjh = new Merlegjegyhova();
		
		mjh.setfId(fId);
		mjh.setmId(mId);
		mjhs.save(mjh);
	}
		
	
}
