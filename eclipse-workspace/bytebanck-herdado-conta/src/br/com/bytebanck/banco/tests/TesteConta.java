package br.com.bytebanck.banco.tests;

import br.com.bytebanck.banco.modelo.ContaCorrente;
import br.com.bytebanck.banco.modelo.ContaPoupanca;
import br.com.bytebanck.banco.modelo.SaldoInsuficienteException;

public class TesteConta {
	
	public static void main(String[] args) {
		 
		    ContaCorrente cc = new ContaCorrente(111, 111);
	        cc.deposita(100.0);
	        System.out.println("CC: R$ " + cc.getSaldo());

	        ContaPoupanca cp = new ContaPoupanca(222, 222);
	        cp.deposita(200.0);
	        System.out.println("CP: R$ " + cp.getSaldo());

	        try {
	            cc.transfere(10.0, cp);
	        }catch (SaldoInsuficienteException exception){
	            System.out.println(exception.getMessage());
	        }


	        System.out.println("CC: R$ " + cc.getSaldo());
	        System.out.println("CP: R$ " + cp.getSaldo());

	    }

}
