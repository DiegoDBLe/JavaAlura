package br.com.bytebanck.banco.tests;

public class TesteArrayPrimitivo {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		
		idades[0] = 19;
		idades[1] = 29;
		idades[2] = 39;
		idades[3] = 49;
		idades[4] = 59;
		
		System.out.println(idades[1]);
		
		System.out.println("Tamanho do Array: " + idades.length);
		
//		for( int i = 0;  i < idades.length;  i++) {
//			idades[i] = i * i;
//		}
		
		for(int i =0;  i < idades.length;  i++) {
			System.out.println(idades[i]);
		}
		
	}

}
