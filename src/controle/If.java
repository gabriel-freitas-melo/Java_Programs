package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a sua idade");
		int idade = entrada.nextInt();
		if (idade >= 18) {
			System.out.println("Você pode consumir álcool");
		}
		entrada.close();
	}
}
