package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenandoObjetosPelaIdade {

	public static void main(String[] args) {

		Usuario u1 = new Usuario("Diego", 34);
		Usuario u2 = new Usuario("Levi", 2);
		Usuario u3 = new Usuario("Thyci", 35);
		Usuario u4 = new Usuario("Max", 16);

		List<Usuario> lista = Arrays.asList(u1, u2, u3, u4);

		System.out.println("Antes da ordenação: ");
		lista.forEach(Usuario -> System.out.println(Usuario));

		System.out.println("Depois da Ordenação por idade: ");

		Collections.sort(lista, Comparator.comparing(Usuario::getIdade));
		lista.forEach(Usuario -> System.out.println(Usuario));

	}
}