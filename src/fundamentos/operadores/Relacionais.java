package fundamentos.operadores;

import java.util.Scanner;

public class Relacionais {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a nota do aluno:\n");
		double notaAluno = entrada.nextDouble();
		System.out.println("O aluno teve bom compartamento?\n");
		boolean comportamento = entrada.nextBoolean();
		boolean aprovado = (notaAluno > 7.0 && comportamento);
		System.out.println(aprovado);
		entrada.close();
	}

}
