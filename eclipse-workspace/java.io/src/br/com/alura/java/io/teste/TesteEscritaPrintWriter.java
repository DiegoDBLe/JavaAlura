package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintWriter {

	public static void main(String[] args) throws IOException {
		// Varias forma de criar um arquivo txt.. Entrada
		
		
		//Fluxo de Entrada com Arquivo
        //OutputStream fos = new FileOutputStream("lorem2.txt");
        //Writer osw = new OutputStreamWriter(fos);
        //Buff3eredWriter bw = new BufferedWriter(osw);

		//BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt")); // Classe que possui um m�todo para fazer a escrita  dos caracteres;
		
		//PrintStream ps = new PrintStream("arquivo1.txt");
		
		PrintWriter ps = new PrintWriter("arquivo2.txt");
		ps.print("Testando a clasee PrintWriter");
		ps.println();
		ps.print("Pulei uma linha e continuo digitando...");
		
		ps.close();
	}

}
