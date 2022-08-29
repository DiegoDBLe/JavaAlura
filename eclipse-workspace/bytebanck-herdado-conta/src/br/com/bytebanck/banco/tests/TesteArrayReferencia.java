package br.com.bytebanck.banco.tests;

import br.com.bytebanck.banco.modelo.ContaCorrente;

public class TesteArrayReferencia {

	public static void main(String[] args) {
	
		// Criando um array com 5 posições começando indice 0 do tipo ContaCorrente
		ContaCorrente [] contas = new ContaCorrente[5];
	
		// Criando uma referencia(objeto) do tipo ContaCorrente
		ContaCorrente cc1 = new ContaCorrente(11, 123);
		
		// Atribuindo a posição 0 do array a cc1
		contas[0] = cc1;
		
		// Referencia da posição(index) no array
		ContaCorrente ref = contas[0];
		
		System.out.println(contas[0].getNumero());
		
		ContaCorrente cc2 = new ContaCorrente(11, 456);
		contas[1] = cc2;
		System.out.println(contas[1].getNumero());
		
		
		// Três referencias para acessar o mesmo objeto:
		System.out.println("Referencia cc1: " + cc1.getAgencia());
		System.out.println("Referencia armazenada no array: " + contas[0].getAgencia());
		System.out.println("Referencia da referencia do array: " + ref.getAgencia());

	}

}



























