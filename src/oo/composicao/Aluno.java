package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	Curso curso;
	final String nome;
	final List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	void adicionarCurso(Curso curso){
		this.cursos.add(curso);//Adicionei um curso dentro da lista de cursos
		curso.alunos.add(this);//Adicionei um aluno dentro da lista de alunos em relação a esse curwso
	}
	Curso buscarCursoPorNome(String nome) {
		for (Curso curso : this.cursos) {
			if (curso.nome.equalsIgnoreCase("JAVA-completo"));
			return curso;
		}
		return null;
	}
	public String toString() {
		return nome;
	}

}
