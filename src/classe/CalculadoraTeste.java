package classe;

public class CalculadoraTeste {
	public static void main(String[] args) {
		Calculadora c1 = new Calculadora();
		System.out.println(c1.soma(6, 4));
		System.out.println(c1.subtracao(6, 4));
		System.out.println(c1.multiplicacao(6, 4));
		System.out.println(c1.divisao(6, 4));
		System.out.println(c1.restoDivisao(6, 4));
	}

}
