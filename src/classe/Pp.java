package classe;

public class Pp { //Apenas corrigindo um exceção de teste
	
	int a = 3;
	static int b = 4;
	
	public static void main(String[] args) {
		Pp p = new Pp();
		p.a = 3;
		System.out.println(p.a);//Membro de um objeto instanciado
		System.out.println(b);//Membro Static de uma classe
	}
	

}
