package LeituraEscrita;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CodigoParaLeitura {

	public static void main(String[] args) {
		try {
			File arquivo = new File("C:\\teste.txt");

			FileReader fr = new FileReader(arquivo);

			BufferedReader br = new BufferedReader(fr);

			while (br.ready()) {
				String linha = br.readLine();
				System.out.println(linha);
			}
			br.close();

			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Arquivo nao existe");
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Erro ao ler o arquivo");
		}
	}
}
