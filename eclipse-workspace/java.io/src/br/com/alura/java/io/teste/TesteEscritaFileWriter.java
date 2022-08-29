package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com Arquivo
        //OutputStream fos = new FileOutputStream("lorem2.txt");
        //Writer osw = new OutputStreamWriter(fos);
        //Buff3eredWriter bw = new BufferedWriter(osw);
		
		//		FileWriter é um OutputStream.
		//		Não é verdade, pois o FileWriter é um Writer e não um OutputStream.
		//		Para ser mais específico, a classe FileWriter estende a classe OutputStreamWriter, que por sua vez estende a classe Writer. 
		//		Então o FileWriter é um OutputStreamWriter e é um Writer.

		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt")); // Classe que possui um método para fazer a escrita  dos caracteres;
		
		bw.write("Testando classe FileWriter");
		bw.newLine();
		bw.write("Pulei uma linha");
		
		bw.close();
	}

}
