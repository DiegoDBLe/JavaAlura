package br.com.bytebanck.banco.tests;

import br.com.bytebanck.banco.modelo.Conta;
import br.com.bytebanck.banco.modelo.ContaCorrente;
import br.com.bytebanck.banco.modelo.ContaPoupanca;

public class TesteArrayObject {

	public static void main(String[] args) {
	
		// Criando um array com 5 posições começando indice 0 do tipo mais genérico: Conta
		Conta [] referencias = new Conta[5];
	
		// Criando uma referencia(objeto) do tipo ContaCorrente
		ContaCorrente cc1 = new ContaCorrente(11, 123);
		
		// Atribuindo a posição 0 do array a cc1, ou seja, index[0] no array recebe cc1
		referencias[0] = cc1;
		
		// Referencia da posição(index) no array. Fazendo uma referencia do type cast
		ContaCorrente ref = (ContaCorrente) referencias[0];
		
		System.out.println(referencias[0].getNumero());
		
		// Criando um objeto do tipo ContaPoupanca
		ContaPoupanca cc2 = new ContaPoupanca(11, 456);
		
		// Atribuindo a posição 1 do array a cc2, ou seja, index[1] no array recebe cc2
		referencias[1] = cc2;
		System.out.println(referencias[1].getNumero());
		
		ContaPoupanca ref1 = (ContaPoupanca) referencias[1];
		
		
		// Três referencias para acessar o mesmo objeto:
		System.out.println("Referencia cc1: " + cc1.getAgencia());
		System.out.println("Referencia armazenada no array: " + referencias[0].getAgencia());
		System.out.println("Referencia do type cast:  " + ref.getAgencia());
		
		System.out.println("*************************************************************");
		
		System.out.println("Referencia cc2: " + cc2.getAgencia());
		System.out.println("Referencia armazenada no array: " + referencias[1].getAgencia());
		System.out.println("Referencia do type cast: " + ref1.getAgencia());
		
		
		System.out.println("*************************************************************");
		
		// Cast Implícito:
		ContaCorrente ccc1 = new ContaCorrente(222, 333);
		Conta conta = ccc1;
		System.out.println("Cast Implícito: " + conta.getAgencia());
		
		System.out.println("*************************************************************");
		
		// Cast Explicito:
		ContaCorrente cccc1 = new ContaCorrente(222, 3333);
		Conta contas = (Conta) cccc1;
		
		System.out.println("Cast Explicito: " + contas.getAgencia());

	}

}



























