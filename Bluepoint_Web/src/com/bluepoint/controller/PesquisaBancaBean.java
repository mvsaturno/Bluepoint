package com.bluepoint.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.bluepoint.model.Banca;
import com.bluepoint.services.ExcluirBanca;
import com.bluepoint.services.PesquisaBanca;

@Named
@ViewScoped
public class PesquisaBancaBean implements Serializable {
	
	PesquisaBanca pesquisaBanca = new PesquisaBanca();
	ExcluirBanca excluirBanca = new ExcluirBanca();
	
	private List<Banca> bancas = new ArrayList<>();
	
	private Banca bancaSelecionada;
	
	public List<Banca> getBancas(){
		return bancas;
	}
	
	
	public void excluir(){
			excluirBanca.excluir(bancaSelecionada);
			this.bancas.remove(bancaSelecionada);
	}
	
	public Banca getBancaSelecionado() {
		return bancaSelecionada;
	}

	public void setBancaSelecionado(Banca bancaSelecionado) {
		this.bancaSelecionada = bancaSelecionado;
	}
		
	@PostConstruct
	public void inicializar() {
		bancas = pesquisaBanca.pesquisaAll();
	}


	public Banca getBancaSelecionada() {
		return bancaSelecionada;
	}
	public void setBancaSelecionada(Banca bancaSelecionada) {
		this.bancaSelecionada = bancaSelecionada;
	}


	public void setBancas(List<Banca> bancas) {
		this.bancas = bancas;
	}


	public PesquisaBanca getPesquisaBanca() {
		return pesquisaBanca;
	}


	public void setPesquisaBanca(PesquisaBanca pesquisaBanca) {
		this.pesquisaBanca = pesquisaBanca;
	}


	public ExcluirBanca getExcluirBanca() {
		return excluirBanca;
	}


	public void setExcluirBanca(ExcluirBanca excluirBanca) {
		this.excluirBanca = excluirBanca;
	}
	
	
}
