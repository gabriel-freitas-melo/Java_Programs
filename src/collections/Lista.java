package collections;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		//Duas formas de inserir um usuário na lista
		Usuario u1 = new Usuario("Gabriel");
		lista.add(u1);
		//Pode criar uma nova instância direto na Lista
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Gustavo"));
		lista.add(new Usuario("Daniel"));
		lista.add(new Usuario("Deusdeth"));
		
		//A ordem de nomes da lista segue a ordem de inserção
		for (Usuario usuario : lista) {
			System.out.println(usuario.nome);
		}
		//Imprimindo um elemento pelo seu índice(Indexado)
		//Segue o padrão do método toString
		System.out.println();
		System.out.println(lista.get(0));
		System.out.println();
		//Imprimindo todos os elementos usando o toString
		for(int i = 0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		lista.remove(3);
		System.out.println();
		for(int i = 0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println();
		for(Usuario u: lista) {
			System.out.println(u);
		}
		System.out.println(lista.contains(new Usuario("Gabriel")));
		
	}

}
