package classe;

public class AreaCircunferencia {
	double raio;
	double pi;
	static final double PI = 3.14;
	
	AreaCircunferencia(double raio){
		
	}
	double calcArea(double raioInicial) {
		raio = raioInicial;
		return PI * Math.pow(raio, 2);
		
	}
	static double calcAreaStatic(double raio) {
		return Math.PI * Math.pow(raio, 2);
	}
}
