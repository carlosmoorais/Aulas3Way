package Veiculo;

public class Aviao extends Veiculo {
	private String modelo;

	public Aviao(String cor, int ano, String identificacao, String modelo) {
		super(cor, ano, identificacao);
		this.modelo = modelo;
		System.out.println("Criando objeto Aviao");
	}

	@Override
	public void mover() {
		System.out.println("Voar!");
	}
}
