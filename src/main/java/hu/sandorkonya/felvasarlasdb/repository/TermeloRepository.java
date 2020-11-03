package hu.sandorkonya.felvasarlasdb.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hu.sandorkonya.felvasarlasdb.model.Termelo;

@Repository
public interface TermeloRepository extends JpaRepository<Termelo, Long> {
	
	List<Termelo> findByTermeloNev(String termeloNev);

	
	

}
