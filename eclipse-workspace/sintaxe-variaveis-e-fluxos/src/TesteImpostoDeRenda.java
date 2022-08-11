
public class TesteImpostoDeRenda {

	public static void main(String[] args) {

		double salario = 2000.0;
		
		System.out.println("1 - Dedução de 7.5% do Imposto de Renda");
		System.out.println("2 - Dedução de 15% do Imposto de Renda");
		System.out.println("3 - Dedução de 22.5% do Imposto de Renda");

		if (salario >= 1900.00 && salario <= 2800.00) {
			double novoSalario = salario - 142;

			System.out.println("Você se enquadra na categoria: 1 - Após a dedução de 7.5% de Imporsto de Renda, seu salario fica R$" + novoSalario);

		} else {
			if (salario >= 2800.01 && salario <= 3751.0) {
				double novoSalario = salario - 350;

				System.out.println("Você se enquadra na categoria: 2 - Após a dedução de 15% do Imposto de Renda, seu salario fica R$" + novoSalario);
			} else {
				if (salario >= 3751.01 && salario <= 4664.00) {

					double novoSalario = salario - 636;
					System.out
							.println("Você se enquadra na categoria: 3 - Após a dedução de 22.5% de Imposto de Renda, seu salario fica R$" + novoSalario);
				}
			}
		}
	}

}
