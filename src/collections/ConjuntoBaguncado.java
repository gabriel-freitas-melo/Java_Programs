package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//instancia um conjunto Set
		HashSet conjunto = new HashSet();
		//adicionar elementos aleatórios nele
		conjunto.add(1.25); //Faz uma conversão double -> Double (classe)
		conjunto.add(19); //int -> Integer
		conjunto.add(true);
		conjunto.add("Bom Dia");
		conjunto.add('g');
		
		System.out.println("O tamanho do conjunto é " + conjunto.size());
	
		conjunto.add("Bom Dia");
		
		System.out.println("O novo tamanho continua " + conjunto.size());
		
		//Processo de remoção de um elemento do conjunto
		System.out.println(conjunto.remove("Bom dia"));
		System.out.println(conjunto.size());
		System.out.println(conjunto.remove("Bom Dia"));
		System.out.println(conjunto.size());
		
		//Verificar se certo elemento está no conjunto
		System.out.println(conjunto.contains(1.25));
		//mostrando o resultado do conjunto bagunçado
		System.out.println(conjunto);
		
		//Interface
		Set numeros = new HashSet();
		numeros.add(19);
		numeros.add(20);
		numeros.add(21);	
		System.out.println(numeros);
	
		//União de conjuntos
		conjunto.addAll(numeros);
		System.out.println(conjunto);
		
		//Esvaziando a collection
		conjunto.clear();
		System.out.println(conjunto);
		
		
		
		
	}
	

}
