package hu.sandorkonya.felvasarlasdb.model;

import java.time.LocalDate;
import java.util.Date;

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
	//private Long tId;
	//private String tNev;
	
	private Long tId;
	private String tNev;
	private LocalDate leadasDatum;
	private Double elsoOsztalySuly;
	private Double masodOsztalySuly;
	private Double harmadOsztalySuly;
	private Double negyedOsztalySuly;
	private Double vastagGyokerSuly;
	private Double vekonyGyokerSuly;
	private Double osszAr;
	private Boolean vevo;
	private Boolean fizetve;
	
	public Keszlet() {
		super();
	}

	public Keszlet(Long id, Long tId, String tNev,LocalDate leadasDatum, Double elsoOsztalySuly, Double masodOsztalySuly, Double harmadOsztalySuly,
			Double negyedOsztalySuly, Double vastagGyokerSuly, Double vekonyGyokerSuly, Double osszAr,Boolean vevo, Boolean fizetve) {
		super();
		this.id = id;
		this.tId = tId;
		this.tNev = tNev;
		this.leadasDatum = leadasDatum;
		this.elsoOsztalySuly = elsoOsztalySuly;
		this.masodOsztalySuly = masodOsztalySuly;
		this.harmadOsztalySuly = harmadOsztalySuly;
		this.negyedOsztalySuly = negyedOsztalySuly;
		this.vastagGyokerSuly = vastagGyokerSuly;
		this.vekonyGyokerSuly = vekonyGyokerSuly;
		this.osszAr = osszAr;
		this.vevo = vevo;
		this.fizetve = fizetve;
	}

	public Long getId() {
		return id;
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

	public void settNev(String tNev) {
		this.tNev = tNev;
	}
	
	

	public LocalDate getLeadasDatum() {
		return leadasDatum;
	}

	public void setLeadasDatum(LocalDate leadasDatum) {
		this.leadasDatum = leadasDatum;
	}

	public Double getElsoOsztalySuly() {
		return elsoOsztalySuly;
	}

	public void setElsoOsztalySuly(Double elsoOsztalySuly) {
		this.elsoOsztalySuly = elsoOsztalySuly;
	}

	public Double getMasodOsztalySuly() {
		return masodOsztalySuly;
	}

	public void setMasodOsztalySuly(Double masodOsztalySuly) {
		this.masodOsztalySuly = masodOsztalySuly;
	}

	public Double getHarmadOsztalySuly() {
		return harmadOsztalySuly;
	}

	public void setHarmadOsztalySuly(Double harmadOsztalySuly) {
		this.harmadOsztalySuly = harmadOsztalySuly;
	}

	public Double getNegyedOsztalySuly() {
		return negyedOsztalySuly;
	}

	public void setNegyedOsztalySuly(Double negyedOsztalySuly) {
		this.negyedOsztalySuly = negyedOsztalySuly;
	}

	public Double getVastagGyokerSuly() {
		return vastagGyokerSuly;
	}

	public void setVastagGyokerSuly(Double vastagGyokerSuly) {
		this.vastagGyokerSuly = vastagGyokerSuly;
	}

	public Double getVekonyGyokerSuly() {
		return vekonyGyokerSuly;
	}

	public void setVekonyGyokerSuly(Double vekonyGyokerSuly) {
		this.vekonyGyokerSuly = vekonyGyokerSuly;
	}

	public Double getOsszAr() {
		return osszAr;
	}

	public void setOsszAr(Double osszAr) {
		this.osszAr = osszAr;
	}

	public Boolean getVevo() {
		return vevo;
	}

	public void setVevo(Boolean vevo) {
		this.vevo = vevo;
	}

	public Boolean getFizetve() {
		return fizetve;
	}

	public void setFizetve(Boolean fizetve) {
		this.fizetve = fizetve;
	}
	
	
	
	
	
	
	

}
