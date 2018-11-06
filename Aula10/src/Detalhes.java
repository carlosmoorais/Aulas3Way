import java.util.ArrayList;
import java.util.HashMap;

public class Detalhes {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Stack");
		lista.add("Overflow");
		
		System.out.println(lista);
		
		String strl = lista.get(0);
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Stack");
		hashMap.put(5, "Overflow");
		
		String str = hashMap.get(5);
		
		System.out.println(str);
	}

}
