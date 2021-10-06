package hu.sandorkonya.felvasarlasdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.sandorkonya.felvasarlasdb.model.AlFelvasarlasiJegy;
import hu.sandorkonya.felvasarlasdb.model.FelvasarlasiJegy;
import hu.sandorkonya.felvasarlasdb.repository.AlfelvasarlasiJegyRepository;

@Service
public class AlfelvasarlasiJegyService {
	
	@Autowired AlfelvasarlasiJegyRepository alfelvasarlasiJegyRepository;
	
	public void save(AlFelvasarlasiJegy alfelvasarlasijegy) {
		
		alfelvasarlasiJegyRepository.save(alfelvasarlasijegy);
	}
	
	public AlFelvasarlasiJegy findLast(){
		
		return alfelvasarlasiJegyRepository.findTopByOrderByIdDesc();
	}
	

}
