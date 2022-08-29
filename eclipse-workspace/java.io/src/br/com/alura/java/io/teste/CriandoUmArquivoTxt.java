package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CriandoUmArquivoTxt {

	public static void main(String[] args) throws IOException {

		BufferedWriter bf = new BufferedWriter(new FileWriter("arquivo.txt"));
		
		bf.write("Criadno arquivo txt do zero mano, ta ligado!");
		bf.newLine();
		bf.write("é nois tio!! tlg");
		bf.newLine();
		bf.newLine();
		bf.write("Atenciosamente, é tios!");
		
		bf.close();
		
	}

}
