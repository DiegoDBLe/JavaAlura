package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteCurrentTimeMillis {

	public static void main(String[] args) throws IOException {

		
		long inicio = System.currentTimeMillis();
		
		BufferedWriter bf = new BufferedWriter(new FileWriter("testeCurrentTimeMillis.txt"));
		
		bf.write("testando quanto tempo demora para escrever tudo isso digitado");
		bf.newLine();
		bf.write("usando o m�todo currentTimeMillis para testar....");
		bf.newLine();
		
		bf.close();
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Passaram " + (fim - inicio) + " milissigundos....");
	}

}
