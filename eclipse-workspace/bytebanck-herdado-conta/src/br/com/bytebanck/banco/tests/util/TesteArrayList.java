package br.com.bytebanck.banco.tests.util;

import java.util.ArrayList;

import br.com.bytebanck.banco.modelo.Conta;
import br.com.bytebanck.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta conta1 = new ContaCorrente(123, 456);
		lista.add(conta1);
		
		Conta conta2 = new ContaCorrente(123, 789);
		lista.add(conta2);
		
		System.out.println("Tamanho da Lista: " + lista.size());
		
		System.out.println("Tem na lista a conta2 ? ");
		
		if (lista.contains(conta2)) {
			
			System.out.println("Sim!");
			
		}else{
			
			System.out.println("Não!");
			
		}
		
		Conta conta3 = new ContaCorrente(123, 987);
		lista.add(conta3);
		
		Conta conta4 = new ContaCorrente(123,654);
		lista.add(conta4);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("Total de Contas Corrente: " + lista.size());
		
		System.out.println("O que tem na posição 2 da lista: " + lista.get(2));
		
		lista.remove(conta2);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("********************************************");
		
		
		// for mais avançado: para cada objeto na(in)  lista.
		for(Object o : lista) {
			System.out.println(o);
		}
		
		System.out.println("********************************************");
		System.out.println("********************************************");
		
		lista.add(conta2);
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		
	}

}
