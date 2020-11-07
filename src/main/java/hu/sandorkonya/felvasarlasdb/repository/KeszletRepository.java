package hu.sandorkonya.felvasarlasdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import hu.sandorkonya.felvasarlasdb.model.Keszlet;

@Repository
public interface KeszletRepository extends JpaRepository<Keszlet, Long> {
	
	@Query(value = "SELECT Sum(elso_osztaly_suly), sum(masod_osztaly_suly), sum(harmad_osztaly_suly), sum(negyed_osztaly_suly), sum(vastag_gyoker_suly), sum(vekony_gyoker_suly) FROM felvasarlasdb.keszlet WHERE vevo=false;", nativeQuery = true)
	List<Object[]> findAllSumTermelo();
	
	@Query(value = "SELECT Sum(elso_osztaly_suly), sum(masod_osztaly_suly), sum(harmad_osztaly_suly), sum(negyed_osztaly_suly), sum(vastag_gyoker_suly), sum(vekony_gyoker_suly) FROM felvasarlasdb.keszlet WHERE vevo=true;", nativeQuery = true)
	List<Object[]> findAllSumVevo();

}
