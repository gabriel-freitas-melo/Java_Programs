package classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Gabriel" , 80.0);
		Comida c1 = new Comida("arroz", 0.5);
		Comida c2 = new Comida("feijão" , 0.3);
		Comida c3 = new Comida("carne", 0.5);
		p1.pesoInicial();
		p1.comer(c1);
		p1.comer(c2);
		p1.comer(c3);
		
	}
	

}
