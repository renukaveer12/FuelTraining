package com.example.Student;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

	@PersistenceUnit
	private EntityManagerFactory emf;

	void getData() {
		EntityManager em;
		em = emf.createEntityManager();
		em.getTransaction().commit();
		em.getTransaction().begin();

		String jsql = "";

		// jsql="select e from Student as e";
		jsql = "select e from Student as e where e.id=100";
		Query q;
		q = em.createQuery(jsql);
		q.executeUpdate();
//		q.getResultList()
//		q.getSingleResult()

		em.getTransaction().commit();
	}
}


