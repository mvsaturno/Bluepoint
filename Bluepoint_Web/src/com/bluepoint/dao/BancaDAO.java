package com.bluepoint.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bluepoint.model.Banca;
import com.bluepoint.services.BluepointException;
import com.bluepoint.util.Transactional;

public class BancaDAO implements Serializable {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("bluepoint");
	
	@Inject
	private EntityManager em = emf.createEntityManager();
	
	private boolean resultado = false;
	
	public boolean salvar (Banca banca){
		resultado = false;
		try {
			em.getTransaction().begin();
			em.persist(banca);
			em.getTransaction().commit();
			resultado = true;
		} catch (Exception e) {
			e.getMessage();
		}
		return resultado;
	}
	
	public void salvar2(Banca banca){
		em.persist(banca);
	}
	
	
	public boolean editar (Banca banca){
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return resultado;
	}
	
	public boolean apagar (Banca banca){
	
		try {
			em.getTransaction().begin();
			em.remove(banca);
			em.getTransaction().commit();
			resultado = true;
		} catch (Exception e) {
			e.getMessage();
		}
		
		return resultado;
	}
	
	@SuppressWarnings("unchecked")
	public List<Banca> consultaBancas(){
		return em.createQuery("from Banca", Banca.class).getResultList();
	}
	
	public Banca consultaBanca(Banca banca){
		Banca b = null;
		try {
			b = em.find(Banca.class, banca.getIdBanca());
		} catch (Exception e) {
			e.getMessage();
		}
		return b;
	}

	/*@Transactional*/
	public void excluir(Banca banca) throws BluepointException{
		Banca bancaTemp = em.find(Banca.class, banca.getIdBanca());
		
		em.remove(bancaTemp);
		em.flush();
	}
}
