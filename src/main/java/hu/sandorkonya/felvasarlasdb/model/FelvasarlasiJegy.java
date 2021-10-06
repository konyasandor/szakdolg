package hu.sandorkonya.felvasarlasdb.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "felvasarlasijegy")
public class FelvasarlasiJegy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long tId;
	private String tNev;
	private LocalDate felvasarlasiJegyKeszitese;
	private Double elsoOsztalyBruttoSuly;
	private Double masodOsztalyBruttoSuly;
	private Double harmadOsztalyBruttoSuly;
	private Double negyedOsztalyBruttoSuly;
	private Double vastagBruttoSuly;
	private Double vekonyBruttoSuly;
	private Double elsoOsztErtek;
	private Double masodOsztErtek;
	private Double harmadOsztErtek;
	private Double negyedOsztErtek;
	private Double vastagErtek;
	private Double vekonyErtek;
	private Double osszErtek;
	private Boolean fizetve;
	
	public FelvasarlasiJegy() {
		super();
	}
	
	public FelvasarlasiJegy(Long id, Long tId, String tNev, LocalDate felvasarlasiJegyKeszitese, Double elsoOsztalyBruttoSuly,
			Double masodOsztalyBruttoSuly, Double harmadOsztalyBruttoSuly, Double negyedOsztalyBruttoSuly,
			Double vastagBruttoSuly, Double vekonyBruttoSuly, Double elsoOsztErtek, Double masodOsztErtek,
			Double harmadOsztErtek, Double negyedOsztErtek, Double vastagErtek, Double vekonyErtek, Double osszErtek,
			Boolean fizetve) {
		super();
		this.id = id;
		this.tId = tId;
		this.tNev = tNev;
		this.felvasarlasiJegyKeszitese = felvasarlasiJegyKeszitese;
		this.elsoOsztalyBruttoSuly = elsoOsztalyBruttoSuly;
		this.masodOsztalyBruttoSuly = masodOsztalyBruttoSuly;
		this.harmadOsztalyBruttoSuly = harmadOsztalyBruttoSuly;
		this.negyedOsztalyBruttoSuly = negyedOsztalyBruttoSuly;
		this.vastagBruttoSuly = vastagBruttoSuly;
		this.vekonyBruttoSuly = vekonyBruttoSuly;
		this.elsoOsztErtek = elsoOsztErtek;
		this.masodOsztErtek = masodOsztErtek;
		this.harmadOsztErtek = harmadOsztErtek;
		this.negyedOsztErtek = negyedOsztErtek;
		this.vastagErtek = vastagErtek;
		this.vekonyErtek = vekonyErtek;
		this.osszErtek = osszErtek;
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

	public LocalDate getFelvasarlasiJegyKeszitese() {
		return felvasarlasiJegyKeszitese;
	}


	public void setFelvasarlasiJegyKeszitese(LocalDate felvasarlasiJegyKeszitese) {
		this.felvasarlasiJegyKeszitese = felvasarlasiJegyKeszitese;
	}


	public Double getElsoOsztalyBruttoSuly() {
		return elsoOsztalyBruttoSuly;
	}


	public void setElsoOsztalyBruttoSuly(Double elsoOsztalyBruttoSuly) {
		this.elsoOsztalyBruttoSuly = elsoOsztalyBruttoSuly;
	}


	public Double getMasodOsztalyBruttoSuly() {
		return masodOsztalyBruttoSuly;
	}


	public void setMasodOsztalyBruttoSuly(Double masodOsztalyBruttoSuly) {
		this.masodOsztalyBruttoSuly = masodOsztalyBruttoSuly;
	}


	public Double getHarmadOsztalyBruttoSuly() {
		return harmadOsztalyBruttoSuly;
	}


	public void setHarmadOsztalyBruttoSuly(Double harmadOsztalyBruttoSuly) {
		this.harmadOsztalyBruttoSuly = harmadOsztalyBruttoSuly;
	}


	public Double getNegyedOsztalyBruttoSuly() {
		return negyedOsztalyBruttoSuly;
	}


	public void setNegyedOsztalyBruttoSuly(Double negyedOsztalyBruttoSuly) {
		this.negyedOsztalyBruttoSuly = negyedOsztalyBruttoSuly;
	}


	public Double getVastagBruttoSuly() {
		return vastagBruttoSuly;
	}


	public void setVastagBruttoSuly(Double vastagBruttoSuly) {
		this.vastagBruttoSuly = vastagBruttoSuly;
	}


	public Double getVekonyBruttoSuly() {
		return vekonyBruttoSuly;
	}


	public void setVekonyBruttoSuly(Double vekonyBruttoSuly) {
		this.vekonyBruttoSuly = vekonyBruttoSuly;
	}


	public Double getElsoOsztErtek() {
		return elsoOsztErtek;
	}


	public void setElsoOsztErtek(Double elsoOsztErtek) {
		this.elsoOsztErtek = elsoOsztErtek;
	}


	public Double getMasodOsztErtek() {
		return masodOsztErtek;
	}


	public void setMasodOsztErtek(Double masodOsztErtek) {
		this.masodOsztErtek = masodOsztErtek;
	}


	public Double getHarmadOsztErtek() {
		return harmadOsztErtek;
	}


	public void setHarmadOsztErtek(Double harmadOsztErtek) {
		this.harmadOsztErtek = harmadOsztErtek;
	}


	public Double getNegyedOsztErtek() {
		return negyedOsztErtek;
	}


	public void setNegyedOsztErtek(Double negyedOsztErtek) {
		this.negyedOsztErtek = negyedOsztErtek;
	}


	public Double getVastagErtek() {
		return vastagErtek;
	}


	public void setVastagErtek(Double vastagErtek) {
		this.vastagErtek = vastagErtek;
	}


	public Double getVekonyErtek() {
		return vekonyErtek;
	}


	public void setVekonyErtek(Double vekonyErtek) {
		this.vekonyErtek = vekonyErtek;
	}


	public Double getOsszErtek() {
		return osszErtek;
	}


	public void setOsszErtek(Double osszErtek) {
		this.osszErtek = osszErtek;
	}


	public Boolean getFizetve() {
		return fizetve;
	}


	public void setFizetve(Boolean fizetve) {
		this.fizetve = fizetve;
	}
	
	
	
	
	
	
}
