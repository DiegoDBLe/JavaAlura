package model;

public class Administrador extends Funcionario implements Autenticavel{
	
	private Autenticador autenticar;
	
	public Administrador() {
		this.autenticar = new Autenticador();
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticar.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticar.setSenha(senha);
		
	}

	@Override
	public double getBonificacao() {
		return 50;
	}

}
