package com.bluepoint.services;

import java.io.Serializable;

import com.bluepoint.dao.BancaDAO;
import com.bluepoint.model.Banca;

public class CadastroBanca implements Serializable{
	
	//@Inject
	private BancaDAO bancaDAO = new BancaDAO();
	
	public void salvar(Banca banca) throws BluepointException{
		if (banca.getNomeBanca() == null || banca.getNomeBanca().trim().equals("")) {
			throw new BluepointException("O nome da banca � brigat�rio!");
		}
		
		this.bancaDAO.salvar(banca);
	}
}
