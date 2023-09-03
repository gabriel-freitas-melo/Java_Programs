package oo.composicao;

public class Motor {
	double fatorInjecao = 1; //Fator que mede a entrada de combustível no carro
	boolean motorLigado = false; //Funcionamento do motor
	 Carro carro; //Um único carro com um único motor
	
	int rpm() {
		if (!motorLigado) {
			return 0;
		}else {
			System.out.print("RPM: ");
			return (int)Math.round(fatorInjecao * 3000);
		//Faz o arredondamento dos valores
	
		}
	}
	Motor (Carro carro){
		this.carro = carro; 
	}
}
