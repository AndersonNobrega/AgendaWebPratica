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

@WebServlet("/agenda/contatos/atualizar")
public class AtualizarContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/contatoAtualizarFormulario.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Agenda agenda = new Agenda();
		
		int id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		
		agenda.atualizaContato(id - 1, new Contato(nome, telefone));
		
		response.sendRedirect("/agenda/contatos");
	}
}
