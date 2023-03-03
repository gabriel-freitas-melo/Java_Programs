package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		//Nesse desafio deve usar apenas o while
		Scanner entrada = new Scanner(System.in);
		System.out.println("BOLETIM");
		double somaNota = 0.0;
		double media = 0.0;
		int quantidade = 0;
		double nota = 0;
		System.out.print("Digite o valor da nota ou -1 p/ sair:");
		nota = entrada.nextDouble();
		/* verificação inicial*/
		while ((nota < 0 || nota> 10) && nota != -1) {
				System.out.println("NOTA INVÁLIDA, caso queira sair digite -1");
				System.out.println("Digite novamente: ");
				nota = entrada.nextDouble();
		}
		/*depois de ter digitado uma nota certa e o usuário digite
		 * uma nota errada em sequência, o código irá gerar um alerta*/ 
		while ((nota >=0 && nota<=10)) {
		somaNota += nota;
		quantidade++;
		System.out.print("Digite o valor da nota ou -1 p/sair:");
		nota = entrada.nextDouble();
			while ((nota < 0 || nota> 10) && nota != -1) {
				System.out.println("NOTA INVÁLIDA, caso queira sair digite -1");
				System.out.println("Digite novamente: ");
				nota = entrada.nextDouble();
			}
		}
		media = somaNota/quantidade;
		System.out.println("O valor da média = " + media);
		entrada.close();
	}
}
