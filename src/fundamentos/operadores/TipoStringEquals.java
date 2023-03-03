package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String s1 = entrada.nextLine();
		boolean fut = "UCL".equals(s1.trim());
		String resultado = fut == true ? "Hoje tem jogo" : "NÃO TEM JOGO";
		System.out.println(resultado);
		entrada.close();
	}
}
