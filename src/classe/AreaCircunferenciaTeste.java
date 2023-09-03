package classe;

public class AreaCircunferenciaTeste {
	public static void main(String[] args) {
		AreaCircunferencia a1 = new AreaCircunferencia(2.0);
		a1.raio = 5.0;
		a1.pi = 3.14;
		//Acessei um método instanciando o objeto
		System.out.println(a1.calcArea(10));
		//Acessei um método static
		System.out.println(AreaCircunferencia.calcAreaStatic(10));
		//Acessei o valor de pi instanciado
		System.out.println(a1.pi);
		//Acessei o valor de PI static
		System.out.println(AreaCircunferencia.PI);
		//Acessei o valor de PI static da biblioterca Math do JDK
		System.out.println(Math.PI);
	}
}
