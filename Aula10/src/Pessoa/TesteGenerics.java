package Pessoa;

import java.util.ArrayList;
import java.util.List;

public class TesteGenerics {
	
	public void addPessoa(List<Pessoa> pessoas) {
		for(Pessoa pessoa : pessoas) {
			pessoa.pagarImposto();
		}
	}
	
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa());
		pessoas.add(new PessoaJuridica());
		pessoas.add(new PessoaFisica());
		
		TesteGenerics colecaoPessoas = new TesteGenerics();
		colecaoPessoas.addPessoa(pessoas);
	}

}
