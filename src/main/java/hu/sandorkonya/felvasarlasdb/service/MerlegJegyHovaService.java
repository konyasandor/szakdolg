package hu.sandorkonya.felvasarlasdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.sandorkonya.felvasarlasdb.model.Merlegjegyhova;
import hu.sandorkonya.felvasarlasdb.repository.MerlegJegyHovaRepository;

@Service
public class MerlegJegyHovaService {
	
	@Autowired MerlegJegyHovaRepository merlegjegyhovarepository;
	
	public void save(Merlegjegyhova mjh) {
		merlegjegyhovarepository.save(mjh);
	}

}
