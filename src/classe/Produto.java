package classe;

public class Produto {
	//Variáveis
	String id;
	String nome; 
	String marca;
	double preco;
	double desconto;
	// Explicitando os construtores
	//Esse produto possui parâmetros
	Produto(String idInicial){
		id = idInicial;
		
	}
	//Métodos
	//Primeiro método deve passar os parâmentros
	double precoComDesconto(double preco , double desconto) {
		double resultado = preco - (preco * (desconto/100));
		System.out.println("O resltado é:");
		return resultado;
	}
	//segundo método não precisa passar os parâmetros
	double precoComDesconto() {
		return preco - (preco * (desconto/100));
	}
	
}
