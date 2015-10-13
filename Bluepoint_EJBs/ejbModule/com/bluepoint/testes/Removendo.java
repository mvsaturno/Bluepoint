package com.bluepoint.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bluepoint.model.Banca;

public class Removendo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bluepoint");
		EntityManager em = emf.createEntityManager();
		
		Banca b = em.find(Banca.class, 1);
		
		em.getTransaction().begin();
		em.remove(b);
		em.getTransaction().commit();
		
		System.out.println("Banca 1 removida com sucesso!");
	}

}
