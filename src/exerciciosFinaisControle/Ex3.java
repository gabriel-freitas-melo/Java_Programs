package exerciciosFinaisControle;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {	
	Scanner entrada = new Scanner(System.in);
	System.out.print("Informe a primeira nota: ");
	double nota1 = entrada.nextDouble();
	System.out.print("Informe a segunda nota: ");
	double nota2 = entrada.nextDouble();
	double media = (nota1 + nota2)/2;
	if(media >= 7) {
		System.out.println("Aluno aprovado");
		System.out.println("Média = " + media );
	}else if (media >= 4 && media <7) {
		System.out.println("Aluno de recuperação");
		System.out.println("Média = " + media );
	}else if (media >= 0 && media <4) {
		System.out.println("Aluno reprovado");
		System.out.println("Média = " + media );
	}else {
		System.out.println("Média inválida");
		/*Essa condição não é muito efetiva*/
	}
	entrada.close();
	}
}
