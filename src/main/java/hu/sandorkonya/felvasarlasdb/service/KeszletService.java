package hu.sandorkonya.felvasarlasdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.sandorkonya.felvasarlasdb.model.Keszlet;
import hu.sandorkonya.felvasarlasdb.repository.KeszletRepository;

@Service
public class KeszletService {
	
	@Autowired
	private KeszletRepository keszletRepository;
	
	public List<Keszlet> findAll(){
		
		return keszletRepository.findAll();
	}
	
	public void save(Keszlet keszlet) {
		
		keszletRepository.save(keszlet);
	}

}
