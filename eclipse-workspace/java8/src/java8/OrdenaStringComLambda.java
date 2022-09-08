package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaStringComLambda {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		// Ordem alfabetica de A a Z pegando pela primeira letra de cada palavras.
		Collections.sort(palavras);
		System.out.println(palavras);

		// Ordenando com criterio de ordenação de String do menor para o maior:
		palavras.sort((String s1, String s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println(palavras);

		// // iterando na List através da implementação consumer.
		palavras.forEach(t -> System.out.println("For com Consumer: " + t));

		// Outra maneira de iterar e imprimir no java 8:
		palavras.forEach(System.out::println);

	}
}