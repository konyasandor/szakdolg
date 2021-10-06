package hu.sandorkonya.felvasarlasdb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "alfelvasarlasijegyhova")
public class AlfelvasarlasiJegyHova {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long fId;
	private Long alId;
	
	
	
	public AlfelvasarlasiJegyHova() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AlfelvasarlasiJegyHova(Long id, Long fId, Long alId) {
		super();
		this.id = id;
		this.fId = fId;
		this.alId = alId;
	}
	
	
	public Long getfId() {
		return fId;
	}
	public void setfId(Long fId) {
		this.fId = fId;
	}
	public Long getAlId() {
		return alId;
	}
	public void setAlId(Long alId) {
		this.alId = alId;
	}
	
	

}
