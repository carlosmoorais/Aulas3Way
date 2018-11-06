package ExercicioColecoes;

import java.util.ArrayList;
import java.util.List;

public class ColecaoBichoFelino {
	
	public void addAnimal(List<? extends Felino> animais) {
		for (Felino bicho: animais) {
			bicho.fazerRuido();
		}
	}
	public static void main(String[] args) {
		List<Felino> animais = new ArrayList<Felino>();
		animais.add(new Leao());
		animais.add(new Gato());
		animais.add(new Leao());
		animais.add(new Gato());
		
		ColecaoBichoFelino colecao = new ColecaoBichoFelino();
		colecao.addAnimal(animais);
		
		List<Leao> leoes = new ArrayList<Leao>();
		leoes.add(new Leao());
		leoes.add(new Leao());
		
		ColecaoBichoFelino colecaoLeoes = new ColecaoBichoFelino();
		colecaoLeoes.addAnimal(leoes);
		
		List<Gato> gatos = new ArrayList<Gato>();
		gatos.add(new Gato());
		gatos.add(new Gato());
		
		ColecaoBichoFelino colecaoGatos = new ColecaoBichoFelino();
		colecaoGatos.addAnimal(gatos);
	}
}
