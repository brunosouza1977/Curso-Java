package curso;

import java.util.ArrayList;
import java.util.List;

public class TrabalhandoListas {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Bruno");
		lista.add("Sheylla");
		lista.add("Edson");
		lista.add("Luciene");
		lista.add("Cecilia");
		lista.add("Manuela");
		
		System.out.println(lista);
		lista.remove(2);
		System.out.println(lista);
		System.out.println("Tamanho da lista: " + lista.size());
		System.out.println("Posição de Luciene: " + lista.indexOf("Luciene"));

	}

}
