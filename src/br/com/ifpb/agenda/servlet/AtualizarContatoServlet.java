package br.com.ifpb.agenda.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ifpb.agenda.model.Agenda;

@WebServlet("/agenda/contatos/atualizar")
public class AtualizarContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/contatoAtualizarFormulario.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Agenda agenda = new Agenda();
		
		String nome = request.getParameter("nome");
		boolean resultado;
		
		if(agenda.removeContato(nome)) {
			resultado = true;
		} else {
			resultado = false;
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/contatoRemovido.jsp");
		request.setAttribute("resultado", resultado);
		rd.forward(request, response);
	}
}
