package arrays;

public class ForEach {
	public static void main(String[] args) {
		double [] notas = {8.5 , 8.8 , 7.9, 9.6};
		//pode colocar qualquer nome da variável local do for esach
		for(double n: notas) {
			System.out.println(n);
		}
	}
}
