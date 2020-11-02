package br.com.ifpb.agenda.model;

import java.util.Date;

public class Contato {
	private String nome;
	private String telefone;
	private Date dataCadastro;
	
	public Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
		this.dataCadastro = new Date();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}
