package hu.sandorkonya.felvasarlasdb.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "termelo")
public class Termelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nev;
	private String lnev;
	private Integer ostermeloiIgazolvanySzam;
	private Date ostermeloiIgazolvanyErvenyesseg;
	private Integer adoazonositoJel;
	private Integer adoSzam;
	private Date szuletesiIdo;
	private String szuletesiHely;
	private String edesAnyjaNeve ;
	private Integer tajSzam;
	private Integer csaladiGazdasagSzam;
	private Integer GlobalGapSzam;
	private Integer telefonSzam;
	private Integer bankszamlaSzam;
	
	
	public Termelo() {
		super();
	}


	public Termelo(Long id, String nev, String lnev, Integer ostermeloiIgazolvanySzam,
			Date ostermeloiIgazolvanyErvenyesseg, Integer adoazonositoJel, Integer adoSzam, Date szuletesiIdo,
			String szuletesiHely, String edesAnyjaNeve, Integer tajSzam, Integer csaladiGazdasagSzam,
			Integer globalGapSzam, Integer telefonSzam, Integer bankszamlaSzam) {
		super();
		this.id = id;
		this.nev = nev;
		this.lnev = lnev;
		this.ostermeloiIgazolvanySzam = ostermeloiIgazolvanySzam;
		this.ostermeloiIgazolvanyErvenyesseg = ostermeloiIgazolvanyErvenyesseg;
		this.adoazonositoJel = adoazonositoJel;
		this.adoSzam = adoSzam;
		this.szuletesiIdo = szuletesiIdo;
		this.szuletesiHely = szuletesiHely;
		this.edesAnyjaNeve = edesAnyjaNeve;
		this.tajSzam = tajSzam;
		this.csaladiGazdasagSzam = csaladiGazdasagSzam;
		this.GlobalGapSzam = globalGapSzam;
		this.telefonSzam = telefonSzam;
		this.bankszamlaSzam = bankszamlaSzam;
		
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNev() {
		return nev;
	}


	public void setNev(String nev) {
		this.nev = nev;
	}


	public String getLnev() {
		return lnev;
	}


	public void setLnev(String lnev) {
		this.lnev = lnev;
	}


	public Integer getOstermeloiIgazolvanySzam() {
		return ostermeloiIgazolvanySzam;
	}


	public void setOstermeloiIgazolvanySzam(Integer ostermeloiIgazolvanySzam) {
		this.ostermeloiIgazolvanySzam = ostermeloiIgazolvanySzam;
	}


	public Date getOstermeloiIgazolvanyErvenyesseg() {
		return ostermeloiIgazolvanyErvenyesseg;
	}


	public void setOstermeloiIgazolvanyErvenyesseg(Date ostermeloiIgazolvanyErvenyesseg) {
		this.ostermeloiIgazolvanyErvenyesseg = ostermeloiIgazolvanyErvenyesseg;
	}


	public Integer getAdoazonositoJel() {
		return adoazonositoJel;
	}


	public void setAdoazonositoJel(Integer adoazonositoJel) {
		this.adoazonositoJel = adoazonositoJel;
	}


	public Integer getAdoSzam() {
		return adoSzam;
	}


	public void setAdoSzam(Integer adoSzam) {
		this.adoSzam = adoSzam;
	}


	public Date getSzuletesiIdo() {
		return szuletesiIdo;
	}


	public void setSzuletesiIdo(Date szuletesiIdo) {
		this.szuletesiIdo = szuletesiIdo;
	}


	public String getSzuletesiHely() {
		return szuletesiHely;
	}


	public void setSzuletesiHely(String szuletesiHely) {
		this.szuletesiHely = szuletesiHely;
	}


	public String getEdesAnyjaNeve() {
		return edesAnyjaNeve;
	}


	public void setEdesAnyjaNeve(String edesAnyjaNeve) {
		this.edesAnyjaNeve = edesAnyjaNeve;
	}


	public Integer getTajSzam() {
		return tajSzam;
	}


	public void setTajSzam(Integer tajSzam) {
		this.tajSzam = tajSzam;
	}


	public Integer getCsaladiGazdasagSzam() {
		return csaladiGazdasagSzam;
	}


	public void setCsaladiGazdasagSzam(Integer csaladiGazdasagSzam) {
		this.csaladiGazdasagSzam = csaladiGazdasagSzam;
	}


	public Integer getGlobalGapSzam() {
		return GlobalGapSzam;
	}


	public void setGlobalGapSzam(Integer globalGapSzam) {
		GlobalGapSzam = globalGapSzam;
	}


	public Integer getTelefonSzam() {
		return telefonSzam;
	}


	public void setTelefonSzam(Integer telefonSzam) {
		this.telefonSzam = telefonSzam;
	}


	public Integer getBankszamlaSzam() {
		return bankszamlaSzam;
	}


	public void setBankszamlaSzam(Integer bankszamlaSzam) {
		this.bankszamlaSzam = bankszamlaSzam;
	}
	
	
	
	
	

}
