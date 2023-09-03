package oo.composicao;

public class CompraTeste {
	
	public static void main(String[] args) {
		Compra compra1 = new Compra();
		//adicionando/instanciando elementos a lista itens
		compra1.adicionarItem("Açucar", 4 , 5.99);
		compra1.adicionarItem("Arroz", 9 , 8.59);
		compra1.adicionarItem("Óleo", 8 , 3.89);
		//CHAMEI O MÉTODO DE CALCULAR VALOR FINAL DA COMPRA
		System.out.printf("Valor Final = R$ %.2f" ,compra1.getValorTotal());
	}

}
