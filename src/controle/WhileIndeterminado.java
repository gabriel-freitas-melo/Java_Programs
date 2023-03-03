package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String comandoSaida = "";
		while(!comandoSaida.equalsIgnoreCase("fim")){
			System.out.print("digite o comando:");
			comandoSaida = entrada.next();
		}
		
		entrada.close();
	}
}
