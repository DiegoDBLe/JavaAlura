package com.teste;

import static org.junit.Assert.*;



import org.junit.Test;

public class CalculadoraTest {

	private int soma;

	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		soma = calc.somar("1+1+3");
		 
	}
	
	@Test
	public void testSomarComMook() {
		Calculadora calculador = new Calculadora ();
	}

	
	}


