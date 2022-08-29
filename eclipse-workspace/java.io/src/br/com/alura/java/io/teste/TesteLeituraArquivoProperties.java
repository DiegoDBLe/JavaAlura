package br.com.alura.java.io.teste;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TesteLeituraArquivoProperties {

	public static void main(String[] args) throws IOException {

		Properties lerProps = new Properties();
		lerProps.load(new FileReader("conf.properties"));
		String login = lerProps.getProperty("login");
		String senha = lerProps.getProperty("senha");
		String endereco = lerProps.getProperty("endereco");
		
		System.out.format("Login:%s  %nSenha:%s  %nEndre�o:%s  " , login, senha, endereco);
	}

}
