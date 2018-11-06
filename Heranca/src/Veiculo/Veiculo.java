package Veiculo;

public class Veiculo {
	private String cor;
	private int ano;
	private String identificacao;

	public Veiculo(String cor, int ano, String identificacao) {
		this.cor = cor;
		this.ano = ano;
		this.identificacao = identificacao;
		System.out.println("Criando objeto Veiculo");
	}	

	public void mover() {
		System.out.println("Veiculo se movendo");
	}
}
