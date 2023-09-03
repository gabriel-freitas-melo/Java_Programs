package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeChamada {

	public static void main(String[] args) {
		List<Alunos> lista = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		//Gerando a lista
		System.out.println("Quantos alunos há na lista?");
		int numTotal = entrada.nextInt();
		for(int i = 0; i < numTotal; i++) {
			System.out.println("Digite o nome do aluno");
			String nomeAluno = entrada.next();
			lista.add(new Alunos(nomeAluno));
		}
		//Mostrando a lista
		for (Alunos alunos : lista) {
			System.out.println(alunos.nome);
		}
		for (int i = 0; i<lista.size() ; i++) {
			System.out.println("Faça a chamda: ");
			String nomeChamada = entrada.next();
			boolean chamada = nomeChamada.equals(lista.get(i).nome);
			if (chamada == true) {
				System.out.println("Presnte");
			}else {
				System.out.println("Ausente");
			}
		}
		for (int i = 0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
			
		
		entrada.close();
	}
	
	
}
