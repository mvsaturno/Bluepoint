package com.bluepoint.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.bluepoint.dao.BancaDAO;
import com.bluepoint.model.Banca;
import com.bluepoint.services.BluepointException;
import com.bluepoint.util.FacesUtil;

@Named
@ViewScoped
public class PesquisaBancaBean implements Serializable {
	
	BancaDAO bancaDAO = new BancaDAO();
	
	private List<Banca> bancas = new ArrayList<>();
	
	private Banca bancaSelecionada;
	
	public List<Banca> getBancas(){
		return bancas;
	}
	
	public void excluir(){
		
		try {
			bancaDAO.excluir(bancaSelecionada);
			this.bancas.remove(bancaSelecionada);
			FacesUtil.addSuccessMessage("Banca " + bancaSelecionada.getNomeBanca() + "excluída com sucesso!");
		} catch (BluepointException e) {
			FacesUtil.addErrorMessage(e.getMessage());
		}
		
	}
	
	public Banca getBancaSelecionado() {
		return bancaSelecionada;
	}

	public void setBancaSelecionado(Banca bancaSelecionado) {
		this.bancaSelecionada = bancaSelecionado;
	}
		
	@PostConstruct
	public void inicializar() {
		bancas = bancaDAO.consultaBancas();
	}
}
