package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class NovasApiStream {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		// Filtrando os cursos que estão acima de 100 e pedindo qualquer um atraves do
		// método findAny();
		// Optional: é uma classe nova do java8 e ela ajuda a trabalhar com null. Tipo,
		// aqui tem um curso e pode ser opcional, pode ser q ele exista ou não.
		Optional<Curso> optionalCursos = cursos.stream().filter(c -> c.getAlunos() >= 100).findAny();
		System.out.println("---- Referencia do tipo optional ---- " + optionalCursos);

		// Método orElse(null); retorna se tiver o curso dentro dos parametros que
		// passamos, se não tiver retorna nullo.
		Curso curso = optionalCursos.orElse(null);
		System.out.println("---- Método orElse da classe optional ---- " + curso);

		// O método ifPresent() da classe Optional; Verifica se tem o elemento dentro da
		// lista, se não tiver ele não faz nada.
		optionalCursos
				.ifPresent(c -> System.out.println("---- Método ifPresent da classe optional ---- " + c.getNome()));

		// Concatenando as invocações dos métodos:
		System.out.println("---- Concatenando as invocações dos métodos: ---- ");
		// Cursos.me de um fluxo de todos seus cursos. quem tem mais de 100. encontre um
		// deles. se encontrou um deles por favor faça isso, se nao encontrou nao faça
		// nada. para retornar qualquer elemento de um Stream
		cursos.stream().filter(c -> c.getAlunos() >= 100).findAny().ifPresent(c -> System.out.print(c.getNome()));

		System.out.println(
				"---- Transformando as alterações em uma nova lista ou seja, uma lista com os cursos que possui acima de 100 alunos ---- ");
		// Todos esses métodos não alteram a lista original. Para salvar as alterações
		// em uma lista original, precisamos chamar o método collection: Transformar esse Stream<Curso> filtrado em uma List<Curso>
		List<Curso> list = cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());
		System.out.println(list);

		System.out.println(
				"---- Transformando as alterações em um map ou seja, chave : valor com os cursos que possui acima de 100 alunos ---- ");
		Map<String, Integer> map = cursos.stream().filter(c -> c.getAlunos() >= 100)
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
		System.out.println(map);

		System.out.println(
				"---- Transformando as alterações em um map ou seja, chave : valor com os cursos que possui acima de 100 alunos. fazendo um forEach ---- ");
		// Outra maneira:
		cursos.stream().filter(c -> c.getAlunos() >= 100)
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
				.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos. "));

		System.out.println(
				"---- Pegando o primeiro curso que estiver acima de 50 alunos: usando o método findFirst() ---- ");
		// Pegando o primeiro curso que estiver acima de 50 alunos: usando o método
		// findFirst().. Abaixo foi criado uma referencia.
		Optional<Curso> findFirst = cursos.stream().filter(c -> c.getAlunos() > 50).findFirst();
		System.out.println(findFirst.get());

		// ou assim imprimindo direto sem referencia:
		System.out.println(cursos.stream().filter(c -> c.getAlunos() > 50).findFirst().get());

		System.out.println("---- Pegando a médias de todos os cursos atraves do método average(): ---- ");
		// Pegando a médias de todos os cursos atraves do método average() e usando
		// method reference no mapToInt:
		OptionalDouble average = cursos.stream().mapToInt(Curso::getAlunos).average();
		System.out.println(average.getAsDouble());

		// Pegando a médias de todos os cursos atraves do método average() e usando
		// Lambda no mapToInt:
		cursos.stream().mapToInt(c -> c.getAlunos()).average().ifPresent(System.out::println);;
		
		System.out.println("""
				Teste
				Quebra de linha
				com tres aspas duplas abrindo 
				e tres aspas duplas fechando. 
				A partir do java 13.
				""");
	}

}
