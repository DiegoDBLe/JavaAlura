package model;

public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Inicio m�todo main...");

		try {
			metodo1();
		} catch (Exception exception) {
			String msg = exception.getMessage();
			System.out.println("Exception: " + msg);

			exception.printStackTrace();
		}
		System.out.println("Fim m�todo main.");
	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("Inicio m�todo1...");
		metodo2();
		System.out.println("Fim m�todo1.");
	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("Inicio m�todo2...");

//     throw new ArithmeticException("Error, deu ruim..");

		throw new MinhaExcecao("Error dois ");

	}

}
