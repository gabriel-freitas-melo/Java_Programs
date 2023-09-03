package classe;

public class DataTeste {

	public static void main(String[] args) {
		char u = '\u0000';
		String s = null;
		
		//Data Padrao(Default)
		
		Data date1 = new Data();
		//Data Personalizada
		Data date2 = new Data(5 , 8 , 1956);
		
		//Chamada de métodos
		System.out.println(date1.obterData());
		System.out.println(date2.obterData());
		System.out.println("----------");
		System.out.println("----------");
		date1.obterDataFormatada();
		date2.obterDataFormatada();
		System.out.println(u);
		System.out.println(s);
	}
}
