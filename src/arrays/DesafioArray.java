package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas serão inseridas?");
		int i = entrada.nextInt();
		double[] notas = new double[i];
	
		for(int j = 0; j <notas.length ; j++) {
			System.out.println("Insira a nota:");
			notas[j] = entrada.nextDouble();
		}
		int j = 0;
		int q = 1;
		for(@SuppressWarnings("unused") double nota: notas) {
			System.out.println("Nota" + q  + " : " + notas[j]);
			j++;
			q++;
		}
		System.out.println("Total de Notas " + -notas.length);
		
		double total = 0;
		double media = 0;
		
		for(double nota: notas) {
			total += nota;
		}
		
		media = total / notas.length;
		System.out.printf("média = %.2f", media);
		entrada.close();
	}
}
