package oo.composicao;

public class Item {
	//atributos
	String nome;
	int quantidade;
	double preco;
	Compra compra;
	//construtor
	Item(String nome , int quantidade , double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
}
