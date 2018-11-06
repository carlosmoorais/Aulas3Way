package com.web.modelo;

public class Cliente {
	private int ID;
	private String nome;
	private String senha;
	private String login;
	private String endereco;
	private String cidade;
	private String bairro;
	
	
	public Cliente(String nome, String senha, String login, String endereco, String cidade, String bairro) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.login = login;
		this.endereco = endereco;
		this.cidade = cidade;
		this.bairro = bairro;
	}

	public Cliente() {
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Override
	public String toString() {
		return "Cliente [ID=" + ID + ", nome=" + nome + ", senha=" + senha + ", login=" + login + ", endereco="
				+ endereco + ", cidade=" + cidade + ", bairro=" + bairro + "]";
	}

}
