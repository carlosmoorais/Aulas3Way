package Veiculo;

public class Carro extends Veiculo {
	private String modelo;

	public Carro(String cor, int ano, String placaIdentificacao, String modelo) {
		super(cor, ano, placaIdentificacao);
		this.modelo = modelo;

		System.out.println("Criando objeto Carro");
	}

	@Override
	public void mover() {
		System.out.println("Correr");
	}
}
