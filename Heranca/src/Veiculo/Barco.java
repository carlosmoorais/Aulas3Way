package Veiculo;

public class Barco extends Veiculo{
	private String tipo;
	
	public Barco(String cor, int ano, String identificacao, String tipo) {
		super(cor, ano, identificacao);
		this.tipo = tipo;
		System.out.println("Criando objeto Barco");
	}
	
	@Override
	public void mover() {
		System.out.println("Navegar!");
	}
}
