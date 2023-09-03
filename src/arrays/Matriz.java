package arrays;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número de alunos:");
		int nAlunos = entrada.nextInt();
		
		System.out.println("Digite a quantidade de notas dos alunos:");
		int nNotas = entrada.nextInt();
		double totalAluno = 0;
		double mediaAluno = 0;
		double total = 0;
		double media = 0;
		double[][] notasAlunos = new double [nAlunos][nNotas];
		for(int i = 0; i < notasAlunos.length; i++) {
			for(int j = 0; j < notasAlunos[i].length; j++) {
				System.out.printf("Insira a nota do aluno %d : ", i+1);
				notasAlunos[i][j] = entrada.nextDouble();
				total += notasAlunos[i][j];
			}
		}
		System.out.println();
		for(int i = 0; i < notasAlunos.length; i++) {
			System.out.printf("Aluno %d: \n", i+1);
			for(int j = 0; j < notasAlunos[i].length; j++) {
				System.out.printf("%.2f\n", notasAlunos[i][j]);
				totalAluno += notasAlunos[i][j];
			}
			mediaAluno = totalAluno/nNotas;
			System.out.printf("Média do aluno %d é : %.2f \n", i+1 , mediaAluno);
			System.out.println("------------");
			totalAluno = 0;
		}
		media = total/(nAlunos * nNotas);
		System.out.printf("média de notas de todos os alunos = %.2f", media);
		entrada.close();
	}
	
}
