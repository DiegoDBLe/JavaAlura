package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteScannerUsandoLocale {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while(scanner.hasNextLine()){	
			String linha = scanner.nextLine();
			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US); // M?todo useLocale que detecta o idioma do sistema operacional e de acordo verifica o padr?o do valor double se ? , ou .
			// Esse m?todo serve para evitar a seguinte exception: Exception in thread "main" java.util.InputMismatchException
			linhaScanner.useDelimiter(",");// M?todo para separar String onde tem ","
			
			String valor1 = linhaScanner.next();
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			double valor5 = linhaScanner.nextDouble();
			
			System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
			
			linhaScanner.close();
			
			//System.out.fortat(" %s - %04d-%08d, %04s: %.2f" );
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
		}
		scanner.close();
		
	}

}
