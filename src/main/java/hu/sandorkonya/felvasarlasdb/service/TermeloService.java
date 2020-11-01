package hu.sandorkonya.felvasarlasdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.sandorkonya.felvasarlasdb.model.Termelo;
import hu.sandorkonya.felvasarlasdb.repository.TermeloRepository;

@Service
public class TermeloService {

	@Autowired
	private TermeloRepository termeloRepository;
	
	public List<Termelo> findAll(){
		return termeloRepository.findAll();
	}
	
	public void save(Termelo termelo) {
		termeloRepository.save(termelo);
	}
	
	
}
