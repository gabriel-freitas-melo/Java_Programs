package controle;

public class For3 {
	public static void main(String[] args) {
		/*FOR aninhado com outro FOR*/
		// Faça o Debug para ver o passo a passo
		for(int i = 0 ; i<10 ; i++) {
			for(int j = 0; j<10 ; j++) {
				System.out.printf("[%d , %d]", i , j);
			}
			System.out.println("");
		}
	}
}
