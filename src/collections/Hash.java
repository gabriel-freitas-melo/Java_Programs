package collections;

import java.util.HashSet;

public class Hash {
	
	public static void main(String[] args) {
		HashSet<Usuario> user = new HashSet<>();
		user.add(new Usuario("Gabriel"));
		user.add(new Usuario("Daniel"));
		user.add(new Usuario("Ana Paula"));
		user.add(new Usuario("Deusdeth"));
		//Para verificar se o elemento está presente no conjunto
		//É NECESSÁRIO FAZER A VARREDURA COM O SET E E COMPARAÇÃO COM O EQUALS
		boolean result = user.contains(new Usuario("Gabriel"));
		System.out.println(result);
	}
	
}
