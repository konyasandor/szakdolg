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
	private Double elsoOsztEgysegAr;
	private Double masodOsztEgysegAr;
	private Double harmadOsztEgysegAr;
	private Double negyedOsztEgysegAr;
	private Double vastagEgysegAr;
	private Double vekonyEgysegAr;
	private Double elsoOsztLevonas;
	private Double masodOsztLevonas;
	private Double harmadOsztLevonas;
	private Double negyedOsztLevonas;
	private Double vastagLevonas;
	private Double vekonyLevonas;
	private Double elsoOsztalySuly;
	private Double masodOsztalySuly;
	private Double harmadOsztalySuly;
	private Double negyedOsztalySuly;
	private Double vastagGyokerSuly;
	private Double vekonyGyokerSuly;
	private Double elsoOsztalyErteke;
	private Double masodOsztalyErteke;
	private Double harmadOsztalyErteke;
	private Double negyedOsztalyErteke;
	private Double vastagErteke;
	private Double vekonyErteke;
	private Double osszAr;
	private Double eloleg;
	private Double kifizetendo;
	private Boolean vevo;
	private Boolean fizetve;
	
	public Keszlet() {
		super();
	}
	
	public Keszlet(Long tId, String tNev, LocalDate leadasDatum, Double elsoOsztEgysegAr, Double masodOsztEgysegAr,
			Double harmadOsztEgysegAr, Double negyedOsztEgysegAr, Double vastagEgysegAr, Double vekonyEgysegAr,
			Double elsoOsztLevonas, Double masodOsztLevonas, Double harmadOsztLevonas, Double negyedOsztLevonas,
			Double vastagLevonas, Double vekonyLevonas, Double elsoOsztalySuly, Double masodOsztalySuly,
			Double harmadOsztalySuly, Double negyedOsztalySuly, Double vastagGyokerSuly, Double vekonyGyokerSuly,
			Double elsoOsztalyErteke, Double masodOsztalyErteke, Double harmadOsztalyErteke, Double negyedOsztalyErteke,
			Double vastagErteke, Double vekonyErteke, Double osszAr, Double eloleg, Double kifizetendo, Boolean vevo,
			Boolean fizetve) {
		super();
		this.tId = tId;
		this.tNev = tNev;
		this.leadasDatum = leadasDatum;
		this.elsoOsztEgysegAr = elsoOsztEgysegAr;
		this.masodOsztEgysegAr = masodOsztEgysegAr;
		this.harmadOsztEgysegAr = harmadOsztEgysegAr;
		this.negyedOsztEgysegAr = negyedOsztEgysegAr;
		this.vastagEgysegAr = vastagEgysegAr;
		this.vekonyEgysegAr = vekonyEgysegAr;
		this.elsoOsztLevonas = elsoOsztLevonas;
		this.masodOsztLevonas = masodOsztLevonas;
		this.harmadOsztLevonas = harmadOsztLevonas;
		this.negyedOsztLevonas = negyedOsztLevonas;
		this.vastagLevonas = vastagLevonas;
		this.vekonyLevonas = vekonyLevonas;
		this.elsoOsztalySuly = elsoOsztalySuly;
		this.masodOsztalySuly = masodOsztalySuly;
		this.harmadOsztalySuly = harmadOsztalySuly;
		this.negyedOsztalySuly = negyedOsztalySuly;
		this.vastagGyokerSuly = vastagGyokerSuly;
		this.vekonyGyokerSuly = vekonyGyokerSuly;
		this.elsoOsztalyErteke = elsoOsztalyErteke;
		this.masodOsztalyErteke = masodOsztalyErteke;
		this.harmadOsztalyErteke = harmadOsztalyErteke;
		this.negyedOsztalyErteke = negyedOsztalyErteke;
		this.vastagErteke = vastagErteke;
		this.vekonyErteke = vekonyErteke;
		this.osszAr = osszAr;
		this.eloleg = eloleg;
		this.kifizetendo = kifizetendo;
		this.vevo = vevo;
		this.fizetve = fizetve;
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

	public void settNev(String tNev) {
		this.tNev = tNev;
	}

	public LocalDate getLeadasDatum() {
		return leadasDatum;
	}

	public void setLeadasDatum(LocalDate leadasDatum) {
		this.leadasDatum = leadasDatum;
	}

	public Double getElsoOsztEgysegAr() {
		return elsoOsztEgysegAr;
	}

	public void setElsoOsztEgysegAr(Double elsoOsztEgysegAr) {
		this.elsoOsztEgysegAr = elsoOsztEgysegAr;
	}

	public Double getMasodOsztEgysegAr() {
		return masodOsztEgysegAr;
	}

	public void setMasodOsztEgysegAr(Double masodOsztEgysegAr) {
		this.masodOsztEgysegAr = masodOsztEgysegAr;
	}

	public Double getHarmadOsztEgysegAr() {
		return harmadOsztEgysegAr;
	}

	public void setHarmadOsztEgysegAr(Double harmadOsztEgysegAr) {
		this.harmadOsztEgysegAr = harmadOsztEgysegAr;
	}

	public Double getNegyedOsztEgysegAr() {
		return negyedOsztEgysegAr;
	}

	public void setNegyedOsztEgysegAr(Double negyedOsztEgysegAr) {
		this.negyedOsztEgysegAr = negyedOsztEgysegAr;
	}

	public Double getVastagEgysegAr() {
		return vastagEgysegAr;
	}

	public void setVastagEgysegAr(Double vastagEgysegAr) {
		this.vastagEgysegAr = vastagEgysegAr;
	}

	public Double getVekonyEgysegAr() {
		return vekonyEgysegAr;
	}

	public void setVekonyEgysegAr(Double vekonyEgysegAr) {
		this.vekonyEgysegAr = vekonyEgysegAr;
	}

	public Double getElsoOsztLevonas() {
		return elsoOsztLevonas;
	}

	public void setElsoOsztLevonas(Double elsoOsztLevonas) {
		this.elsoOsztLevonas = elsoOsztLevonas;
	}

	public Double getMasodOsztLevonas() {
		return masodOsztLevonas;
	}

	public void setMasodOsztLevonas(Double masodOsztLevonas) {
		this.masodOsztLevonas = masodOsztLevonas;
	}

	public Double getHarmadOsztLevonas() {
		return harmadOsztLevonas;
	}

	public void setHarmadOsztLevonas(Double harmadOsztLevonas) {
		this.harmadOsztLevonas = harmadOsztLevonas;
	}

	public Double getNegyedOsztLevonas() {
		return negyedOsztLevonas;
	}

	public void setNegyedOsztLevonas(Double negyedOsztLevonas) {
		this.negyedOsztLevonas = negyedOsztLevonas;
	}

	public Double getVastagLevonas() {
		return vastagLevonas;
	}

	public void setVastagLevonas(Double vastagLevonas) {
		this.vastagLevonas = vastagLevonas;
	}

	public Double getVekonyLevonas() {
		return vekonyLevonas;
	}

	public void setVekonyLevonas(Double vekonyLevonas) {
		this.vekonyLevonas = vekonyLevonas;
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

	public Double getElsoOsztalyErteke() {
		return elsoOsztalyErteke;
	}

	public void setElsoOsztalyErteke(Double elsoOsztalyErteke) {
		this.elsoOsztalyErteke = elsoOsztalyErteke;
	}

	public Double getMasodOsztalyErteke() {
		return masodOsztalyErteke;
	}

	public void setMasodOsztalyErteke(Double masodOsztalyErteke) {
		this.masodOsztalyErteke = masodOsztalyErteke;
	}

	public Double getHarmadOsztalyErteke() {
		return harmadOsztalyErteke;
	}

	public void setHarmadOsztalyErteke(Double harmadOsztalyErteke) {
		this.harmadOsztalyErteke = harmadOsztalyErteke;
	}

	public Double getNegyedOsztalyErteke() {
		return negyedOsztalyErteke;
	}

	public void setNegyedOsztalyErteke(Double negyedOsztalyErteke) {
		this.negyedOsztalyErteke = negyedOsztalyErteke;
	}

	public Double getVastagErteke() {
		return vastagErteke;
	}

	public void setVastagErteke(Double vastagErteke) {
		this.vastagErteke = vastagErteke;
	}

	public Double getVekonyErteke() {
		return vekonyErteke;
	}

	public void setVekonyErteke(Double vekonyErteke) {
		this.vekonyErteke = vekonyErteke;
	}

	public Double getOsszAr() {
		return osszAr;
	}

	public void setOsszAr(Double osszAr) {
		this.osszAr = osszAr;
	}

	public Double getEloleg() {
		return eloleg;
	}

	public void setEloleg(Double eloleg) {
		this.eloleg = eloleg;
	}

	public Double getKifizetendo() {
		return kifizetendo;
	}

	public void setKifizetendo(Double kifizetendo) {
		this.kifizetendo = kifizetendo;
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
