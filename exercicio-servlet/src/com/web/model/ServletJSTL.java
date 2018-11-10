package com.web.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletJSTL")
public class ServletJSTL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Livro> listaLivros = new ArrayList<>();

		Livro livro1 = new Livro();
		livro1.setAutor("M., CARLOS");
		livro1.setDescricao("Livro de Auto-Ajuda");
		livro1.setTitulo("Vença na vida!");

		Livro livro2 = new Livro();
		livro2.setAutor("J., JADSON");
		livro2.setDescricao("Livro Literário");
		livro2.setTitulo("A mulher");

		Livro livro3 = new Livro();
		livro3.setAutor("P., Marcos");
		livro3.setDescricao("Livro de Romance");
		livro3.setTitulo("O encontro");

		Livro livro4 = new Livro();
		livro4.setAutor("B., Fátima");
		livro4.setDescricao("Livro de Receita");
		livro4.setTitulo("Bolos e tortas");

		Livro livro5 = new Livro();
		livro5.setAutor("B., Amanda");
		livro5.setDescricao("Livro de Pegadinhas");
		livro5.setTitulo("Pegadinhas vol 5");

		listaLivros.add(livro1);
		listaLivros.add(livro2);
		listaLivros.add(livro3);
		listaLivros.add(livro4);
		listaLivros.add(livro5);

		request.setAttribute("listaLivrosNoAtributo", listaLivros);

		RequestDispatcher rd = getServletContext().getRequestDispatcher("/listagemJstl.jsp");
		rd.forward(request, response);
		
		HttpSession session = request.getSession();
		session.setAttribute("userName", "Usuário Logado: Carlos M.");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
