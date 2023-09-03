package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		//Criando um array
		double[] notasAlunoA = new double [3];
		//classe Arrays manipula o array e mostra em um formato String
		//preencheu o array manualmente
		notasAlunoA[0] = 9.1;
		notasAlunoA[1] = 8.3;
		notasAlunoA[2] = 9.2;
		System.out.println(Arrays.toString(notasAlunoA));
		double total = 0;
		//Percorrendo um array
		for(int i = 0 ; i < notasAlunoA.length ; i++) {
			total += notasAlunoA[i];
		}
		double mediaFinal = total/notasAlunoA.length;
		System.out.printf("média = %.2f", mediaFinal );
		System.out.println();
		total = 0;
		mediaFinal = 0;
		double[] notasAlunoB = {8.5 , 9.6 , 7.2};
		for (int i = 0; i < notasAlunoB.length; i++) {
			total += notasAlunoB[i];
		}
		mediaFinal = total / notasAlunoB.length;
		System.out.println(Arrays.toString(notasAlunoB));
		System.out.printf("média = %.2f", mediaFinal);
		
		
	}

}
