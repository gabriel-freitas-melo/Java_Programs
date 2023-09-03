package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		Deque <String> livros = new ArrayDeque<>();
		livros.push("Silmarillion");
		livros.push("Hobbit");
		livros.push("senhor dos aneis");
		System.out.println("Primeiro livro da pilha é : " + livros.peek());
		livros.pop();
		System.out.println(livros);
	}
}
