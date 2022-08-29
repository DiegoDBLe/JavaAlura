package br.com.bytebanck.banco.tests;

import br.com.bytebanck.banco.modelo.Cliente;
import br.com.bytebanck.banco.modelo.ContaCorrente;
import br.com.bytebanck.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
		Object cc = new ContaCorrente(243, 1117);
		Object cp = new ContaPoupanca(789, 2273);
		Object cliente = new Cliente();
		
		System.out.println("Override método toString na classe Conta e Override na Classe ContaCorrente: " + cc);
		System.out.println("Override método toString na classe Conta e Override na Classe ContaPoupanca: " + cp);
		System.out.println("Não Override o método toString na classe Cliente: " + cliente);

	}

}
