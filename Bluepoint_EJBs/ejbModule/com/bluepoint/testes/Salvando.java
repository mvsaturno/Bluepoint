package com.bluepoint.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bluepoint.model.Banca;

public class Salvando {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bluepoint");
		EntityManager em = emf.createEntityManager();
		
		//instanciando uma Banca pra testar no Banco:
		Banca b = new Banca();
		b.setNomeBanca("C�spe");
		
		em.getTransaction().begin();
		em.persist(b);
		em.getTransaction().commit();
		
		System.out.print("Banca salva com sucesso!");
	}
}
