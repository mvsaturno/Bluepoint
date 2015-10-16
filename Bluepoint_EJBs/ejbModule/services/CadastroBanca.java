package services;

import java.io.Serializable;

import javax.inject.Inject;

import com.bluepoint.dao.BancaDAO;
import com.bluepoint.model.Banca;

public class CadastroBanca implements Serializable{
	
	@Inject
	private BancaDAO bancaDAO;
	
	public void salvar(Banca banca) throws BluepointException{
		if (banca.getNomeBanca() == null || banca.getNomeBanca().trim().equals("")) {
			throw new BluepointException("O nome da banca é brigatório!");
		}
		
		this.bancaDAO.salvar(banca);
	}
}
