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

	public Double elsoOsztalySulyTermelo(){
		
		List<Keszlet> all = keszletRepository.findAll();
		
		Double osszeg = 0.0;
		
		for (Keszlet item : all) {
			if(!item.getVevo()) {
				osszeg+= item.getElsoOsztalySuly();
			}
		}
		return osszeg;
	}
	
	public Double masodOsztalySulyTermelo(){
		
		List<Keszlet> all = keszletRepository.findAll();
		
		Double osszeg = 0.0;
		
		for (Keszlet item : all) {
			if(!item.getVevo()) {
				osszeg+= item.getMasodOsztalySuly();
			}
		}
		return osszeg;
	}
	
	public Double harmadOsztalySulyTermelo(){
		
		List<Keszlet> all = keszletRepository.findAll();
		
		Double osszeg = 0.0;
		
		for (Keszlet item : all) {
			if(!item.getVevo()) {
				osszeg+= item.getHarmadOsztalySuly();
			}
		}
		return osszeg;
	}
	
	public Double negyeddOsztalySulyTermelo(){
		
		List<Keszlet> all = keszletRepository.findAll();
		
		Double osszeg = 0.0;
		
		for (Keszlet item : all) {
			if(!item.getVevo()) {
				osszeg+= item.getNegyedOsztalySuly();
			}
		}
		return osszeg;
	}
	
	public Double vastagGyokerSulyTermelo(){
		
		List<Keszlet> all = keszletRepository.findAll();
		
		Double osszeg = 0.0;
		
		for (Keszlet item : all) {
			if(!item.getVevo()) {
				osszeg+= item.getVastagGyokerSuly();
			}
		}
		return osszeg;
	}
	
	public Double vekonyGyokerSulyTermelo(){
		
		List<Keszlet> all = keszletRepository.findAll();
		
		Double osszeg = 0.0;
		
		for (Keszlet item : all) {
			if(!item.getVevo()) {
				osszeg+= item.getVekonyGyokerSuly();
			}
		}
		return osszeg;
	}
	
	public Double osszArTermelo(){
		
		List<Keszlet> all = keszletRepository.findAll();
		
		Double osszeg = 0.0;
		
		for (Keszlet item : all) {
			if(!item.getVevo()) {
				osszeg+= item.getOsszAr();
			}
		}
		return osszeg;
	}
	
	public Double elsoOsztalySulyVevo(){
		
		List<Keszlet> all = keszletRepository.findAll();
		
		Double osszeg = 0.0;
		
		for (Keszlet item : all) {
			if(item.getVevo()) {
				osszeg+= item.getElsoOsztalySuly();
			}
		}
		return osszeg;
	}
	
	public Double masodOsztalySulyVevo(){
		
		List<Keszlet> all = keszletRepository.findAll();
		
		Double osszeg = 0.0;
		
		for (Keszlet item : all) {
			if(item.getVevo()) {
				osszeg+= item.getMasodOsztalySuly();
			}
		}
		return osszeg;
	}
	
	public Double harmadOsztalySulyVevo(){
		
		List<Keszlet> all = keszletRepository.findAll();
		
		Double osszeg = 0.0;
		
		for (Keszlet item : all) {
			if(item.getVevo()) {
				osszeg+= item.getHarmadOsztalySuly();
			}
		}
		return osszeg;
	}
	
	public Double negyeddOsztalySulyVevo(){
		
		List<Keszlet> all = keszletRepository.findAll();
		
		Double osszeg = 0.0;
		
		for (Keszlet item : all) {
			if(item.getVevo()) {
				osszeg+= item.getNegyedOsztalySuly();
			}
		}
		return osszeg;
	}
	
	public Double vastagGyokerSulyVevo(){
		
		List<Keszlet> all = keszletRepository.findAll();
		
		Double osszeg = 0.0;
		
		for (Keszlet item : all) {
			if(item.getVevo()) {
				osszeg+= item.getVastagGyokerSuly();
			}
		}
		return osszeg;
	}
	
	public Double vekonyGyokerSulyVevo(){
		
		List<Keszlet> all = keszletRepository.findAll();
		
		Double osszeg = 0.0;
		
		for (Keszlet item : all) {
			if(item.getVevo()) {
				osszeg+= item.getVekonyGyokerSuly();
			}
		}
		return osszeg;
	}
	
	public Double osszArVevo(){
		
		List<Keszlet> all = keszletRepository.findAll();
		
		Double osszeg = 0.0;
		
		for (Keszlet item : all) {
			if(item.getVevo()) {
				osszeg+= item.getOsszAr();
			}
		}
		return osszeg;
	}
	
	public Double elsoOsztalySulyTelep() {
		
		return elsoOsztalySulyTermelo()-elsoOsztalySulyVevo();
	}
	
	public Double masodOsztalySulyTelep() {
		
		return masodOsztalySulyTermelo()-masodOsztalySulyVevo();
	}
	
	public Double harmadOsztalySulyTelep() {
		
		return harmadOsztalySulyTermelo()-harmadOsztalySulyVevo();
		
	}
	
	public Double negyedOsztalySulyTelep() {
		
		return negyeddOsztalySulyTermelo()-negyeddOsztalySulyVevo();
		
	}
	
	public Double vastagGyokerSulyTelep() {
		
		return vastagGyokerSulyTermelo()-vekonyGyokerSulyVevo();
	}
	
	public Double vekonyGyokerSulyTelep() {
		
		return vekonyGyokerSulyTermelo()-vekonyGyokerSulyVevo();
	}
}
