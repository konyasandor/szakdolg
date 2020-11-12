package hu.sandorkonya.felvasarlasdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hu.sandorkonya.felvasarlasdb.model.Keszlet;

@Repository
public interface KeszletRepository extends JpaRepository<Keszlet, Long> {
	
}
