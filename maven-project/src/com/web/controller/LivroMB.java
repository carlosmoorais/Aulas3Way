package com.web.controller;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.web.model.Livro;

@RequestScoped
@ManagedBean(name = "livroMB")
public class LivroMB {

	private ArrayList<Livro> listaLivro = new ArrayList<>();

	@PostConstruct
	public void init() {
		Livro livro1 = new Livro();
		livro1.setCodigo(1111);
		livro1.setTitulo("Harry Potter");
		livro1.setAutor("J.K. ROWLING");
		livro1.setDescricao("Aventura");
		livro1.setPreco(75.00);
		livro1.setImagem("wwww.com");

		Livro livro2 = new Livro();
		livro2.setCodigo(2222);
		livro2.setTitulo("Senhor dos Aneis");
		livro2.setAutor("J. R. R. Tolkien");
		livro2.setDescricao("Aventura");
		livro2.setPreco(70.00);
		livro2.setImagem("wwww.com");

		Livro livro3 = new Livro();
		livro3.setCodigo(3333);
		livro3.setTitulo("O Hobbit");
		livro3.setAutor("J. R. R. Tolkien");
		livro3.setDescricao("Aventura");
		livro3.setPreco(85.00);
		livro3.setImagem("wwww.com");

		Livro livro4 = new Livro();
		livro4.setCodigo(4444);
		livro4.setTitulo("Animais Fantásticos");
		livro4.setAutor("J.K. ROWLING");
		livro4.setDescricao("Aventura");
		livro4.setPreco(105.00);
		livro4.setImagem("wwww.com");

		Livro livro5 = new Livro();
		livro5.setCodigo(5555);
		livro5.setTitulo("Mitologia Nórdica");
		livro5.setAutor("Neil Gaiman");
		livro5.setDescricao("Aventura");
		livro5.setPreco(95.00);
		livro5.setImagem("wwww.com");

		getListaLivro().add(livro1);
		getListaLivro().add(livro2);
		getListaLivro().add(livro3);
		getListaLivro().add(livro4);
		getListaLivro().add(livro5);
	}

	public ArrayList<Livro> getListaLivro() {
		return listaLivro;
	}

	public void setListaLivro(ArrayList<Livro> listaLivro) {
		this.listaLivro = listaLivro;
	}
}
