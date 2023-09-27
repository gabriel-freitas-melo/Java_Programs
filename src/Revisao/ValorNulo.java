package Revisao;

public class ValorNulo {

	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("jj"));
		
		//ERRO NO RUNTIME DE NULLPOINTER EXCEPTION
		//Nesse Caso pode ou não ocorrer o erro  no runtime
		String s2 = Math.random() > 0.5 ? "Bom dia" : null;
		if (s2 != null) {
			System.out.println(s2.concat("jj"));
		}
		
	}
}
