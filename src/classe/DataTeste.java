package classe;

public class DataTeste {

	public static void main(String[] args) {
		char u = '\u0000';
		String s = null;
		System.out.println(u);
		System.out.println(s);
		
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
		System.out.println("----------");
		System.out.println("----------");
		
		System.out.println("Atribuição por referência e valor");
		//Atribuição por referência
		Data date3 = date1;
		date3.dia = 20; 
		date1.obterDataFormatada();
		
		dataReturnDefault(date3);
		
		date1.obterDataFormatada();
		
		
	}
	//O mesmo ocorre quando passar um objeto como parâmetro de um método
	static void dataReturnDefault(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
}
