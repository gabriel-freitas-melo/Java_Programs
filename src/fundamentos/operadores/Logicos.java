package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 4 > 7;
		System.out.println(" AND");
		System.out.println(condicao1 && !condicao2);
		System.out.println("\n OR");
		System.out.println(condicao1 || condicao2);
		System.out.println("\n XOR");
		System.out.println(condicao1 ^ condicao2);
		System.out.println("\n NOT");
		System.out.println(!condicao2);
		
	}

}
