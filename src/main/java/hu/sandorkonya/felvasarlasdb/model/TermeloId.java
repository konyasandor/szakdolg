package hu.sandorkonya.felvasarlasdb.model;

public class TermeloId {
	
	public Long Id;
	public String nev;
	public String lakcim;
	
	public TermeloId(Long id, String nev, String lakcim) {
		super();
		this.Id = id;
		this.nev = nev;
		this.lakcim = lakcim;
	}
	
	public TermeloId()
	{
		
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public String getLakcim() {
		return lakcim;
	}

	public void setLakcim(String lakcim) {
		this.lakcim = lakcim;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}
	
	

}
