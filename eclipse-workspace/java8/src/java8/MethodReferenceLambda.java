package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceLambda {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		// Várias formas de fazer ordenação da menor palavra para maior palavra da
		// lista.

		// Primeira usando Comparator.comparing eLambda:
//		palavras.sort(Comparator.comparing(s -> s.length()));
//		System.out.println(palavras);

		// Melhora da primeira opção:
		palavras.sort(Comparator.comparing(String::length)); // method reference
		System.out.println(palavras);

		// Segunda: Usando lambda
//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
//		System.out.println(palavras);
//		

		// Criando uma Function e depois um Comparator onde o método comparing recebe
		// como parametro a Function.
		Function<String, Integer> funcao = String::length; // method reference
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		System.out.println("- " + palavras);

		// Terceira: Usando a interface Function e implementando o método apply e
		// passando por parametro no Comparator
//		Function<String, Integer> funcao = new Function<String, Integer>() {
//
//			@Override
//			public Integer apply(String s) {
//				return s.length();
//			}};
//			
//		Comparator<String> comparador = Comparator.comparing(funcao);
//		palavras.sort(comparador);
//		System.out.println(palavras);

		// Iterando usando o method reference:
		palavras.forEach(System.out::println);

		// Outra maneira de iterar é criando uma referencia do tipo Consumer temporario:
		// method reference::
		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);
	}

}
