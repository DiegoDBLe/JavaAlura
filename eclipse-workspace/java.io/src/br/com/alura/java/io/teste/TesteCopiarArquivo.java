package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis); // Tranfosrmando os bits e bytes em um caracter;
		BufferedReader br = new BufferedReader(isr); // Classe que possui um m�todo para fazer a leitura dos caracteres;
		
		OutputStream fos = new FileOutputStream("lorem2.txt"); 
		Writer osw = new OutputStreamWriter(fos); // Tranfosrmando os bits e bytes em um caracter;
		BufferedWriter bw = new BufferedWriter(osw); // Classe que possui um m�todo para fazer a escrita  dos caracteres;
		
		// M�todo que l� a linha. Esse m�todo devolve String quando tem e
		// devolve null quando n�o tem mais caractere.
		String linha = br.readLine(); 
		
		// Iterando no arquivo txt, enquanto a linha for diferente de null
		// Escrevendo na linha caso nao seja nula.
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}
		br.close(); // Fechando o arquivo
		bw.close();
	}

}
