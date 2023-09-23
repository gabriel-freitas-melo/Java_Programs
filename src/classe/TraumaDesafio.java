package classe;

public class TraumaDesafio {
	
	int a = 3;
	
	static int b = 4;
	
	public static void main(String[] args) {
		
		TraumaDesafio td = new TraumaDesafio();
		System.out.println(td.a);
		
		System.out.println(b);
		
		/*Você só pode acessar um atributo de instância dentro de um
		 * método static se você criar uma instância antes e dpois chmá-la 
		 * com o atributo*/
		
	}
}
