package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaArquivo {

	public static void main(String[] args) throws IOException {
		
		// Criando uma  Arquivo  txt:
		OutputStream fos = new FileOutputStream("lorem2.txt"); 
		Writer osw = new OutputStreamWriter(fos); // Tranfosrmando os bits e bytes em um caracter;
		BufferedWriter bw = new BufferedWriter(osw); // Classe que possui um método para fazer a escrita  dos caracteres;
		
		String texto = "Criando um arquivo de texto com java";
		String texto2 = "continuando a escrever e criar uma arquivo com java";
		
		bw.write(texto);
		bw.newLine();
		bw.write(texto2);
		bw.newLine();
		bw.write("Lorem ipsum dolor.");
		
		bw.close(); // Fechando o arquivo
	}

}
