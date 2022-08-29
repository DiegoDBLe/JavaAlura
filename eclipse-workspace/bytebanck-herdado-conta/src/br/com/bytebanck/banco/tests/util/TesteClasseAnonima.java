package br.com.bytebanck.banco.tests.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebanck.banco.modelo.Cliente;
import br.com.bytebanck.banco.modelo.Conta;
import br.com.bytebanck.banco.modelo.ContaCorrente;
import br.com.bytebanck.banco.modelo.ContaPoupanca;

public class TesteClasseAnonima {

	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Diego");
		cc1.setTitullar(clienteCC1);
		cc1.deposita(333.0);
		
		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Levi");
		cc2.setTitullar(clienteCC2);
		cc2.deposita(444.0);
		
		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Thyci");
		cc3.setTitullar(clienteCC3);
		cc3.deposita(111.0);
		
		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Max");
		cc4.setTitullar(clienteCC4);
		cc4.deposita(222.0);
		
		List<Conta> lista = new ArrayList<Conta>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		lista.sort( new Comparator<Conta>(){

			public int compare(Conta c1, Conta c2) {
				return Integer.compare(c1.getNumero(),  c2.getNumero());		
		}	
	}
);
		System.out.println("*-*- ORDENANDO PELA CONTA *-*-*-*-");	
		
		for (Conta conta : lista) {
			System.out.println(conta + " - " + conta.getTitullar().getNome());
			}
		
		System.out.println("*-*-*-*-*-*-*-*-****-*****-*-*-*-*-*-*-*-");	
		System.out.println("*-* ORDENANDO PELO NOME -*-*-*-");
		
		lista.sort(new Comparator<Conta>() {
			
			public int compare(Conta c1, Conta c2) {
				
				String nomeC1 = c1.getTitullar().getNome();
				String nomeC2 = c2.getTitullar().getNome();
				
				return nomeC1.compareTo(nomeC2);
			}
		});
		
		for (Conta conta : lista) {
			System.out.println(conta + " - " + conta.getTitullar().getNome());
			}
	}
}