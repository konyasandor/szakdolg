package hu.sandorkonya.felvasarlasdb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "beallitas")
public class Beallitas {
	
	@Id
	
	private Long id;
	private Integer elsoOsztalyAr;
	private Integer masodOsztalyAr;
	private Integer harmadOsztalyAr;
	private Integer negyedOsztalyAr;
	private Integer vastagGyokerAr;
	private Integer vekonyGyokerAr;
	
	
	public Beallitas() {
		super();
	}


	public Beallitas(Integer elsoOsztalyAr, Integer masodOsztalyAr, Integer harmadOsztalyAr, Integer negyedOsztalyAr,
			Integer vastagGyokerAr, Integer vekonyGyokerAr) {
		super();
		this.elsoOsztalyAr = elsoOsztalyAr;
		this.masodOsztalyAr = masodOsztalyAr;
		this.harmadOsztalyAr = harmadOsztalyAr;
		this.negyedOsztalyAr = negyedOsztalyAr;
		this.vastagGyokerAr = vastagGyokerAr;
		this.vekonyGyokerAr = vekonyGyokerAr;
	}


	public Integer getElsoOsztalyAr() {
		return elsoOsztalyAr;
	}


	public void setElsoOsztalyAr(Integer elsoOsztalyAr) {
		this.elsoOsztalyAr = elsoOsztalyAr;
	}


	public Integer getMasodOsztalyAr() {
		return masodOsztalyAr;
	}


	public void setMasodOsztalyAr(Integer masodOsztalyAr) {
		this.masodOsztalyAr = masodOsztalyAr;
	}


	public Integer getHarmadOsztalyAr() {
		return harmadOsztalyAr;
	}


	public void setHarmadOsztalyAr(Integer harmadOsztalyAr) {
		this.harmadOsztalyAr = harmadOsztalyAr;
	}


	public Integer getNegyedOsztalyAr() {
		return negyedOsztalyAr;
	}


	public void setNegyedOsztalyAr(Integer negyedOsztalyAr) {
		this.negyedOsztalyAr = negyedOsztalyAr;
	}


	public Integer getVastagGyokerAr() {
		return vastagGyokerAr;
	}


	public void setVastagGyokerAr(Integer vastagGyokerAr) {
		this.vastagGyokerAr = vastagGyokerAr;
	}


	public Integer getVekonyGyokerAr() {
		return vekonyGyokerAr;
	}


	public void setVekonyGyokerAr(Integer vekonyGyokerAr) {
		this.vekonyGyokerAr = vekonyGyokerAr;
	}
	
	

}
