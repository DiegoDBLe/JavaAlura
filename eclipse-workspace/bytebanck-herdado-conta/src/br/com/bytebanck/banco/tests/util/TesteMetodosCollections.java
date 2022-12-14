package br.com.bytebanck.banco.tests.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.bytebanck.banco.modelo.Cliente;
import br.com.bytebanck.banco.modelo.Conta;
import br.com.bytebanck.banco.modelo.ContaCorrente;
import br.com.bytebanck.banco.modelo.ContaPoupanca;

public class TesteMetodosCollections {
	public static void main(String[] args) {
	
		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Pirulito");
		cc1.setTitullar(clienteCC1);
		cc1.deposita(333.0);
		
		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Max");
		cc2.setTitullar(clienteCC2);
		cc2.deposita(444.0);
		
		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Levi");
		cc3.setTitullar( clienteCC3);
		cc2.deposita(111.0);
		
		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Diego");
		cc4.setTitullar(clienteCC4);
		cc4.deposita(222.0);
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*--*-*-");
		System.out.println("--- Ordem de adi??o natural  na lista: --- ");
		
		List<Conta> lista = new ArrayList<Conta>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		for (Conta conta : lista) {
			System.out.println(conta+ " - " + conta.getTitullar().getNome());
		}
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*--*-*-");
		System.out.println("--- Ordem sort(Collections) pelo saldo na lista: --- ");
		
		Collections.sort(lista);
		
		for (Conta conta : lista) {
			System.out.println(conta + " - " + conta.getTitullar().getNome());
		}
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*--*-*-");
		System.out.println("--- Utilizando o m?todo reverse: --- ");
		
		Collections.reverse(lista);
		
		for (Conta conta : lista) {
			System.out.println(conta + " - " + conta.getTitullar().getNome());
		}
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*--*-*-");
		System.out.println("--- Utilizando o m?todo shuffle: --- ");
		
		Collections.shuffle(lista);
		
		for (Conta conta : lista) {
			System.out.println(conta + " - " + conta.getTitullar().getNome());
		}
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*--*-*-");
		System.out.println("-- Utilizando o m?todo rotate: rotacionar 5 posicoes -- ");
		
		Collections.rotate(lista, 5);
		
		for (Conta conta : lista) {
			System.out.println(conta + " - " + conta.getTitullar().getNome());
		}
		
		
			
		}
		
	}
