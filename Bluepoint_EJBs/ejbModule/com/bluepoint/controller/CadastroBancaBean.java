package com.bluepoint.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.bluepoint.model.Banca;
import com.bluepoint.services.BluepointException;
import com.bluepoint.services.CadastroBanca;
import com.bluepoint.util.FacesUtil;

@Named
@ViewScoped
public class CadastroBancaBean implements Serializable {
	
	@Inject
	private CadastroBanca cadastroBanca;
	
	private Banca banca;
	
	public void salvar(){
		try {
			this.cadastroBanca.salvar(banca);
			FacesUtil.addSuccessMessage("Banca cadastrada com sucesso!");
		} catch (BluepointException e) {
			FacesUtil.addErrorMessage(e.getMessage());
		}
	}
	
	@PostConstruct
	public void init(){
		this.limpar();
	}
	
	public void limpar(){
		this.banca = new Banca();
	}
	
	public Banca getBanca() {
		return banca;
	}
	public void setBanca(Banca banca) {
		this.banca = banca;
	}
	
	
}
