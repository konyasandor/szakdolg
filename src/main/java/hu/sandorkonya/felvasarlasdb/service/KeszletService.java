package hu.sandorkonya.felvasarlasdb.service;

import java.util.ArrayList;
import java.util.Arrays;
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

	public  List<Object[]> termeloAll() {
		return keszletRepository.findAllSumTermelo();
	}
	
	public List<Object[]> vevoAll() {
		return keszletRepository.findAllSumVevo();
	}
	
	public List<Object[]> ossz(){
		List<Object[]> ossz = null;
		List<Object[]> termelo  = keszletRepository.findAllSumTermelo();
		List<Object[]> vevo = keszletRepository.findAllSumVevo();
		
		
		termelo.get(0);
		
		
		
		return ossz;
		
	}
}
