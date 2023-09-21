package Revisao;

public class TopicosGerias {
	public static void main(String[] args) {
		System.out.println("Aqui estão alguns tópicos de revisão");
		Computador c1 = new Computador("Dell");
		c1.nome = "Args-26";
		c1.codigo = "5598221-56";
		System.out.println("Modelo: " + c1.nome + " Código: " + c1.codigo);
		System.out.println("Valor Final: R$" + c1.precoComDesconto(5500.00, 8.0));
				
	}

}
