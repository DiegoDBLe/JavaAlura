// A classe Administrador � um funcionario e implementa em sua classe assinaturas da interface Autenticavel 

public class Administrador extends Funcionario implements Autenticavel{

	private Autenticador autenticador;
	
	public Administrador() {
		this.autenticador = new Autenticador();
	}
	
	@Override
	public double getBonificacao() {
		
		return 50;
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}
	
	
}
