package oo.composicao;

public class Carro {
	
	Motor motor ;
	
	Carro(){
		this.motor = new Motor(this);
		//bidirecional --> O próprio objeto atual carro será passado para construir o motor
	}
	boolean ligarCarro() {
		return motor.motorLigado = true;
	}
	boolean desligarCarro() {
		return motor.motorLigado = false;
	}
	void acelerar() {//limitar superior em 9000rpm
		 
		do{
			motor.fatorInjecao += 0.4;
		} while((motor.motorLigado == true) && (motor.fatorInjecao <= 2.8));
	}
	void desacelerar() {//limite inferior em 600rpm
		do {
			motor.fatorInjecao-=0.4;
		}while((motor.motorLigado == true) && (motor.fatorInjecao >= 0.5));
	}
//foi inseridos mecanismos de validação (Encapsulamento)
	
	String estaLigado() {
		String resultado;
		resultado = motor.motorLigado == true ? "O motor do carro está ligado" : "O motor do carro está desligado";
		return resultado;
	}
}
