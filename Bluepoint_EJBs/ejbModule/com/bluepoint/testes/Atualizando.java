package com.bluepoint.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bluepoint.model.Banca;

public class Atualizando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bluepoint");
		EntityManager em = emf.createEntityManager();
		
		Banca b = em.find(Banca.class, 2);
		
		em.getTransaction().begin();
		b.setNomeBanca("NovaBanca");
		em.getTransaction().commit();
		
		System.out.println("Banca alterada com sucesso!");
		
	}

}
