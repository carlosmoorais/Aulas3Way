package com.web.mapeamento;

import java.util.ArrayList;

public class Projeto {
	private String nome;
	private String descricao;
	private ArrayList<FUNCIONARIO> funcionarios;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ArrayList<FUNCIONARIO> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<FUNCIONARIO> funcionarios) {
		this.funcionarios = funcionarios;
	}
}
