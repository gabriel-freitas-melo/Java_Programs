package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue <String> fila = new LinkedList<>();
		
		fila.add("Gabriel");//gera erro em capacity-restricted queue
		fila.offer("Natalia");//retorna true r false capacity-restricted queue
		fila.add("Lucas");
		fila.add("Larissa");
		System.out.println(fila);
		for (String pessoas : fila) {
			System.out.println(pessoas);
		}
		System.out.println(fila);
		System.out.println("Sai " + fila.poll());
		System.out.println(fila);
		}
	}

