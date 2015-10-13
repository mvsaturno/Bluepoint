package com.bluepoint.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="banca")
public class Banca {
	
	private int idBanca;
	private String nomeBanca;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdBanca() {
		return idBanca;
	}
	public void setIdBanca(int idBanca) {
		this.idBanca = idBanca;
	}

	@Column
	public String getNomeBanca() {
		return nomeBanca;
	}
	public void setNomeBanca(String nomeBanca) {
		this.nomeBanca = nomeBanca;
	}
	
	@Override
	public String toString() {
	
		return "Código: " + this.getIdBanca() + " \n"
			 + "Nome da Banca: " + this.getNomeBanca() + " \n\n";
		
	}
}