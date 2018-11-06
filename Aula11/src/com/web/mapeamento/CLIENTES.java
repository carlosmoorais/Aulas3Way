package com.web.mapeamento;

public class CLIENTES {
	private String NOME;
	private String ENDERECO;
	private int CPF;
	private CONTA CLIENTECONTA;

	public String getNOME() {
		return NOME;
	}

	public void setNOME(String NOME) {
		this.NOME = NOME;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int CPF) {
		this.CPF = CPF;
	}

	public String getENDERECO() {
		return ENDERECO;
	}

	public void setENDERECO(String ENDERECO) {
		this.ENDERECO = ENDERECO;
	}

	public CONTA getCLIENTECONTA() {
		return CLIENTECONTA;
	}

	public void setCLIENTECONTA(CONTA CLIENTECONTA) {
		this.CLIENTECONTA = CLIENTECONTA;
	}
}