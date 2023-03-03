package fundamentos.operadores;

public class Aritmeticos {
	public static void main(String[] args) {
		/*OS OPERADORES ARITMÉTICOS SÃO:
		 * SOMA (+)
		 * SUBTRAÇÃO (-)
		 * MULTIPLICAÇÃO (*)
		 * DIVISÃO (/)
		 * MOD OU RESTO DA DIVISÃO (%)*/
		//A PREFERÊNCIA SEGUE A ORDEM INVERSA DA DESCRITA
		//Inteiros gera inteiros:
		int a = 9;
		int b = 2;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double)b); // casting vai gerar um valor double
		
		//Ponto flutuante gera ponto flutuante
		double x = 18.89;
		double y = 7.35;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		//Encontrando o resto da divisão
		System.out.println(a % b);
		//Resto da divisão faz mais sentido para divisão de inteiros
		
	}

}
