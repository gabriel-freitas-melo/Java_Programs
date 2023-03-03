package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
		int a = 7;
		int b = a;
		int c = a + b;
		
		c += 8; //c = c + 8;
		c -= 3; //c = c - 3;
		c *= 75;//c = c *75;
		c /= 15;//c = c/15;
		System.out.println(c);
		c %= 2; //c = c % 2;
		
		System.out.println(c);
	}

}
