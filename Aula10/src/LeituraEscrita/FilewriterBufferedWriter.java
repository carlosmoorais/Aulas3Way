package LeituraEscrita;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilewriterBufferedWriter {

	public static void main(String[] args) {
		try {
			File arquivo = new File("C:\\teste.txt");
			
			FileWriter fw = new FileWriter(arquivo);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Texto a ser escrito no txt");
			bw.newLine();
			bw.write("Quebra de linha");
			
			bw.close();
			
			fw.close();		

		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("Erro de Leitura");
		}
	}

}
