package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MelhorandoCopiaDeArquivo {

	public static void main(String[] args) throws IOException {
		
		//Entrada e leitura do arquivo
		BufferedReader br = new BufferedReader(new InputStreamReader (new FileInputStream("lorem.txt")));

		// Sa?da
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("lorem.txt3")));
		
		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
	
	}

}
