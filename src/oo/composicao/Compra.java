 package oo.composicao;

import java.util.ArrayList;

public class Compra {
	String nomeCliente;
	Item item;
	ArrayList<Item> itens = new ArrayList<>();//lista homogênea formada apenas por itens
	//Bidirecionamento e adição de itens a compra
	void adicionarItem(Item item) {// Adiciona o item a lista itens
		this.itens.add(item);
		item.compra = this;//A compra associada ao item é a própria classe atual
	}
	void adicionarItem(String nome , int quantidade , double preco) {
		this.adicionarItem(new Item(nome ,quantidade ,preco));
	//Instancia o item no processo de adicionar item
	}
	
	
	//Cálculo do valor final
	double getValorTotal() {
		double total = 0;
		int quantidadeTotal = 0;
		
		for (Item item : itens) {
			total += item.quantidade*item.preco;
			quantidadeTotal += item.quantidade;
			if (quantidadeTotal > 20) { //desconto de 10% se passar de 20 itens comprados
				total = total*0.9;
			}
		}
		
		return total;
	}

}
