package br.com.ifpb.agenda.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private static List<Contato> lista = new ArrayList<>();
	
	public Contato adicionaContato(Contato contato) {
		Agenda.lista.add(contato);
		
		return contato;
	}
	
	public Contato removeContato(int index) {
		return Agenda.lista.remove(index);
	}
	
	public List<Contato> listaContato() {
		return Agenda.lista;
	}
	
	public Contato atualizaContato(int index, Contato contato) {
		return Agenda.lista.set(index, contato);
	}
	
	public int tamanho() {
		return Agenda.lista.size();
	}
}
