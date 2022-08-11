package model;

public class Gerente extends Funcionario implements Autenticavel{

	private Autenticador autenticar;
	
	
	
	public Gerente() {
		this.autenticar = new Autenticador();
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticar.autentica(senha);
	}

	
	public void setSenha(int senha) {
		this.autenticar.setSenha(senha);
		
	}

	@Override
	public double getBonificacao() {
		return super.getSalario();
	}

}
