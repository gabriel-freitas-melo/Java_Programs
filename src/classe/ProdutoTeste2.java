package classe;

public class ProdutoTeste2 {
	public static void main(String[] args) {
		//Instaciei um objeto passando um id
		Produto p1 = new Produto("1");
		//Usei um método c/ parâmetros da classe produto
		double resultadoFinal = p1.precoComDesconto(500, 10);
		System.out.println("id: " + p1.id + "\nresultado = " + resultadoFinal);
		
		//Instanciei um novo objeto passando um id
		Produto p2 = new Produto("2");
		//Preenchi os dados desse objeto
		p2.desconto = 20;
		p2.preco = 1000;
		//Usei um método s/ parâmetros da classe produto
		double resultadoFinal2 = p2.precoComDesconto();
		System.out.println("id: "+ p2.id + "\nresultado = " + resultadoFinal2);
	
		
	}
}
