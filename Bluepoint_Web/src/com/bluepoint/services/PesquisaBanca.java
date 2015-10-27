package com.bluepoint.services;

import java.io.Serializable;
import java.util.List;

import com.bluepoint.dao.BancaDAO;
import com.bluepoint.model.Banca;

public class PesquisaBanca implements Serializable{
	
	private BancaDAO bancaDAO = new BancaDAO();
	
	public List<Banca> pesquisaAll(){
		return bancaDAO.consultaBancas();
	}
	
	public Banca pesquisaBanca(Banca banca){
		return pesquisaBanca(banca);
	}

}
