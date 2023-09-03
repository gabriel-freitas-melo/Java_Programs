package classeFinal;

import java.util.Scanner;

public class Retorno {
	String nome;
	String cpf;
	static String resultadoParcial;
	static String resultadoFinal;
	int idade;
	static double salarioFinal;
	double salario;
	static double credito;
	
	Retorno (String cpf) {
		System.out.println("CPF: " + cpf + " cadastrado");
		
	}
	String liberacaoCredito(double salario) {
		salario = this.salario;
		resultadoParcial = salario >=10000? "Crédito Aprovado" : "Crédito não Aprovado";
		return resultadoParcial;
		//EXISTE UMA CONDIÇÃO PARA liberação do crédito
	}
	String cadastro (String nome , int idade , double salario)  {
		nome = this.nome;
		String sidade = Integer.toString(idade);
		String ssalario = Double.toString(salario);
		System.out.println("CADASTRO:");
		return nome + ", idade: " + sidade + ", salario: R$"+ ssalario ;
		//Retornando os valores do cadastro como String
	}
	static void creditoDesejado(double salario) {
		salarioFinal = salario;
		if (resultadoParcial.equals("Crédito Aprovado")){
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite o crédito desejado: ");
			credito = entrada.nextDouble();
			entrada.close();
			if (credito > salarioFinal) {
				System.out.println("Crédito bloqueado");
			}else {
				resultadoFinal = Double.toString(credito);
				System.out.println("Você recebeu R$"+resultadoFinal);
				
			}
		}
		if(resultadoParcial.equals("Crédito não Aprovado")) {
			System.out.println("saindo...");
		}
	
	}
	
}
