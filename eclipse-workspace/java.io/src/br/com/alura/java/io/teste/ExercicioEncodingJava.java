package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ExercicioEncodingJava {

	public static void main(String[] args) throws UnsupportedEncodingException {

		// Código com Encoding errado, sem a definição do Charset
//		String s1 = "13º Órgão Oficial";
//		byte[] bytes = s1.getBytes();
//		String s2 = new String(bytes, "UTF-8");
//		System.out.println(s2);
		
		Charset utf8 = StandardCharsets.UTF_8;
		String s1 = "13º Órgão Oficial";
		byte[] bytes = s1.getBytes(utf8);
		String s2 = new String(bytes, utf8);
		System.out.println(s2);
	}

}
