package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TesteCursoComStream {

	public static void main(String[] args) {

		// Criando uma Lista de curso e adicionando os cursos e quantidade de alunos por
		// curso:
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		// Ordenando a lista de cursos pelo numero de inscrito do menor para o maior:
		// Lambda: Curso.ordenar.comparando.dadoUmCurso.PegaOcursodeAlunos.
		System.out.println("----- Abaixo, Lambda:  Curso.ordenar.comparando.dadoUmCurso.PegaOcursodeAlunos ----- ");
		cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		System.out.println(cursos);

		System.out.println("----- Abaixo, Method referenece: Cursos.quero comparar usando o numero de alunos ----- ");
		// Method referenece: Cursos.quero comparar usando o numero de alunos.
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		System.out.println(cursos);

		
		
		System.out.println("----- Abaixo, Iterando na lista cursos com o forEach, usando method reference ----- ");
		// Iterando na lista cursos com o forEach, usando method reference:
		cursos.forEach(System.out::println);

		System.out.println("----- Abaixo, Iterando na lista cursos com o forEach, usando Lambda ----- ");
		// Iterando na lista cursos com o forEach, usando Lambda:
		cursos.forEach(c -> System.out.println(c.getNome() + " - " + c.getAlunos()));

		System.out.println("----- Usando o método stream.filter.lambda.condição.forEach.Sysout ----- ");
		// Interface fluente: quando um método chama outro método e assim sucessivamente
		// e quando o retorno de um método é o mesmo do outro.
		// Imprimindo os cursos que possui mais de 100 alunos. Ou seja impressão com
		// condição
		cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(System.out::println);

		System.out.println(
				"----- Usando stream.filtrando os alunos com mais de 100.map(method reference).forEach(method reference para imprimir ----- ");
		// Outra Maneira é usando o map():
		cursos.stream().filter(c -> c.getAlunos() >= 100).map(Curso::getAlunos).forEach(System.out::println);
		;

		// Pegamos todos os cursos, filtramos os que tem mais de 100, pegamos a
		// quantidade de alunos e somamos todos os alunos com curso acima de 100:
		int soma = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(Curso::getAlunos).sum();
		System.out.println("Total: " + soma);

		System.out.println(
				"----- Como transformar o nosso Stream<Curso> em um Stream<String> contendo apenas os nomes dos cursos? ----- ");
//	Como transformar o nosso Stream<Curso> em um Stream<String> contendo apenas os nomes dos cursos?
		// Podemos fazer essa projeção utilizando o método map:
		Stream<String> nomes = cursos.stream().map(Curso::getNome);
		nomes.forEach(System.out::println);

	}

}
