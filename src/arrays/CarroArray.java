package arrays;

public class CarroArray {
	
	String Nome;
	
	CarroArray(String Nome){
		this.Nome = Nome;
	}
	//Comparando objetos iguais. Nesse Caso os que possuem o mesmo nome
@Override
public boolean equals(Object obj) {
	
	if(obj instanceof CarroArray) {
		CarroArray outro = (CarroArray) obj;
		boolean nomeTeste = outro.Nome.equals(this.Nome);
		return nomeTeste;
	} else {
		return false;
	}
}
}
