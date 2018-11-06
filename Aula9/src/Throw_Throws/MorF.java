package Throw_Throws;

import java.util.Scanner;

public class MorF {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sexo;
		
		sexo = scanner.next();
		
		try {
			System.out.println(masculinoOrFeminino(sexo));
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
	public static String masculinoOrFeminino(String sexo) throws SexoInvalidoException{
		if(sexo.equals("M")) {
			return "M - Masculino";
		}else if(sexo.equals("F")){
			return "F - Feminino";
		}else {
			throw new SexoInvalidoException();
		}
	}

}
