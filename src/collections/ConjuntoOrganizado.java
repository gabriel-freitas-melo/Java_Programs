package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoOrganizado {
	
	public static void main(String[] args) {
		
		Set<String> listaAprovados = new HashSet<>();
		listaAprovados.add("Gabriel");
		listaAprovados.add("Matheus");
		listaAprovados.add("Pedro");
		listaAprovados.add("Jefferson");
		
		for (String nome : listaAprovados) {
			System.out.println(nome);
		}
		System.out.println("------------");
		TreeSet<String> listaReprovados = new TreeSet<>();
		listaReprovados.add("Kelvin");
		listaReprovados.add("Melissa");
		listaReprovados.add("Joaquim");
		listaReprovados.add("Abdiel");
		
		for (String nome : listaReprovados) {
			System.out.println(nome);
		}
	}
}
