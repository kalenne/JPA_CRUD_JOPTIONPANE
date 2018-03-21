package rodar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pessoa.Atleta;

public class Programa {
	
	public static void main(String[] args) {
		
		Atleta at = new Atleta(null, "Joquinha", "Carintia");
		Atleta at2 = new Atleta(null, "Betao", "Ovo");
		Atleta at3 = new Atleta(null, "Zezao", "Coorintia");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(at);
		em.persist(at2);
		em.persist(at3);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}

}
