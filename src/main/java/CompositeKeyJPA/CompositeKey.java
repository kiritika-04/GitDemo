package CompositeKeyJPA;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class CompositeKey implements Serializable {
	private String sid;
    private String cid;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public CompositeKey(String sid, String cid) {
		this.sid = sid;
		this.cid = cid;
	}
	public CompositeKey() {
		 
	}
    
    
}
