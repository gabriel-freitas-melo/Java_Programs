package classe;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MecanicaThis {
	
	String Nome;
	String Marcas;
	String Teste;
	final String PROPRIETÁRIO = "Luís"; 
	double valorCarro;
	double valorSuv;
	
	Date dataHoraAtual = new Date();
	String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
	String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
	
	MecanicaThis(String Nome, String Marcas){
		this.Nome = Nome;
		this.Marcas = Marcas;
	}
	MecanicaThis(){
		//Chamar um contrutor dentro de outro
		this("GX_Motors" , "Audi BMW Mercedez");
		
	}
			
}
	
	
