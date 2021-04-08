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

import hu.sandorkonya.felvasarlasdb.service.KeszletService;

@Controller
public class FelvasarlasiJegyController {

	@Autowired
	KeszletService ks;
	
	@InitBinder
	public void init(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
	
	@GetMapping("/felvasarlas/felvasarlasijegy")
	public String merlegjegyView(Model model) {
		model.addAttribute("merlegjegyek",ks.findAll());
		return "felvasarlas/felvasarlasijegy";
	}
}
