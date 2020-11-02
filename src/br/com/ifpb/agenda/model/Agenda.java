package br.com.ifpb.agenda.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private static List<Contato> lista = new ArrayList<>();
	
	public Contato adicionaContato(Contato contato) {
		Agenda.lista.add(contato);
		
		return contato;
	}
	
	public boolean removeContato(String nome) {
		for(Contato contato : Agenda.lista) {
			if(contato.getNome().equals(nome)) {
				return Agenda.lista.remove(contato);
			}
		}
		
		return false;
	}
	
	public List<Contato> listaContato() {
		return Agenda.lista;
	}
}
