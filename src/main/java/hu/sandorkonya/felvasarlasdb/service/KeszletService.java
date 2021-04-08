package hu.sandorkonya.felvasarlasdb.service;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.sandorkonya.felvasarlasdb.model.Chart;
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
	
	public List<Chart> napiOszzSuly(){
		
		List<Chart> osszLista = new ArrayList<>();
		
		List<LocalDate> datumok = new ArrayList<>();
		
		List<Keszlet> all = keszletRepository.findAll();
		
		for (Keszlet item : all) {
			if(!datumok.contains(item.getLeadasDatum())) {
				datumok.add(item.getLeadasDatum());
			}
		}
		
		for (int i = 0; i < datumok.size(); i++) {
			Double elsoOszt = 0.0;
			Double masodOszt = 0.0;
			Double harmadOszt = 0.0;
			Double negyedOszt = 0.0;
			Double vastagOszt = 0.0;
			Double vekonyOszt = 0.0;
			
			Chart minta = new Chart();
			
			minta.setDatum(datumok.get(i));
			
				for (Keszlet item : all) {
					if(datumok.get(i).equals(item.getLeadasDatum()) && !item.getVevo()) {
						elsoOszt += item.getElsoOsztalySuly();
						masodOszt += item.getMasodOsztalySuly();
						harmadOszt += item.getHarmadOsztalySuly();
						negyedOszt += item.getNegyedOsztalySuly();
						vastagOszt += item.getVastagGyokerSuly();
						vekonyOszt += item.getVekonyGyokerSuly();
					}
					
				}
				
			minta.setNapiElsoOsszSuly(elsoOszt);
			minta.setNapiMasodOsszSuly(masodOszt);
			minta.setNapiHarmadOsszSuly(harmadOszt);
			minta.setNapiNegyedOsszSuly(negyedOszt);
			minta.setNapiVastagOsszSuly(vastagOszt);
			minta.setNapiVekonyOsszSuly(vekonyOszt);
			
			osszLista.add(minta);
			
		}
		
		
		
		
		
		return osszLista;
		
		
	}
}
