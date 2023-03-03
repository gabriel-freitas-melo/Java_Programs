package exerciciosFinaisControle;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o ano atual: ");
		int anoAtual = entrada.nextInt();
		if (anoAtual % 4 == 0) {
			System.out.println("Ano é bissexto");
		}else {
			System.out.println("Ano não é bissexto");
		}

		entrada.close();
	}
}
