package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeituraArquivo {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de entrada com Arquivo  txt:
		InputStream fis = new FileInputStream("lorem.txt"); // Abrindo um arquivo txt;
		Reader isr = new InputStreamReader(fis); // Tranfosrmando os bits e bytes em um caracter;
		BufferedReader br = new BufferedReader(isr); // Classe que possui um método para fazer a leitura dos caracteres;
		
		// Método que lê a linha. Esse método devolve String quando tem e
		// devolve null quando não tem mais caractere.
		String linha = br.readLine(); 
		
		// Iterando no arquivo txt, enquanto a linha for diferente de null
		// Imprime a linha e faz a leitura novamente da linha.
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		br.close(); // Fechando o arquivo
	}

}
