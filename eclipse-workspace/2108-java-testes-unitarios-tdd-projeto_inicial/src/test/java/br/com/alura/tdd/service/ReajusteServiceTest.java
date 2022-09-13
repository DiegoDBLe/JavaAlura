package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

class ReajusteServiceTest {

	private ReajusteService service;
	private Funcionario funcionario;

	@BeforeEach
	void inicializar() {
		System.out.println("Inicio.");
		this.service = new ReajusteService();
		this.funcionario = new Funcionario("João", LocalDate.now(), new BigDecimal("1000.00"));
	}

	@BeforeAll
	static void antesDeTudo() {
		System.out.println("Inicio de Tudo...");
	}
	@AfterEach
	void depoisDeCadaMetodo() {
		System.out.println("Fim.");
	}
	
	@AfterAll
	static void depoisDeTudo() {
		System.out.println("Fim de Tudo...");
	}
	@Test
	void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {
		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());

	}

	@Test
	void reajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForBom() {
		service.concederReajuste(funcionario, Desempenho.BOM);

		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());

	}

	@Test
	void reajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForOtimo() {
		service.concederReajuste(funcionario, Desempenho.OTIMO);

		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());

	}

}
