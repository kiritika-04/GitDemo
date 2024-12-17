package CompositeKeyJPA;

import javax.persistence.*;

@Entity
public class Enrollment {
	@EmbeddedId
	private CompositeKey ck;
	private String edate;
	
	public CompositeKey getCk() {
		return ck;
	}
	public void setCk(CompositeKey ck) {
		this.ck = ck;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	
	public Enrollment(CompositeKey ck, String edate) {
		this.ck = ck;
		this.edate = edate;
	} 
	
	public Enrollment() {
		 
	}
	
	

}
