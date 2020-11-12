package hu.sandorkonya.felvasarlasdb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.sandorkonya.felvasarlasdb.model.Beallitas;
import hu.sandorkonya.felvasarlasdb.repository.BeallitasRepository;

@Service
public class BeallitasService {

	@Autowired
	private BeallitasRepository beallitasRepository;
	
	public Beallitas findVetel(){
		
		Optional<Beallitas> optionalBeallitas = beallitasRepository.findById((long) 1);
		
		if(optionalBeallitas.isPresent()) {
			return optionalBeallitas.get();
		}else {
			return null;
		}
	}
	
	public Beallitas findEladas(){
		
		Optional<Beallitas> optionalBeallitas = beallitasRepository.findById((long) 2);
		
		if(optionalBeallitas.isPresent()) {
			return optionalBeallitas.get();
		}else {
			return null;
		}
	}
	
	public List<Beallitas> findAll(){
		
		return beallitasRepository.findAll();
	}
	
	public void saveVetel(Beallitas beallitas) {
		Beallitas beallitasFrissites = beallitasRepository.getOne((long) 1);
		beallitasFrissites.setElsoOsztalyAr(beallitas.getElsoOsztalyAr());
		beallitasFrissites.setMasodOsztalyAr(beallitas.getMasodOsztalyAr());
		beallitasFrissites.setHarmadOsztalyAr(beallitas.getHarmadOsztalyAr());
		beallitasFrissites.setNegyedOsztalyAr(beallitas.getNegyedOsztalyAr());
		beallitasFrissites.setVastagGyokerAr(beallitas.getVastagGyokerAr());
		beallitasFrissites.setVekonyGyokerAr(beallitas.getVekonyGyokerAr());
		beallitasRepository.save(beallitasFrissites);
	}
	
	public void saveEladas(Beallitas beallitas) {
		Beallitas beallitasFrissites = beallitasRepository.getOne((long) 2);
		beallitasFrissites.setElsoOsztalyAr(beallitas.getElsoOsztalyAr());
		beallitasFrissites.setMasodOsztalyAr(beallitas.getMasodOsztalyAr());
		beallitasFrissites.setHarmadOsztalyAr(beallitas.getHarmadOsztalyAr());
		beallitasFrissites.setNegyedOsztalyAr(beallitas.getNegyedOsztalyAr());
		beallitasFrissites.setVastagGyokerAr(beallitas.getVastagGyokerAr());
		beallitasFrissites.setVekonyGyokerAr(beallitas.getVekonyGyokerAr());
		beallitasRepository.save(beallitasFrissites);
	}
}
