package com.web.exercicio1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Exercicio1-servlet")
public class Exercicio1 extends HttpServlet {

private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String nome = req.getParameter("nome");
		String profissao = req.getParameter("profissao");
		out.println("<html>"
					+"<head><title>Exercicio 1</title></head>"
					+"<body>"
					+"<h1>Meu nome é "+ nome + " e minha profissão é "+ profissao + "</h1>"
					+"</body></html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

	}
}

// localhost:8080/exercicio-servlet