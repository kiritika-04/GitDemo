package JPARelation;

import javax.persistence.*;

@Entity
public class Hod {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String hname;
	
	public Hod() {}

    public Hod(String hname) {
        this.hname = hname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

}
