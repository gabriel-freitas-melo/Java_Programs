package fundamentos;

public class TipoPrimitivo {

	public static void main(String[] args) {
		//Valores inteiros
		byte anosEmpresa = 16;
		short leadsConquistadas = 867;
		int codigoID = 77845;
		long usuáriosGerados = 786325;
		/*Deve colocar um F depois do número no float pois se trata
		 * de um ponto flutuante */
		float salarioFuncionario = 22650.00F;
		double faturamentoFinal = 48096812.64;
		//Tipo caractere, pode usar letra, numero ou caractere Unicode
		char logoEmpresa = '\u0010';
		//Tipo booleano que pode ser verdadeiro ou falso
		boolean funcionárioContratado = true;
		
		System.out.println(logoEmpresa);
		System.out.println("Status funcionário: "+ codigoID + " "+ funcionárioContratado);
		System.out.println("Dias totais trabalhados na empresa " + anosEmpresa * 365);
		System.out.println("Media de leas conquistadas por ano " + leadsConquistadas/anosEmpresa);
		System.out.println("Código do Funcionário "+ codigoID);
		System.out.println("Usuários médios anuais " + usuáriosGerados/anosEmpresa);
		System.out.println(codigoID + "--> R$ " + salarioFuncionario);
		System.out.println("Faturamento total: R$ " + faturamentoFinal);
		
		
		
	}
}
