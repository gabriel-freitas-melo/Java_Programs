package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		int age = 22;
		String name = "Gabriel";
		String lastName = "Melo";
		var salary = 25000.00;
		String sentence = String.format("My name is %s %s an I am %d years old",
				name, lastName, age); 
		System.out.println(sentence);
		System.out.printf("%d",salary);//outra forma de printar é usar o % e a variaável referente
		
	}

}