package br.com.caelum.financas.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory entityManagerFactory = 
			Persistence.createEntityManagerFactory("controlefinancas");
	
	public EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
	
}