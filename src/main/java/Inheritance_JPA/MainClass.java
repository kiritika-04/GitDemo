package Inheritance_JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("Inheritance_JPA");
		
		EntityManager mg=emf.createEntityManager();
		
		Trainee t2=new Trainee("kiritika",20000,5);
		Trainee t3=new Trainee("kaviya",21000,6);
		
		Manager m2=new Manager("sakthi","IT",40000);
		Manager m3=new Manager("sameena","finance",41000);
		
		mg.getTransaction().begin();
		mg.persist(t2);
		mg.persist(t3);
		mg.persist(m2);
		mg.persist(m3);
		mg.getTransaction().commit();
		
		emf.close();
		mg.close();
		
	}

}
