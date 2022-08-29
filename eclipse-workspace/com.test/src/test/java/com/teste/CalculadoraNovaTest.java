package com.teste;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraNovaTest {
	
	//Ciclo TDD
	//1° falhar 
	@Test
	public void deveSomarDoisValores() {
		
		int valorA = 1; 
		int valorB = 2;
		
	CalculadoraNova calc =  new CalculadoraNova();
	int soma = calc.somar(valorA, valorB);
		
		assertEquals(3,soma);
		
		
		
	}
	@Test
	public void deveSomarTresValores() {
		
		int valorA = 1; 
		int valorB = 2;
		int valorC = 3;
		
	CalculadoraNova calc =  new CalculadoraNova();
	int soma = calc.somar(valorA, valorB,valorC);
		
		assertEquals(6,soma);
		
	}
	/////////Subtração
	
	public void deveSubtrairDoisValores() {
		
		int valorA = 1; 
		int valorB = 2;
		
	CalculadoraNova calc =  new CalculadoraNova();
	int subtrair = calc.subtrair(valorA, valorB);
		
		assertEquals(3,subtrair);
		
		
		
	}
	@Test
	public void deveSubtrairTresValores() {
		
		int valorA = 1; 
		int valorB = 2;
		int valorC = 3;
		
	CalculadoraNova calc =  new CalculadoraNova();
	int subtrair = calc.subtrair(valorA, valorB,valorC);
		
		assertEquals(6,subtrair);
		
	}
	
	////////////////////Multiplicação
	
public void deveMultiplicarDoisValores() {
		
		int valorA = 1; 
		int valorB = 2;
		
	CalculadoraNova calc =  new CalculadoraNova();
	int Multiplicar = calc. Multiplicar(valorA, valorB);
		
		assertEquals(3, Multiplicar);
		
		
		
	}
	@Test
	public void deveMultiplicarTresValores() {
		
		int valorA = 1; 
		int valorB = 2;
		int valorC = 3;
		
	CalculadoraNova calc =  new CalculadoraNova();
	int  Multiplicar = calc. Multiplicar(valorA, valorB,valorC);
		
		assertEquals(6, Multiplicar);
		
	}
	
	
}
