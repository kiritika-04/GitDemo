package JPARelation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.*;

public class MainClassAuthor {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPARelation");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Author a=new Author();
        
        Book b=new Book();
        Book b1=new Book();
        
        a.setName("jkr");
        
        List<Book> lb=new ArrayList<Book>();
        b.setTitle("harrypotter and the chamber of secrets");
        b.setAuthor(a);
        lb.add(b);
        
        b1.setTitle("harrypotter and the goblet of fire");
        b1.setAuthor(a);
        lb.add(b1);
        
        a.setBooks(lb);
        
        em.persist(a);
        em.persist(b);
        em.persist(b1);
        
        em.getTransaction().commit();
        
        em.close();
        emf.close();
	}

}
