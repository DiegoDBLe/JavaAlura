package br.com.bytebanck.banco.tests.util;

public class TesteWrappersInteger {

	public static void main(String[] args) {
	
		
		String dez = "10";
		System.out.println(dez);
		
		// Passando uma String para inteiro
		int numeroInteiro = Integer.parseInt(dez);
		System.out.println(numeroInteiro);
		
		// Passando um inteiro para double
		Integer numero = 10;
		System.out.println(numero.doubleValue());
		
		// Valor Máximo e Minimo de cada tipo primitivo:
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println("Bits: " + Integer.SIZE);
		System.out.println("Bytes: " + Integer.BYTES);
		
		 int idade = 29;
         Integer idadeRef = Integer.valueOf(29); //autoboxing
         System.out.println(idadeRef.doubleValue());
	}

}
