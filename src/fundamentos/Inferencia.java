package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		char status = 'A';
		int a =14;
		double b = 14;
		var c = 88.15; //Pela inferência, c será do tipo double
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("Status = "+ status);
		
		
	}
}
