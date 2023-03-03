
package controle;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.printf("Digite o valor do dia: ");
	int i = entrada.nextInt();
	do {
		switch(i) {
	
		case 1:
			System.out.println("Hoje é domingo");
			break;
		case 2:
			System.out.println("Hoje é segunda");
			break;
		case 3:
			System.out.println("Hoje é terça");
			break;
		case 4:
			System.out.println("Hoje é quarta");
			break;
		case 5:
			System.out.println("Hoje é quinta");
			break;
		case 6:
			System.out.println("Hoje é sexta");
			break;
		case 7:
			System.out.println("Hoje é sábado");
			break;
		default:
			System.out.println("Número errado");
		}
	//Você deve ao final do DO pedir para o usuário inserir o valor novamente
	System.out.print("busque um novo valor: ");
	i = entrada.nextInt();
	}while(i != -1);
	System.out.println("Fim do programa");
	entrada.close();
	}
}
