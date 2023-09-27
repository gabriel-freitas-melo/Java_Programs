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
		listaAprovados.add("Juliana");
		
		//Set não garante a ordem de inserção mas o TreeSet sim
		for (String nome : listaAprovados) {
			System.out.println(nome);
		}
		System.out.println("------------");
		TreeSet<String> listaReprovados = new TreeSet<>();
		//Ordem alfabética
		listaReprovados.add("Kelvin");
		listaReprovados.add("Melissa");
		listaReprovados.add("Joaquim");
		listaReprovados.add("Abdiel");
		
		for (String nome : listaReprovados) {
			System.out.println(nome);
		}
		
		System.out.println("------------");
		Set<Double> notasAprovados = new HashSet<>();
		notasAprovados.add(9.8);
		notasAprovados.add(9.5);
		notasAprovados.add(9.1);
		notasAprovados.add(8.9);
		notasAprovados.add(8.2);
		
		for(double nota: notasAprovados) {
			System.out.println(nota);
		}
	}
}
