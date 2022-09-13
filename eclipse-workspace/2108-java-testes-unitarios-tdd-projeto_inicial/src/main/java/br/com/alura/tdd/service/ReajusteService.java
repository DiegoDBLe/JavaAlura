package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {

			BigDecimal percentual  = desempenho.percentualReajuste(); // Aqui de acordo com o desempenho passado ele retorna o percentual.
			BigDecimal reajuste = funcionario.getSalario().multiply(percentual); // Aqui ele pega o salario do funcionario e mutiplica pelo percentual que o desempenho passou.
			funcionario.reajustarSalario(reajuste); // E aqui aplica o reajuste no salario do funcionario passado no parametro.
	}

}
