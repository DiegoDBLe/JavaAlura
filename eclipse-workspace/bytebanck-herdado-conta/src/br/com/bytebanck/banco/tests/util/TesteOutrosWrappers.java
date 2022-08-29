package br.com.bytebanck.banco.tests.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		Integer intRef = Integer.valueOf(29); // autoboxing
		System.out.println(intRef.intValue()); // unboxing
		
		Double doubRef = Double.valueOf(3.2); // autoboxing
		System.out.println(doubRef.doubleValue()); // unboxing
		
		Boolean booRef = Boolean.TRUE; // autoboxing
		System.out.println(booRef.booleanValue()); // unboxing
		
		int idade = 40;
		// Criando uma lista do tipo Number(Classe mais generica dos Wreppers)
		List<Number> lista = new ArrayList<Number>();
		lista.add(25);
		lista.add(25.5);
		lista.add(26.6f);
		lista.add(idade);
		
		System.out.println(lista);

	}

}
