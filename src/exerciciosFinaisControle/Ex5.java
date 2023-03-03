package exerciciosFinaisControle;

import java.util.Scanner;

public class Ex5 {
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
		switch (contadorDivisor) {
		case 0:
			System.out.printf("O número %d é primo", numero);
			break;
		default:
			System.out.printf("O número %d não é primo", numero);
		}
		entrada.close();
	}
}

