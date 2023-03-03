package exerciciosFinaisControle;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira 2 numeros positivos, caso um deles seja negativo o sistema fecha!");
		System.out.print("Primeiro número: ");
		double num1 = entrada.nextDouble();
		System.out.print("Segundo numero: ");
		double num2 = entrada.nextDouble();
		while(num1 > 0 && num2 > 0) {
			double soma = num1 + num2;
			System.out.printf("Soma = %.2f\n", soma);
			System.out.print("Primeiro número: ");
			num1 = entrada.nextDouble();
			System.out.print("Segundo numero: ");
			num2 = entrada.nextDouble();
			
		}
		System.out.println("Fim do programa");
		

		entrada.close();
	}
}
