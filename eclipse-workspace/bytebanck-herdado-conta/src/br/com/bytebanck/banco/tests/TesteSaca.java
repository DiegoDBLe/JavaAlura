package br.com.bytebanck.banco.tests;

import br.com.bytebanck.banco.modelo.Conta;
import br.com.bytebanck.banco.modelo.ContaCorrente;
import br.com.bytebanck.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123, 541);

        try {
            conta.saca(200);
        }catch (SaldoInsuficienteException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println(conta.getSaldo());

	}

}
