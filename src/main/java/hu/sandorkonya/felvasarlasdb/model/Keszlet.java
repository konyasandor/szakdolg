package hu.sandorkonya.felvasarlasdb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "keszlet")
public class Keszlet {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long tId;
	private String tNev;
	private Integer elsoOsztalySuly;
	private Integer masodOsztalySuly;
	private Integer harmadOsztalySuly;
	private Integer negyedOsztalySuly;
	private Integer vastagGyokerSuly;
	private Integer vekonyGyokerSuly;
	private Integer osszAr;
	
	public Keszlet() {
		super();
	}

	public Keszlet(Long id, Long tId, String tNev, Integer elsoOsztalySuly, Integer masodOsztalySuly, Integer harmadOsztalySuly,
			Integer negyedOsztalySuly, Integer vastagGyokerSuly, Integer vekonyGyokerSuly, Integer osszAr) {
		super();
		this.id = id;
		this.tId = tId;
		this.tNev = tNev;
		this.elsoOsztalySuly = elsoOsztalySuly;
		this.masodOsztalySuly = masodOsztalySuly;
		this.harmadOsztalySuly = harmadOsztalySuly;
		this.negyedOsztalySuly = negyedOsztalySuly;
		this.vastagGyokerSuly = vastagGyokerSuly;
		this.vekonyGyokerSuly = vekonyGyokerSuly;
		this.osszAr = osszAr;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long gettId() {
		return tId;
	}

	public void settId(Long tId) {
		this.tId = tId;
	}

	public String gettNev() {
		return tNev;
	}

	public void setTNev(String tNev) {
		this.tNev = tNev;
	}

	public Integer getElsoOsztalySuly() {
		return elsoOsztalySuly;
	}

	public void setElsoOsztalySuly(Integer elsoOsztalySuly) {
		this.elsoOsztalySuly = elsoOsztalySuly;
	}

	public Integer getMasodOsztalySuly() {
		return masodOsztalySuly;
	}

	public void setMasodOsztalySuly(Integer masodOsztalySuly) {
		this.masodOsztalySuly = masodOsztalySuly;
	}

	public Integer getHarmadOsztalySuly() {
		return harmadOsztalySuly;
	}

	public void setHarmadOsztalySuly(Integer harmadOsztalySuly) {
		this.harmadOsztalySuly = harmadOsztalySuly;
	}

	public Integer getNegyedOsztalySuly() {
		return negyedOsztalySuly;
	}

	public void setNegyedOsztalySuly(Integer negyedOsztalySuly) {
		this.negyedOsztalySuly = negyedOsztalySuly;
	}

	public Integer getVastagGyokerSuly() {
		return vastagGyokerSuly;
	}

	public void setVastagGyokerSuly(Integer vastagGyokerSuly) {
		this.vastagGyokerSuly = vastagGyokerSuly;
	}

	public Integer getVekonyGyokerSuly() {
		return vekonyGyokerSuly;
	}

	public void setVekonyGyokerSuly(Integer vekonyGyokerSuly) {
		this.vekonyGyokerSuly = vekonyGyokerSuly;
	}

	public Integer getOsszAr() {
		return osszAr;
	}

	public void setOsszAr(Integer osszAr) {
		this.osszAr = osszAr;
	}
	
	
	

}
