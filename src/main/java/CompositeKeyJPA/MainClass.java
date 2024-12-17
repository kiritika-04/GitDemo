package CompositeKeyJPA;

import javax.persistence.*;

public class MainClass {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CompositeKeyJPA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        CompositeKey ck=new CompositeKey();
        ck.setSid("st_01");
        ck.setCid("ck_100");
        
        Enrollment e=new Enrollment();
        e.setCk(ck);
        e.setEdate("01-12-2024");
        
        em.persist(e);
        em.getTransaction().commit();
        
       /* CompositeKey ck=new CompositeKey("s_001","c_100");
        Enrollment e=new Enrollment(ck,"01-12-2024");
        em.persist(e);
        em.getTransaction().commit();
        
        em.close();
        
        Query q=em.createQuery("select e from Student s join s.");*/
        
        Enrollment en=em.find(Enrollment.class, ck);
        System.out.println("Enrollment Date: " + en.getEdate());
        
        em.close();
        emf.close();
	}

}
