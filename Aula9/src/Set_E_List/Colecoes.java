package Set_E_List;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Colecoes {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add(new String("Carlos"));
		set.add(new String("Davi"));
		set.add(new String("Mayk"));
		
		System.out.println(set + ", size - "+ set.size());
		set.remove("Carlos");
		System.out.println(set + ", size - "+ set.size());

		
		List<Integer> listInt = new ArrayList<>();
		
		listInt.add(new Integer(3289));
		listInt.add(new Integer(32944));
		listInt.add(new Integer(34309));
		
		System.out.println(listInt + ", size - "+ listInt.size());

		List<String> list = new ArrayList<>();
		
		list.add(new String("Maria"));
		list.add(new String("Marta"));
		list.add(new String("Ana"));
		
		System.out.println(list + ", size - "+ list.size());
		System.out.println("A lista contem Ana? "+list.contains("Ana"));
		System.out.println("A lista contem Carla? "+list.contains("Carla"));
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Carlos");
		map.put(2, "Daniel");
		map.put(3, "Yago");
		
		System.out.println(map.get(3));

		
	}
	
	
	
}
