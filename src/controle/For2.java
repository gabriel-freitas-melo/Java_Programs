package controle;

public class For2 {
	public static void main(String[] args) {
		int i = 10;
		for(; i>=0 ; i -= 2) {
			//valor i está apenas dentro do escopo do For
			System.out.println("i = " + i);
		}
		System.out.println("Saiu do for...");
		System.out.println("Valor final de i = " +i);
	} 
}
