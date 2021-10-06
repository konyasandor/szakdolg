package hu.sandorkonya.felvasarlasdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hu.sandorkonya.felvasarlasdb.model.AlFelvasarlasiJegy;

@Repository

public interface AlfelvasarlasiJegyRepository extends JpaRepository<AlFelvasarlasiJegy, Long>{
	
	AlFelvasarlasiJegy findTopByOrderByIdDesc();

}
