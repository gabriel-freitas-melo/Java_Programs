package exerciciosFinaisControle;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {	
	Scanner entrada = new Scanner(System.in);
	System.out.println("insira uma palavra: ");
	String palavra = entrada.nextLine();
	char letras[] = palavra.toCharArray();
	int tamanho = palavra.length();
	for (int i = 0 ; i < tamanho ; i++  ) {
		System.out.println(letras[i]);
		 
	}
	
	entrada.close();
	}
	
}
