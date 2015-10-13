package com.bluepoint.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bluepoint.model.Banca;

public class Consultanto {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bluepoint");
		EntityManager em = emf.createEntityManager();
		
		Banca b = em.find(Banca.class, 4);
		
		if (b != null) {
			System.out.println("Nome da Banca: " + b.getNomeBanca());
			System.out.println("Id da Banca: " + b.getIdBanca());
		} else {
			System.out.println("Banca não encontrada!");
		}
	} 

}
