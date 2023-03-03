package fundamentos;

public class ConversãoTipoPrimitivo { 
	public static void main(String[] args) {
		//CASTING
		int a = (int)1.6; // Vai pegar apenas a parte inteira do número
		System.out.println(a);
		double b = 1;  //Houve uma conversão implícita
		System.out.println(b);
	}

}
