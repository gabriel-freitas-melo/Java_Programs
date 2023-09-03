package classe;

public class DesafioProduto {
	String nome;
	double preco;
	double descontoEspecial;//O vendedor deve informar o desconto especial
	static double desconto = 0.25;
	
	DesafioProduto(String nomeFinal , double precoFinal){
		nome = nomeFinal;
		preco = precoFinal;
	}
	double calculoPreco() {
		return preco*(1-desconto);
	}
	double calculaPreco(double descontoEspecial) {
		return preco*(1-descontoEspecial);
	}
}
