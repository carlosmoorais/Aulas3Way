package Veiculo;

public class TestaVeiculos {
	public static void teste(Veiculo veiculo) {
		veiculo.mover();
	}
		
	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo("Preto", 2015, "KKA - 0321");
		Carro bmw = new Carro("Branco", 2017, "OGK - 9328", "BMW");
		Aviao boing = new Aviao("Azul", 2014, "OSPJSA8231", "BOING");
		Barco navio = new Barco("Marrom", 1998, "SSP321", "Cruzeiro");
		/*
		// Herança e extends
		veiculo.mover();
		bmw.mover();
		boing.mover();
		navio.mover();
		//Polimorfismo
		Veiculo veiculo = new Veiculo("Preto", 2015, "KKA - 0321");
		veiculo.mover();
		veiculo = new Aviao("Azul", 2014, "OSPJSA8231", "BOING");
		veiculo.mover();
		veiculo = new Barco("Marrom", 1998, "SSP321", "Cruzeiro");
		veiculo.mover();
		*/
		// Polimorfismo
		teste(veiculo);
		teste(bmw);
		teste(boing);
		teste(navio);
	}

}
