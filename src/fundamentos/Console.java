package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Meu nome é " +nome);
		System.out.print("\nDigite a sua idade: ");
		int idade = entrada.nextInt();
		System.out.println("Minha idade é " + idade);
		entrada.close();
	}
}
