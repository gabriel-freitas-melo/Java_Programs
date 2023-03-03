package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	//Construtor padrão (Default)
	Data(){
		dia = 1;
		mes = 1;
		ano = 1900;
	}
	
	//Construtor específico Finalizado
	Data(int dia1, int mes1, int ano1){
		dia = dia1;
		mes =  mes1;
		ano = ano1;
		
	}
	
	String obterData(){
		return String.format("%d/%d/%d", dia , mes , ano);
	}
	//retornar vazio e pode colocar um método para retornar outro
	//Isso se chama recursividade
	void obterDataFormatada() {
		System.out.println(obterData());
	}
}
