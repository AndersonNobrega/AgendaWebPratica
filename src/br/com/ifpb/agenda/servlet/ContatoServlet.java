package br.com.ifpb.agenda.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ifpb.agenda.model.Agenda;
import br.com.ifpb.agenda.model.Contato;

@WebServlet("/agenda/contatos")
public class ContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String contato = "";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Agenda agenda = new Agenda();
		
		String header = request.getHeader("referer");
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaContato.jsp");
		
		if(header.equals("http://localhost:8080/home/contatoFormulario.jsp")) {
			request.setAttribute("contato", this.contato);
		}
		request.setAttribute("agenda", agenda.listaContato());
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Agenda agenda = new Agenda();
		
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		Contato contato;
		
		if(!nome.isEmpty() && !telefone.isEmpty()) {
			contato = new Contato(nome, telefone);
			
			agenda.adicionaContato(contato);
		} else {
			contato = null;
		}
		
		this.contato = contato.getNome();

		response.sendRedirect("contatos");
	}
}
