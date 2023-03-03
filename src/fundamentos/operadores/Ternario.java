package fundamentos.operadores;

import java.util.Scanner;

public class Ternario {
	public static void main(String[] args) {
		Scanner entrada =  new Scanner(System.in);
		System.out.println("Digite a nota do aluno");
		double nota = entrada.nextDouble();
		String resultadoParcial = nota>=5.0 ? "em recuperação" : "reprovado";
		String resultadoFinal = nota>=7.0 ? "aprovado" : resultadoParcial;
		System.out.println("O aluno está " + resultadoFinal);
		
		//Operdor ternário pode subtituir resultdos booleanos
		//Deve inicializar o resultado
		boolean dia = true;
		String resultadoHorario = dia == true ? "Está de dia" : "Está de noite";
		System.out.println(resultadoHorario);
		entrada.close();
	}

}
