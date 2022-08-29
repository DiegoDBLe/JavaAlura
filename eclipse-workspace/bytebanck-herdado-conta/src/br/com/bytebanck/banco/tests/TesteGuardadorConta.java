package br.com.bytebanck.banco.tests;

import br.com.bytebanck.banco.modelo.Conta;
import br.com.bytebanck.banco.modelo.ContaCorrente;
import br.com.bytebanck.banco.modelo.GuardadorDeContas;

public class TesteGuardadorConta {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta conta = new ContaCorrente(123, 456);
		guardador.adiciona(conta);
		
		Conta conta2 = new ContaCorrente(123, 789);
		guardador.adiciona(conta2);
		
		int tamanho = guardador.getQuantidadeElementoArray();
		System.out.println("Posições utilizadas no array: " + tamanho);
		
		Conta ref = guardador.getReferencia(0);
		System.out.println("Número: " + ref.getNumero());

	}

}
