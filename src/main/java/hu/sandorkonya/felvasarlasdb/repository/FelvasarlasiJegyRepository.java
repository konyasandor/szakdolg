package hu.sandorkonya.felvasarlasdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hu.sandorkonya.felvasarlasdb.model.FelvasarlasiJegy;

@Repository
public interface FelvasarlasiJegyRepository extends JpaRepository<FelvasarlasiJegy, Long> {
	
	FelvasarlasiJegy findTopByOrderByIdDesc();
	
}
