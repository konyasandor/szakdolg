package hu.sandorkonya.felvasarlasdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hu.sandorkonya.felvasarlasdb.model.Merlegjegyhova;

@Repository
public interface MerlegJegyHovaRepository extends JpaRepository<Merlegjegyhova, Long>{

}
