package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String senha = "";
		do {
			System.out.print("Digite a sua senha:");
			senha = entrada.next();
		}while(!senha.equals("123456"));
		System.out.println("Entrando...");

		entrada.close();
		
	}
}
