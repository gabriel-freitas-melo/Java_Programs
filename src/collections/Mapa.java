package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {//Estrutura chave-valor
	
	public static void main(String[] args) {
		Map<Integer, String> listaChamada = new HashMap<>(); 
		listaChamada.put(1, "Gabriel");
		listaChamada.put(2, "Sabrina");
		listaChamada.put(3, "Rafael");
		listaChamada.put(4, "Miguel");
		listaChamada.put(1, "Wanessa");// Inseriu Wnessa no lugar de Gabriel
		System.out.println(listaChamada);
		System.out.println(listaChamada.keySet());
		System.out.println(listaChamada.values());
		System.out.println(listaChamada.containsKey(5));
		//Três formas de percorrer um Map, pela chave, pelo valor ou pelo elemento como um todo
		for (int chave : listaChamada.keySet()) {
			System.out.println(chave);
		}
		for (String valor : listaChamada.values()) {
			System.out.println(valor);
		}
		for (Entry<Integer, String> elemento: listaChamada.entrySet()) {
			System.out.println(elemento);
		}
	}	
	
}
