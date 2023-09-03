package oo.composicao;

public class CarroTeste {
	
	public static void main(String[] args) {
		Carro uno = new Carro();
		uno.ligarCarro();
		System.out.println(uno.estaLigado());
		
		System.out.println("---------");
		uno.acelerar();			
		System.out.println(uno.motor.rpm());//metodo do objeto motor de uno
		System.out.println("---------");
		uno.desacelerar();
		System.out.println(uno.motor.rpm());//metodo do objeto motor de uno
		System.out.println("----------");
		uno.desligarCarro();
		System.out.println(uno.estaLigado());//Não existe rotação no motor qnd uno está desligado
		System.out.println(uno.motor.carro.motor.rpm());//Relação bidirecional
		
	}

}
