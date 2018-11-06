package LeituraEscrita;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Nio2 {

	public static void main(String[] args) {
		String fileStr = "arquivo.txt";

		Path path = leitura(fileStr);

		escrita(path);
	}

	private static void escrita(Path path) {
		try {
			List<String> inLines = Files.readAllLines(path, Charset.forName("UTF-8"));

			for (String linha : inLines) {
				System.out.println(linha);

				for (int i = 0; i < linha.length(); i++) {
					char charOut = linha.charAt(i);
					System.out.println((i + 1) + " - " + charOut);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Path leitura(String fileStr) {
		Path path = Paths.get(fileStr);

		List<String> linhas = new ArrayList<String>();
		linhas.add("SPAOKPSAOKPSAOK");
		linhas.add("aspojkposajpojs");

		try {
			Files.write(path, linhas, Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}
}
