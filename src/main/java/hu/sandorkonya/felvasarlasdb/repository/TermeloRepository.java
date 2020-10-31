package hu.sandorkonya.felvasarlasdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hu.sandorkonya.felvasarlasdb.model.Termelo;

@Repository
public interface TermeloRepository extends JpaRepository<Termelo, Long> {

}
