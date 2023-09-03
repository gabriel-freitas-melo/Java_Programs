package arrays;

import java.util.Date;

public class EqualsHashcode {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		EqualsUsuario u1 = new EqualsUsuario();
		u1.nome = "Gabriel";
		u1.email = "gabrielfreitas1813@gmail.com";
		
		EqualsUsuario u2 = new EqualsUsuario();
		u2.nome = "Gabriel";
		u2.email = "gabrielfreitas1813@gmail.com";

		//Forma errada de comparar os objetos
		System.out.println(u1 == u2);
		//forma certa de comparar os objetos usando o equals
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		//vai ser true os resultados pois equals foi definido
		//o método equals na clase EqualsUsuario

		//Essa última cai no else do método equals definido
		System.out.println(u1.equals(new Date()));
		System.out.println("Trabalhando HashCode");
		System.out.println(u1.hashCode()); //retorna o tamanho do nome
		System.out.println(u1.hashCode() == u2.hashCode());//os dois tem tamanhos iguais
		
	} 

}
