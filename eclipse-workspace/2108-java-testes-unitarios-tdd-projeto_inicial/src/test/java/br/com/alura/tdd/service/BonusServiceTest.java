package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() { // Ou seja, não deve receber bonus quando os 10% do salario for maior que mil reais.
		
		// esse teste vai verificar se é lançado uma exception no retorno do método, caso o salario multiplicado por 10% seja maior que mil reais.
		BonusService service = new BonusService();
		assertThrows(IllegalArgumentException.class, 
				() -> service.calcularBonus(new Funcionario("Pedro ", LocalDate.now(), new BigDecimal("25000"))));
		
	}
//	@Test
//	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() { // Ou seja, não deve receber bonus quando os 10% do salario for maior que mil reais.
//		BonusService service = new BonusService();
//		BigDecimal bonus = service.calcularBonus(new Funcionario("Pedro ", LocalDate.now(), new BigDecimal("25000")));
//
//		assertEquals(new BigDecimal("0.00"), bonus);
//
//	} Esse teste verifica se o salario multiplicado por 10% ultrapassar mil reais, entao o retorno deve ser ZERO, ou seja, funcionario recebe zero de bonus. 
	
	@Test
	void bonusDeveriaSerDezPorcentoDoSalario() { // Ou seja, bonus deve ser 10 porcento quando os 10% do salario for menor que mil reais.
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Pedro ", LocalDate.now(), new BigDecimal("5000")));

		assertEquals(new BigDecimal("500.00"), bonus);

	}
	
	@Test
	void bonusDeveRetornar10PorcentoQuandoSalarioIgualMilReais() { // Ou seja, bonus deve ser de 10% do salario quando o bonus for igual a 1000for maior que mil reais.
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Pedro ", LocalDate.now(), new BigDecimal("1000")));

		assertEquals(new BigDecimal("100.00"), bonus);

	}

}
