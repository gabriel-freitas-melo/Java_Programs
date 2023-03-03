package exerciciosFinaisControle;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digie um número correto: ");
		int num = entrada.nextInt();
		if((num % 2 == 0) &&(num >=0 && num<=10)) {
			System.out.printf("O número %d está correto", num);
		}else {
		
			System.out.println("o número não está correto");
		}
			entrada.close();
	}
}
