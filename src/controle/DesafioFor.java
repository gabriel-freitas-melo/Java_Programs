package controle;

public class DesafioFor {
	public static void main(String[] args) {
		String valor = "#";
		for (int i = 1 ; i<=5 ; i++) {
			System.out.println(valor);
			valor += "#";
		}
		/*Agora tente gerar o mesmo resultado sem usar nenhum 
		 * valor numérico no for*/
		for ( String i = "#"; !i.equals("######") ; i+="#" ) {
			System.out.println(i);
			
		}
	
	
	}
	
	
	
	
}
