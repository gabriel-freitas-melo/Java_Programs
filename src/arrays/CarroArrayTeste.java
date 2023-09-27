package arrays;
import java.util.Date;
import java.util.Scanner;

public class CarroArrayTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Instanciei um array de objetos da classe CarroArray
		//Nome do Array é carros
		CarroArray[] carros = new CarroArray[4];
		 
		for(int i = 0 ; i < carros.length ; i++) {
			System.out.println("Nome do carro:");
			String Nome = sc.nextLine();
			carros[i] = new CarroArray(Nome);
			
		}
		for(CarroArray name: carros) {
			
		System.out.print(name.Nome + "|");
		}
		System.out.println();
		
		//Equals
		System.out.println("Testando o equals com objetos diferentes");
		System.out.println(carros[0].equals(new Date()));
		System.out.println("Testando O equlas com objetos iguais (Mesmo nome)");
		System.out.println(carros[0].equals(carros[3]));
		sc.close();
	}
}
