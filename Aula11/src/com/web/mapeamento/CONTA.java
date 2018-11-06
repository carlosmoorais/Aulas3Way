package com.web.mapeamento;

public class CONTA {
	private CLIENTES TITULAR;
	private int NUMERO;
	private int IDENTIFICADOR;

	public CLIENTES getTITULAR() {
		return TITULAR;
	}

	public void setTITULAR(CLIENTES TITULAR) {
		this.TITULAR = TITULAR;
	}

	public int getIDENTIFICADOR() {
		return IDENTIFICADOR;
	}

	public void setIDENTIFICADOR(int IDENTIFICADOR) {
		this.IDENTIFICADOR = IDENTIFICADOR;
	}

	public int getNUMERO() {
		return NUMERO;
	}

	public void setNUMERO(int NUMERO) {
		this.NUMERO = NUMERO;
	}
}
