package JPARelation;

import javax.persistence.*;

import TestProject.Orders;

public class MainClass3 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPARelation");
        EntityManager em = emf.createEntityManager();
        
        Hod h= new Hod("kaviya");
        Department d =new Department("Engineering", h);
        
        Hod h1= new Hod("sakthi");
        Department d1 =new Department("Arts", h1);
        
        em.getTransaction().begin();
        em.persist(h);  
        em.persist(d); 
        em.persist(h1);  
        em.persist(d1); 
        em.getTransaction().commit();
        
       /* em.getTransaction().begin();
        
        Hod h=em.find(Hod.class, 2);
		em.remove(h);
		em.getTransaction().commit();
		System.out.println("Deteled data"+h); */
        
        em.close();
        emf.close();
	}

}
