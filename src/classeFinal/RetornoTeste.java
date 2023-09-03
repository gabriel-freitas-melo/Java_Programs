package classeFinal;

import java.util.Scanner;

public class RetornoTeste {
	public static void main(String[] args) {
		//Ao digitar um cpf o sistema já faz o cadastro(instancia) uma nova pessoa
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu cpf: ");
		String c = entrada.next();
		Retorno pessoa1 = new Retorno(c);
		
		System.out.println("Digite seu nome: ");
		pessoa1.nome = entrada.next();
		System.out.println("Digite sua idade: ");
		pessoa1.idade = entrada.nextInt();
		System.out.println("Digite seu salário: ");
		pessoa1.salario = entrada.nextDouble();
		
		System.out.println(pessoa1.cadastro(pessoa1.nome, pessoa1.idade, pessoa1.salario));
		
		System.out.println(pessoa1.liberacaoCredito(pessoa1.salario));

		Retorno.creditoDesejado(pessoa1.salario);
		entrada.close();
	}
	


}
