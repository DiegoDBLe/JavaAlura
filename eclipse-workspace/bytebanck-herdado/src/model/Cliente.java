package model;

public class Cliente implements Autenticavel {
	
	private Autenticador autenticar;
	
	
	
	public  Cliente() {
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

}
