package com.web.mapeamento;

import java.util.ArrayList;

public class AGENCIA {
	private String AGENCIA;
	private BANCO banco;
	private ArrayList<CONTA> CONTASAGENCIA;

	public BANCO getBanco() {
		return banco;
	}

	public void setBanco(BANCO banco) {
		this.banco = banco;
	}

	public ArrayList<CONTA> getCONTASAGENCIA() {
		return CONTASAGENCIA;
	}

	public void setCONTASAGENCIA(ArrayList<CONTA> CONTASAGENCIA) {
		this.CONTASAGENCIA = CONTASAGENCIA;
	}

	public String getAGENCIA() {
		return AGENCIA;
	}

	public void setAGENCIA(String AGENCIA) {
		this.AGENCIA = AGENCIA;
	}
}
