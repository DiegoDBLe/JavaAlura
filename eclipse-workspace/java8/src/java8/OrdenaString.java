package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		// Ordenando com criterio de ordenação de String de A a Z:
		Collections.sort(palavras);
		System.out.println(palavras);

		// Para comparar as duas String precisamos criar um Comparator de Strings:
		Comparator<String> comparador = new ComparadorPorTamanho();
		Collections.sort(palavras, comparador);
		System.out.println(palavras);
		
		// No java 8 podemos fazer o sort diretamente no List palavras adicionando o comparador como paramentro do sort:
		palavras.sort(comparador);
		System.out.println(palavras);
		
		// fiteradno na List palavras
		for (String p : palavras) {
			System.out.println("- " + p);
		}
		
		// // iterando na List através da implementação consumer.
		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);
		
		// Outra maneira de iterar e imprimir no java 8:
		palavras.forEach(System.out::println);
	}

}

class ImprimeNaLinha implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println("For com Consumer: " + t);
		
	}
	
}

class ComparadorPorTamanho implements Comparator<String> {

	// Traduzeindo o métod abaixo:
	// se o tamanho da primeira string for menor que o tamanho da segunda string
	// retorna o valor negativo:
	// se o tamanho da primeira string for maior que o tamanho da segunda string
	// retorna o valor positvo:
	// se forem do mesmo tamanho retorne 0;
	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return -1;
		}

		if (s1.length() > s2.length()) {
			return 1;
		}
		return 0;
	}

}
