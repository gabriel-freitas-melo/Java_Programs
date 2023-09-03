package classe;

public class DesafioProdutoTeste {
	public static void main(String[] args) {
		DesafioProduto dp1 = new DesafioProduto("Laptop" , 5000.00);
		System.out.println(dp1.nome);
		System.out.println(dp1.calculoPreco());//Desconto padrão
		System.out.println();
		DesafioProduto dp2 = new DesafioProduto("Headset", 600.00);
		System.out.println(dp2.nome);
		System.out.println(dp2.calculaPreco(0.30));//Desconto Especial
	}
}
