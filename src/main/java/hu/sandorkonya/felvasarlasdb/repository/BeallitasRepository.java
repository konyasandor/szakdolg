package hu.sandorkonya.felvasarlasdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hu.sandorkonya.felvasarlasdb.model.Beallitas;

@Repository
public interface BeallitasRepository extends JpaRepository<Beallitas, Long> {

}
