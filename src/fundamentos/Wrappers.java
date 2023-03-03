package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		System.out.println("Digite uma string qualquer");
		Integer i = Integer.parseInt(s.nextLine()); //Converteu String para int
		System.out.println(i);
		System.out.println("Digite uma string qualquer");
		Boolean b = Boolean.parseBoolean(s.nextLine());//Converteu String para boolean
		System.out.println(b);
		s.close();
		
	}

}
