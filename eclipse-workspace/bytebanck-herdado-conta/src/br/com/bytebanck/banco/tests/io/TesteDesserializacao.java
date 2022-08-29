package br.com.bytebanck.banco.tests.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebanck.banco.modelo.ContaCorrente;

public class TesteDesserializacao {

	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente contaCorrente  = (ContaCorrente) ois.readObject();
		ois.close();
		
		System.out.println(contaCorrente.getSaldo());
		System.out.println(contaCorrente.getTitullar().getNome());
		
	}
}
