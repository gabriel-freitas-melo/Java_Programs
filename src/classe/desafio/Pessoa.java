package classe.desafio;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome , double peso){
		this.nome = nome;
		this.peso = peso;
	}
	void pesoInicial() {
		System.out.println("Pesso Inicial de " + nome + " é: " + peso + " kg" );
		System.out.println("------------------");
	}
	//PASSANDO O OBJETO COMIDA COMO PARÂMETRO DO MÉTODO COMER
	void comer (Comida comida) {
		if (comida != null) {//tratamento do null exception
			peso += comida.peso;//A cada chamada desse método atualiza-se o peso
			System.out.println(nome + " comeu " + comida.nome);
			System.out.println("Peso atualizado = " + peso + " kg");
			
		}
		
	}

}
