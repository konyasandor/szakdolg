package hu.sandorkonya.felvasarlasdb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "merlegjegyhova")
public class Merlegjegyhova {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long fId;
	private Long mId;
	
	
	
	public Merlegjegyhova() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Merlegjegyhova(Long id, Long fId, Long mId) {
		super();
		this.id = id;
		this.fId = fId;
		this.mId = mId;
	}


	public Long getfId() {
		return fId;
	}


	public void setfId(Long fId) {
		this.fId = fId;
	}


	public Long getmId() {
		return mId;
	}


	public void setmId(Long mId) {
		this.mId = mId;
	}
	
	
	

}
