package arrays;

import java.util.Arrays;

import java.util.Scanner;

public class InserindoValoresArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] idade = new int[4];
		for (int i = 0 ; i < idade.length ; i++) {
			System.out.println("Insira uma idade: ");
			idade[i] = entrada.nextInt();
			
			
		}
		int total = 0;
		double media = 0;
		System.out.println(Arrays.toString(idade));
		for(int i = 0 ; i < idade.length ; i++) {
			total += idade[i];
			
		}
		media = total / idade.length;
		System.out.printf("média = %.2f", media);
		entrada.close();
	}
}
