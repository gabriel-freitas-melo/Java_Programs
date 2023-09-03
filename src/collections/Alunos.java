package collections;

import java.util.Objects;

public class Alunos {
	
	String nome;
	int id;
	
	Alunos(String nome){
		this.nome = nome;
	}

	@Override
	public String toString() {

		return  this.nome + "!";
	}
	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alunos other = (Alunos) obj;
		return Objects.equals(nome, other.nome);
	}
	
}
