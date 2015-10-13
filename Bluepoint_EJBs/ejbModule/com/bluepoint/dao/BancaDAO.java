package com.bluepoint.dao;

import java.io.Serializable;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.bluepoint.model.Banca;

public class BancaDAO implements Serializable {
	
	@Inject
	private EntityManager em;
	
		public void salvar (Banca banca){
			em.getTransaction().begin();
			em.persist(banca);
			em.getTransaction().commit();
		}
}
