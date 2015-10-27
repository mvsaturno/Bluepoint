package com.bluepoint.services;

import java.io.Serializable;

import com.bluepoint.dao.BancaDAO;
import com.bluepoint.model.Banca;
import com.bluepoint.util.FacesUtil;

public class ExcluirBanca implements Serializable{
	private BancaDAO bancaDAO = new BancaDAO();
	
	public void excluir(Banca banca){
		try {
			bancaDAO.excluir(banca);
			FacesUtil.addSuccessMessage("Banca removida com sucesso!");
		} catch (BluepointException e) {
			// TODO Auto-generated catch block
			FacesUtil.addErrorMessage(e.getMessage());
		}
		}
}
