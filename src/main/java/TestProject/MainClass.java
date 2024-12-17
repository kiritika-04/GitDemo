package TestProject;

import javax.persistence.*;

public class MainClass {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("com.cg.model");
		
		EntityManager mg=emf.createEntityManager();
		
		mg.getTransaction().begin();
		
	//insert
		/*	
	    Orders o=new Orders("Gloves",2,200);
		Orders o1=new Orders("Mask",10,5);
		Orders o2=new Orders("Forceps",2,400);
		Orders o3=new Orders("Needles",3,300);
		
		mg.persist(o);
		mg.persist(o1);
		mg.persist(o2);
		mg.persist(o3);
		
		
		mg.getTransaction().commit(); */
		
		//retrive
	/*	Orders o=mg.find(Orders.class, 3);
		mg.getTransaction().commit();
		System.out.println("Retrive data: "+o);*/
		
	/*	Orders o=mg.find(Orders.class,2);
		
		o.setOrder_name("Tray");
		mg.getTransaction().commit();
		System.out.println("Updated data: "+o);*/
		
		Orders o=mg.find(Orders.class, 4);
		mg.remove(o);
		mg.getTransaction().commit();
		System.out.println("Deteled data"+o);
		
		emf.close();
		mg.close();
	}

}
