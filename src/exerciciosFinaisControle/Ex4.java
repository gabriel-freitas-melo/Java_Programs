package exerciciosFinaisControle;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número inteiro qualquer: ");
		int numero = entrada.nextInt();
		int contadorDivisor = 0;
		for (int i = 2; i < numero ; i++) {
			/*Faz o rastreamento de 2 até (numero-1). 2 1 e 0 são primos*/
			if(numero % i == 0) {
				contadorDivisor++;
			}
		}
		if (contadorDivisor == 0) {
			System.out.printf("o numero %d é primo", numero);
		}else {
			System.out.printf("o numero %d não é primo", numero);
		}
		entrada.close();
	}
}
