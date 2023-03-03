package fundamentos.operadores;

import java.util.Scanner;

public class LogicosDesafio {
	public static void main(String[] args) {
		//Inserindo a lógica dos trablhos:
		Scanner entrada = new Scanner(System.in);
		System.out.print("True ou False: \n");
		boolean trabalhoTerça = entrada.nextBoolean(); 
		System.out.print("True ou False: \n");
		boolean trabalhoQuinta = entrada.nextBoolean();
		
		boolean tv50 = trabalhoTerça && trabalhoQuinta;
		boolean tv32 = trabalhoTerça ^ trabalhoQuinta;
		boolean sorvete = tv50 || tv32;
		boolean saudavel = !sorvete;
		
		System.out.println(tv50);
		System.out.println(tv32);
		System.out.println(sorvete);
		System.out.println(saudavel);
		
		
		entrada.close();
		
		
	}

}
