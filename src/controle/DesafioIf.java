package controle;

import java.util.Scanner;

public class DesafioIf {
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("---BEM-VINDO AO QUADRO DE NOTAS---\n");
		System.out.print("Informe a nota do aluno: ");
		double nota = entrada.nextDouble();
		if (nota >=7.0 && nota<=10.0) {
			System.out.println("Aluno aprovado");
		}
		if (nota >= 6.0 && nota <= 7.0) {
			System.out.println("Aluno de recuperação");
		}
		if (nota >= 0.0 && nota < 6.0) {
			System.out.println("Aluno reprovado");
		}
		if (nota < 0.0 || nota > 10.0) {
			System.out.println("NOTA INVÁLIDA");
		}
		entrada.close();
	}
}
