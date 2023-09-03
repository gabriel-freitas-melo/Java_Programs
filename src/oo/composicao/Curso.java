package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	Aluno aluno;
	final String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
	Curso(String nome){
		this.nome = nome;
	}
	//Junto com adicionarCurso forma uma relção bidirecional
	void adicionarAluno(Aluno aluno){
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
}
