package model;

public class Conexao implements AutoCloseable {
	
	public Conexao() {
		System.out.println("Abrindo Conex?o...");
	}
	
	public void leDados() {
		System.out.println("Recebendo Dados..");
		throw new IllegalStateException();
	}

	@Override
	public void close() throws Exception {
		System.out.println("Fechando Dados...");
		
	}

}
