package hu.sandorkonya.felvasarlasdb.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import hu.sandorkonya.felvasarlasdb.model.Termelo;
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
    public String save(Termelo termelo) {
		
        ts.save(termelo);
        
        return "redirect:uj/ugyfel";
    }

}
