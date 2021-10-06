package hu.sandorkonya.felvasarlasdb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.sandorkonya.felvasarlasdb.model.FelvasarlasiJegy;
import hu.sandorkonya.felvasarlasdb.model.Termelo;
import hu.sandorkonya.felvasarlasdb.model.TermeloId;
import hu.sandorkonya.felvasarlasdb.repository.FelvasarlasiJegyRepository;
import hu.sandorkonya.felvasarlasdb.repository.TermeloRepository;

@Service
public class FelvasarlasService {
	
	@Autowired 
	private FelvasarlasiJegyRepository felvasarlasRepository;
	
	
	public List<FelvasarlasiJegy> findAll(){
		
		return felvasarlasRepository.findAll();
	}
	
	public void save(FelvasarlasiJegy felvasarlasiJegy){
		
		felvasarlasRepository.save(felvasarlasiJegy);
	}
	
	public FelvasarlasiJegy findLast(){
		
		return felvasarlasRepository.findTopByOrderByIdDesc();
	}
	
	

}
