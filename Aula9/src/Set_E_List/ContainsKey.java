package Set_E_List;

import java.util.HashMap;
import java.util.Map;

public class ContainsKey {

	public static void main(String[] args) {
		Map<String, String> example = new HashMap<String, String>();

		example.put("K1", "V1");
		example.put("K2", "V2");
		example.put("K3", "V3");
		example.put("K4", "V4");
		example.put("K5", "V5---");
		example.put("K5", "V5ss");

		System.out.println(example.get("K5"));

		String keyT = "K1";

		if (example.containsKey(keyT)) {
			System.out.println("Valor da Chave " + keyT + " = " + example.get(keyT));
		} else {
			System.err.println("Chave não existe");
		}

		for (String i : example.keySet()) {
			System.out.print(i);
			System.out.print("--" + example.get(i) + "\n");
		}
	}
}
