package exerciciosFinaisControle;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		int k = 57;
		int tentativas = 10;
		int num = 0;
		Scanner entrada = new Scanner(System.in);
		for (int i = 0 ; i < 10 ; i++) {
			System.out.printf("Informe um número: \n");
			num = entrada.nextInt();
			while(num < 0 || num > 100) {
				System.out.println("Número deve estar entre 0 e 100");
				System.out.printf("Informe um número: \n");
				num = entrada.nextInt();
			}
			
			tentativas--;
			if (num < k) {
				System.out.printf("O número %d é menor que o número desejado\n", num);
				System.out.printf("Você tem %d tentativas\n", tentativas);
			}else if(num > k) {
				System.out.printf("O número %d é maior que o número desejado\n", num);
				System.out.printf("Você tem %d tentativas\n", tentativas);
			}else {
				System.out.println("Você acertou!");
				System.out.println("O número é 57");
				break;
			}
				
		}if (num != 57) {	
		System.out.println("Suas tentativas acabaram, tente uma proxima vez");
		}
		entrada.close();
	}
}
