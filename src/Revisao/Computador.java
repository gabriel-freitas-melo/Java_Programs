package Revisao;

import java.util.Date;

public class Computador {
	String nome;
	String marca;
	String codigo;
	double preco;
	Date dataValidade;
	
	Computador (String marca){
		marca = this.marca;
	}
	
	double precoComDesconto(double preco , double desconto) {
		return preco*(100 - desconto)/100;
	}
	
}
