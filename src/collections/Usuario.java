package collections;

import java.util.Objects;

public class Usuario {

	String nome;
	
	//Criar um usuário passando um nome como referência
	Usuario (String nome){
		this.nome= nome;
	}
	
	public String toString() {
		
		return "O meu nome é " + this.nome + "!";
	}
	
	//Gerou o hashcode e equals de forma automática
	@Override	public int hashCode() {
		return Objects.hash(nome);	}
	//Buscar elemento da collection pelo nome
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
}
