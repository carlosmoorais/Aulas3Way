package Set_E_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColectionsSort {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		
		lista.add("Romulo");
		lista.add("Cassio");
		lista.add("Carlos");
		lista.add("Luan");
		
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
	}

}
