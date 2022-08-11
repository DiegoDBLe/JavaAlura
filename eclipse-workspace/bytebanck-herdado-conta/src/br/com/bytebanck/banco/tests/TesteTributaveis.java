package br.com.bytebanck.banco.tests;

import br.com.bytebanck.banco.modelo.CalculadorDeImposto;
import br.com.bytebanck.banco.modelo.ContaCorrente;
import br.com.bytebanck.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 111);
        cc.deposita(100);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(seguroDeVida);

        System.out.println(calc.getTotalImposto());

	}

}
