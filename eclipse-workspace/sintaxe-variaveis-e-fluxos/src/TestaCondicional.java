
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando Condicional:");

		int idade = 12;
		int quantidadePessoa = 5;

		if (idade >= 18) {
			System.out.println("Voc� � de maior, Seja Bem-Vindo!.");
		} else {
			if(quantidadePessoa >= 2) {
				System.out.println("Voc� n�o tem 18, anos mas est� acompanhado(a) e pode entrar.");
			} else
			System.out.println("Voc� � de menor, n�o est� acompnhado(a), por isso n�o pode entrar.");
		}
	}

}
