
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando Condicional:");

		int idade = 12;
		int quantidadePessoa = 5;

		if (idade >= 18) {
			System.out.println("Você é de maior, Seja Bem-Vindo!.");
		} else {
			if(quantidadePessoa >= 2) {
				System.out.println("Você não tem 18, anos mas está acompanhado(a) e pode entrar.");
			} else
			System.out.println("Você é de menor, não está acompnhado(a), por isso não pode entrar.");
		}
	}

}
