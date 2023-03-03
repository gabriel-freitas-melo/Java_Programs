package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		//Instanciei um objeto da classe produto
		Produto p1 = new Produto("1");
		p1.nome = "Laptop";
		p1.marca = "Lenovo";
		p1.preco = 5500.00;
		p1.desconto = 0.1; //10% de desconto
		
		//Instanciei um objeto da classe produto
		Produto p2 = new Produto("2");
		p2.nome = "HeadSet";
		p2.marca = "Corsair";
		p2.preco = 699.00;
		p2.desconto = 0.17; //17% de desconto
		
		//Cálculo de preços do carrinho
		double valorTotal = p1.preco + p2.preco;
		double valorTotalComDesconto = (p1.preco * (1-p1.desconto)) + (p2.preco * (1 - p2.desconto));
		double economizou = valorTotal - valorTotalComDesconto;
		System.out.println("Produtos comprados:" + p1.nome + " " +p2.nome);
		System.out.printf("Valor total sem desconto = %.2f\n", valorTotal);
		System.out.printf("Valor total com desconto = %.2f\n", valorTotalComDesconto);
		System.out.printf("Valor economizado = %.2f", economizou);
	}
}
