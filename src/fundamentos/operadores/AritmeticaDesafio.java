package fundamentos.operadores;

public class AritmeticaDesafio {
	public static void main(String[] args) {
		//Quebrar a expressão maior em partes
		//Trabalhar apenas com valor inteiro
		int a = 6*(3+2);
		int b = (int)Math.pow(a, 2);
		int c = b/(2*3);
		int d = ((1-5)*(2-7))/2;
		int e = (int)Math.pow(d, 2);
		int f = c - e;
		int g = (int)Math.pow(f, 3);
		int h = g/1000;
		System.out.println(c);
		System.out.println(e);
		System.out.println(h);
	}

}
