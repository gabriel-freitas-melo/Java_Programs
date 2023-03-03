package fundamentos;

public class Tamperatura {
	public static void main(String[] args) {
		 // ((°F - 32) * 5)/9 = °C
		double fahrenheit = 53;
		double celcius;
		final double ajuste = 32;
		final double fator = 5.0/9;
		
		celcius = (fahrenheit - ajuste) * fator;
		System.out.println("A temperatura é : " + celcius + "°C"); //Tente fixar o valor em uma casa decimal
		
	}

}
