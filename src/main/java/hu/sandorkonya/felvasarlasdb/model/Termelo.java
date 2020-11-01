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
	private String termeloNev;
	private String termeloLnev;
	private String termeloCim;
	private Integer termeloOstermeloiIgazolvanySzam;
	private Date termeloOstermeloiIgazolvanyErvenyesseg;
	private Integer termeloAdoazonositoJel;
	private Integer termeloAdoSzam;
	private Date termeloSzuletesiIdo;
	private String termeloSzuletesiHely;
	private String termeloEdesAnyjaNeve ;
	private Integer termeloTajSzam;
	private Integer termeloCsaladiGazdasagSzam;
	private Integer termeloGlobalGapSzam;
	private Integer termeloTelefonSzam;
	private Integer termeloBankszamlaSzam;
	
	
	public Termelo() {
		super();
	}


	public Termelo(Long id, String termeloNev, String termeloLnev, String termeloCim,
			Integer termeloOstermeloiIgazolvanySzam, Date termeloOstermeloiIgazolvanyErvenyesseg,
			Integer termeloAdoazonositoJel, Integer termeloAdoSzam, Date termeloSzuletesiIdo,
			String termeloSzuletesiHely, String termeloEdesAnyjaNeve, Integer termeloTajSzam,
			Integer termeloCsaladiGazdasagSzam, Integer termeloGlobalGapSzam, Integer termeloTelefonSzam,
			Integer termeloBankszamlaSzam) {
		super();
		this.id = id;
		this.termeloNev = termeloNev;
		this.termeloLnev = termeloLnev;
		this.termeloCim = termeloCim;
		this.termeloOstermeloiIgazolvanySzam = termeloOstermeloiIgazolvanySzam;
		this.termeloOstermeloiIgazolvanyErvenyesseg = termeloOstermeloiIgazolvanyErvenyesseg;
		this.termeloAdoazonositoJel = termeloAdoazonositoJel;
		this.termeloAdoSzam = termeloAdoSzam;
		this.termeloSzuletesiIdo = termeloSzuletesiIdo;
		this.termeloSzuletesiHely = termeloSzuletesiHely;
		this.termeloEdesAnyjaNeve = termeloEdesAnyjaNeve;
		this.termeloTajSzam = termeloTajSzam;
		this.termeloCsaladiGazdasagSzam = termeloCsaladiGazdasagSzam;
		this.termeloGlobalGapSzam = termeloGlobalGapSzam;
		this.termeloTelefonSzam = termeloTelefonSzam;
		this.termeloBankszamlaSzam = termeloBankszamlaSzam;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTermeloNev() {
		return termeloNev;
	}


	public void setTermeloNev(String termeloNev) {
		this.termeloNev = termeloNev;
	}


	public String getTermeloLnev() {
		return termeloLnev;
	}


	public void setTermeloLnev(String termeloLnev) {
		this.termeloLnev = termeloLnev;
	}


	public String getTermeloCim() {
		return termeloCim;
	}


	public void setTermeloCim(String terneloCim) {
		this.termeloCim = terneloCim;
	}


	public Integer getTermeloOstermeloiIgazolvanySzam() {
		return termeloOstermeloiIgazolvanySzam;
	}


	public void setTermeloOstermeloiIgazolvanySzam(Integer termeloOstermeloiIgazolvanySzam) {
		this.termeloOstermeloiIgazolvanySzam = termeloOstermeloiIgazolvanySzam;
	}


	public Date getTermeloOstermeloiIgazolvanyErvenyesseg() {
		return termeloOstermeloiIgazolvanyErvenyesseg;
	}


	public void setTermeloOstermeloiIgazolvanyErvenyesseg(Date termeloOstermeloiIgazolvanyErvenyesseg) {
		this.termeloOstermeloiIgazolvanyErvenyesseg = termeloOstermeloiIgazolvanyErvenyesseg;
	}


	public Integer getTermeloAdoazonositoJel() {
		return termeloAdoazonositoJel;
	}


	public void setTermeloAdoazonositoJel(Integer termeloAdoazonositoJel) {
		this.termeloAdoazonositoJel = termeloAdoazonositoJel;
	}


	public Integer getTermeloAdoSzam() {
		return termeloAdoSzam;
	}


	public void setTermeloAdoSzam(Integer termeloAdoSzam) {
		this.termeloAdoSzam = termeloAdoSzam;
	}


	public Date getTermeloSzuletesiIdo() {
		return termeloSzuletesiIdo;
	}


	public void setTermeloSzuletesiIdo(Date termeloSzuletesiIdo) {
		this.termeloSzuletesiIdo = termeloSzuletesiIdo;
	}


	public String getTermeloSzuletesiHely() {
		return termeloSzuletesiHely;
	}


	public void setTermeloSzuletesiHely(String termeloSzuletesiHely) {
		this.termeloSzuletesiHely = termeloSzuletesiHely;
	}


	public String getTermeloEdesAnyjaNeve() {
		return termeloEdesAnyjaNeve;
	}


	public void setTermeloEdesAnyjaNeve(String termeloEdesAnyjaNeve) {
		this.termeloEdesAnyjaNeve = termeloEdesAnyjaNeve;
	}


	public Integer getTermeloTajSzam() {
		return termeloTajSzam;
	}


	public void setTermeloTajSzam(Integer termeloTajSzam) {
		this.termeloTajSzam = termeloTajSzam;
	}


	public Integer getTermeloCsaladiGazdasagSzam() {
		return termeloCsaladiGazdasagSzam;
	}


	public void setTermeloCsaladiGazdasagSzam(Integer termeloCsaladiGazdasagSzam) {
		this.termeloCsaladiGazdasagSzam = termeloCsaladiGazdasagSzam;
	}


	public Integer getTermeloGlobalGapSzam() {
		return termeloGlobalGapSzam;
	}


	public void setTermeloGlobalGapSzam(Integer termeloGlobalGapSzam) {
		this.termeloGlobalGapSzam = termeloGlobalGapSzam;
	}


	public Integer getTermeloTelefonSzam() {
		return termeloTelefonSzam;
	}


	public void setTermeloTelefonSzam(Integer termeloTelefonSzam) {
		this.termeloTelefonSzam = termeloTelefonSzam;
	}


	public Integer getTermeloBankszamlaSzam() {
		return termeloBankszamlaSzam;
	}


	public void setTermeloBankszamlaSzam(Integer termeloBankszamlaSzam) {
		this.termeloBankszamlaSzam = termeloBankszamlaSzam;
	}
	
	
	
	
	
	
	

}
