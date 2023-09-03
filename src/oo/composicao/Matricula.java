package oo.composicao;

public class Matricula {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Gabriel");
		Aluno a2 = new Aluno("Letícia");
		Aluno a3 = new Aluno("Suzane");
		
		Curso c1 = new Curso("JS-completo");
		Curso c2 = new Curso("JAVA-completo");
		Curso c3 = new Curso("Excel");
		
		//Curso adicionou os alunos
		c1.adicionarAluno(a1);
		c1.adicionarAluno(a2);
		c1.adicionarAluno(a3);
		//Curso Adicionou os alunos
		c2.adicionarAluno(a1);
		c2.adicionarAluno(a2);
		//Aluno adicionou o curso
		a3.adicionarCurso(c3);
		System.out.println("O curso 1 tem : " +c1.alunos.size() + " alunos");
		System.out.println();
		for (Aluno aluno : c3.alunos) { //Analisou o curso 3 e mostrou a lista de alunos presentes nele
			System.out.println(c3.nome);
			System.out.println(aluno.nome);
		}
		System.out.println();
		Curso c4 = a3.buscarCursoPorNome(" ");
		if (c4 != null) {
			System.out.println(c4.nome);
			System.out.println(c4.alunos);
		}
	}

}
