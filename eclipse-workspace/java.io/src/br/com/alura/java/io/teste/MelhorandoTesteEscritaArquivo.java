package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MelhorandoTesteEscritaArquivo {

	public static void main(String[] args) throws IOException {
			
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter( new FileOutputStream ("lorem.txt3" )));
		
		String texto = "Texto java teste escrtia e cria��o de arquivo";
		String texto1 = "Continua��o da escrita do arquivo";
		
		bw.write(texto);
		bw.newLine();
		bw.write(texto1);
		
		bw.close();

	}

}
