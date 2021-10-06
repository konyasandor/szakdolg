package hu.sandorkonya.felvasarlasdb.model;

import java.time.LocalDate;
import java.util.Date;

public class Chart {
	
	public LocalDate datum;
	public Double napiElsoOsszSuly;
	public Double napiMasodOsszSuly;
	public Double napiHarmadOsszSuly;
	public Double napiNegyedOsszSuly;
	public Double napiVastagOsszSuly;
	public Double napiVekonyOsszSuly;
	
	public Chart(LocalDate datum, Double napiElsoOsszSuly, Double napiMasodOsszSuly, Double napiHarmadOsszSuly,
			Double napiNegyedOsszSuly, Double napiVastagOsszSuly, Double napiVekonyOsszSuly) {
		super();
		this.datum = datum;
		this.napiElsoOsszSuly = napiElsoOsszSuly;
		this.napiMasodOsszSuly = napiMasodOsszSuly;
		this.napiHarmadOsszSuly = napiHarmadOsszSuly;
		this.napiNegyedOsszSuly = napiNegyedOsszSuly;
		this.napiVastagOsszSuly = napiVastagOsszSuly;
		this.napiVekonyOsszSuly = napiVekonyOsszSuly;
	}
	
	public Chart() {
		
	}

	public LocalDate getDatum() {
		return datum;
	}

	public void setDatum(LocalDate date) {
		this.datum = date;
	}

	public Double getNapiElsoOsszSuly() {
		return napiElsoOsszSuly;
	}

	public void setNapiElsoOsszSuly(Double napiElsoOsszSuly) {
		this.napiElsoOsszSuly = napiElsoOsszSuly;
	}

	public Double getNapiMasodOsszSuly() {
		return napiMasodOsszSuly;
	}

	public void setNapiMasodOsszSuly(Double napiMasodOsszSuly) {
		this.napiMasodOsszSuly = napiMasodOsszSuly;
	}

	public Double getNapiHarmadOsszSuly() {
		return napiHarmadOsszSuly;
	}

	public void setNapiHarmadOsszSuly(Double napiHarmadOsszSuly) {
		this.napiHarmadOsszSuly = napiHarmadOsszSuly;
	}

	public Double getNapiNegyedOsszSuly() {
		return napiNegyedOsszSuly;
	}

	public void setNapiNegyedOsszSuly(Double napiNegyedOsszSuly) {
		this.napiNegyedOsszSuly = napiNegyedOsszSuly;
	}

	public Double getNapiVastagOsszSuly() {
		return napiVastagOsszSuly;
	}

	public void setNapiVastagOsszSuly(Double napiVastagOsszSuly) {
		this.napiVastagOsszSuly = napiVastagOsszSuly;
	}

	public Double getNapiVekonyOsszSuly() {
		return napiVekonyOsszSuly;
	}

	public void setNapiVekonyOsszSuly(Double napiVekonyOsszSuly) {
		this.napiVekonyOsszSuly = napiVekonyOsszSuly;
	}

	
	
	
	
	
	
	
	
	
	

}
