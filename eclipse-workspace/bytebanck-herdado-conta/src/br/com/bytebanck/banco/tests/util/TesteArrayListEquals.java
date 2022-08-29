package br.com.bytebanck.banco.tests.util;

import java.util.ArrayList;

import br.com.bytebanck.banco.modelo.Conta;
import br.com.bytebanck.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta conta1 = new ContaCorrente(123, 456);
		lista.add(conta1);
		
		Conta conta2 = new ContaCorrente(123, 789);
		lista.add(conta2);
		
		Conta conta3 = new ContaCorrente(123, 787);
		boolean existe = lista.contains(conta3);
		
		if (!existe) {
			lista.add(conta3);
			System.out.println("Adicionado com sucesso!");
		}
		
		System.out.println("Existe: " + existe);
		
		for (Conta conta : lista) {
			if  (conta.equals(conta3)) {
				System.out.println("Já tenho essa conta!");
			}
		}
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		
	}

}
