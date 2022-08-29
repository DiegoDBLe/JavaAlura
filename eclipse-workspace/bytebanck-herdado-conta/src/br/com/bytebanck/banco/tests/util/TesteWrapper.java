package br.com.bytebanck.banco.tests.util;

public class TesteWrapper {

	public static void main(String[] args) {
		
		Integer ref = Integer.valueOf(3);
		ref++;
		System.out.println(ref);
		
		// Por baixo dos panos é utilizado o autoboxing 
		int valor = ref.intValue();
		valor = valor + 1;
		ref = Integer.valueOf(valor);
		System.out.println(valor);
		// O valor é desembrulhado, depois incrementado e depois embrulhado de novo!
		
		
		// Converter String em int
		String diaComoTexto = "29";
		int dia = Integer.valueOf(diaComoTexto);
		System.out.println(dia);
		
		// ou
		
		String diaTexto = "30";
		int outroDia = Integer.parseInt(diaTexto);
		System.out.println(outroDia);
		
	}

}
