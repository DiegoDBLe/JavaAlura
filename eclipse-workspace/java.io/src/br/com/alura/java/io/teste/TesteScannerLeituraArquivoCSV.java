package br.com.alura.java.io.teste;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TesteScannerLeituraArquivoCSV {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"), StandardCharsets.UTF_8.name());
		
		while(scanner.hasNextLine()){	
			String linha = scanner.nextLine();
			System.out.println(linha);
		
		}
		scanner.close();
		
	}

}
