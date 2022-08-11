package model;

public class Designer extends Funcionario{

	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de Bonificação do Designer!");
		return 200;
	}

}
