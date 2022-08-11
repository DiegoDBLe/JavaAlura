
public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("Testando Condicional:");

		int idade = 15;
		int quantidadePessoa = 1;
		boolean acompanhado = quantidadePessoa >= 2;
		
		System.out.println(acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja Bem-Vindo!.");
		} else {

			System.out.println("Você é de menor, não está acompnhado(a), por isso não pode entrar.");
		}
	}

}
