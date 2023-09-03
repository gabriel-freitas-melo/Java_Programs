package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	
	//Construtor padrão (Default)
	Data(){
		this(1, 1, 1970);
	}
	
	//Construtor específico Finalizado
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes =  mes;
		this.ano = ano;
		
	}
	
	String obterData(){
		return String.format("%d/%d/%d", dia , mes , ano);
	}
	//retornar vazio e pode colocar um método para retornar outro
	//Isso se chama recursividade
	void obterDataFormatada() {
		System.out.println(this.obterData());
	}
}
