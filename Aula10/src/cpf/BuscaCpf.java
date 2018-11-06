package cpf;

import java.util.HashMap;
import java.util.Scanner;

public class BuscaCpf {

	public static void main(String[] args) {
		HashMap<Long, String> hashMap = new HashMap<>();
		hashMap.put(11111111111L, "Carlos");
		hashMap.put(22222222222L, "Maria");
		hashMap.put(33333333333L, "João");
		hashMap.put(44444444444L, "Ana");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira o CPF a pesquisar: ");
		Long cpf = scanner.nextLong();

		String string = hashMap.get(cpf);

		System.out.println(string);
	}
}
