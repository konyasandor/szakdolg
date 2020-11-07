package hu.sandorkonya.felvasarlasdb.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	private String termeloOstermeloiIgazolvanySzam;
	private Date termeloOstermeloiIgazolvanyErvenyesseg;
	private String termeloAdoazonositoJel;
	private String termeloAdoSzam;
	private Date termeloSzuletesiIdo;
	private String termeloSzuletesiHely;
	private String termeloEdesAnyjaNeve ;
	private String termeloTajSzam;
	private String termeloCsaladiGazdasagSzam;
	private String termeloGlobalGapSzam;
	private String termeloTelefonSzam;
	private String termeloBankszamlaSzam;
	
	
	
	public Termelo() {
		super();
	}


	public Termelo(Long id, String termeloNev, String termeloLnev, String termeloCim,
			String termeloOstermeloiIgazolvanySzam, Date termeloOstermeloiIgazolvanyErvenyesseg,
			String termeloAdoazonositoJel, String termeloAdoSzam, Date termeloSzuletesiIdo,
			String termeloSzuletesiHely, String termeloEdesAnyjaNeve, String termeloTajSzam,
			String termeloCsaladiGazdasagSzam, String termeloGlobalGapSzam, String termeloTelefonSzam,
			String termeloBankszamlaSzam) {
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


	public String getTermeloOstermeloiIgazolvanySzam() {
		return termeloOstermeloiIgazolvanySzam;
	}


	public void setTermeloOstermeloiIgazolvanySzam(String termeloOstermeloiIgazolvanySzam) {
		this.termeloOstermeloiIgazolvanySzam = termeloOstermeloiIgazolvanySzam;
	}


	public Date getTermeloOstermeloiIgazolvanyErvenyesseg() {
		return termeloOstermeloiIgazolvanyErvenyesseg;
	}


	public void setTermeloOstermeloiIgazolvanyErvenyesseg(Date termeloOstermeloiIgazolvanyErvenyesseg) {
		this.termeloOstermeloiIgazolvanyErvenyesseg = termeloOstermeloiIgazolvanyErvenyesseg;
	}


	public String getTermeloAdoazonositoJel() {
		return termeloAdoazonositoJel;
	}


	public void setTermeloAdoazonositoJel(String termeloAdoazonositoJel) {
		this.termeloAdoazonositoJel = termeloAdoazonositoJel;
	}


	public String getTermeloAdoSzam() {
		return termeloAdoSzam;
	}


	public void setTermeloAdoSzam(String termeloAdoSzam) {
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


	public String getTermeloTajSzam() {
		return termeloTajSzam;
	}


	public void setTermeloTajSzam(String termeloTajSzam) {
		this.termeloTajSzam = termeloTajSzam;
	}


	public String getTermeloCsaladiGazdasagSzam() {
		return termeloCsaladiGazdasagSzam;
	}


	public void setTermeloCsaladiGazdasagSzam(String termeloCsaladiGazdasagSzam) {
		this.termeloCsaladiGazdasagSzam = termeloCsaladiGazdasagSzam;
	}


	public String getTermeloGlobalGapSzam() {
		return termeloGlobalGapSzam;
	}


	public void setTermeloGlobalGapSzam(String termeloGlobalGapSzam) {
		this.termeloGlobalGapSzam = termeloGlobalGapSzam;
	}


	public String getTermeloTelefonSzam() {
		return termeloTelefonSzam;
	}


	public void setTermeloTelefonSzam(String termeloTelefonSzam) {
		this.termeloTelefonSzam = termeloTelefonSzam;
	}


	public String getTermeloBankszamlaSzam() {
		return termeloBankszamlaSzam;
	}


	public void setTermeloBankszamlaSzam(String termeloBankszamlaSzam) {
		this.termeloBankszamlaSzam = termeloBankszamlaSzam;
	}
	
	
	
	
	
	
	

}
