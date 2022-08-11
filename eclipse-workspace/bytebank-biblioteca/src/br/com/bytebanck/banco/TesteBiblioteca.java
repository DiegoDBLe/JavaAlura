package br.com.bytebanck.banco;

import br.com.bytebanck.banco.modelo.Conta;
import br.com.bytebanck.banco.modelo.ContaCorrente;
import br.com.bytebanck.banco.modelo.ContaPoupanca;

public class TesteBiblioteca {
		public static void main(String[] args) {
			
			Conta c = new ContaCorrente(123, 321);
			
			c.deposita(22.0);
			System.out.println(c.getSaldo());
			
			
			Conta cp = new ContaPoupanca(456, 450);
			cp.deposita(100);
			
			System.out.println(cp.getSaldo());
			
			Conta contaPoupanca = new ContaPoupanca(444, 4520);
			System.out.println("contaPoupanca R$ " + contaPoupanca.getSaldo());
			
			Conta contaCorrente = new ContaCorrente(987, 654);
			System.out.println("contaCorrente R$ " + contaCorrente.getSaldo());
			
		}
}
