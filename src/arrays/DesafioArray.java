package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas serão inseridas?");
		int i = entrada.nextInt();
		double[] notas = new double[i];
		//Inserção de forma Padrão
		for(int j = 0; j <notas.length ; j++) {
			System.out.println("Insira a nota:");
			notas[j] = entrada.nextDouble();
		}
		System.out.println(Arrays.toString(notas));
		double total = 0;
		double media = 0;
		//inserção de forma especial
		for(double nota: notas) {
			total += nota;
		}
		media = total / notas.length;
		System.out.printf("média = %.2f", media);
		entrada.close();
	}
}
