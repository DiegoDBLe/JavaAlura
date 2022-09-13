package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		
		//// Condifção abaixo verifica pegando o salario do funcionario, multiplicando por 10% se esse valor comparando com 1000 for maior que 0, vai lançar uma excepetion.
		if(valor.compareTo(new BigDecimal("1000")) >=0) {
			throw new IllegalArgumentException("Funcionario com salario maior do que R$10000 nao pode receber bonus!");
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
		
		// Condifção abaixo verifica pegando o salario do funcionario, multiplicando por 10% se esse valor comparando com 1000 for maior que 0, valor recebe 0. Ou seja,
		// Funcionario com salarios altos recebe zero de bonus.
		// Se não retorna o valor arredondando para cima.
		
//		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
//		if (valor.compareTo(new BigDecimal("1000")) >= 0) { // Condição que verifica se o valor(salario do funcionario) multiplicado por 10% for maior que 1000,
//			// quer dizer que o salario do funcionario é mais de 10000 mil reais , logo o valor sera zero, ou seja, nao tem direito a bonificação.
//			valor = BigDecimal.ZERO;
//		}
//		return valor.setScale(2, RoundingMode.HALF_UP); // setScale(2, RoundingMode.HALF_UP); para arredondar o numero para cima
	}

}
