package arrays;

public class EqualsUsuario {
	
	String nome;
	String email;
	
	//Definindo um método equals para comparar instancias de EualsUsuario
	//Antes de comparar ele verifica se o objeto é uma instância de EqualsUsuario
	//Caso seja compara os atributos nome e email dos dois objetos e retorna true/false
	//Caso não seja retorna false
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof EqualsUsuario) {
			EqualsUsuario usuario = (EqualsUsuario)obj;
			boolean nomeEqual = usuario.nome.equals(this.nome);
			boolean emailEqual = usuario.email.equals(this.email);
			return nomeEqual && emailEqual;
		}else {
			return false;
		}

		
	}
	@Override
	public int hashCode() {
		return this.nome.length();
	}
}
