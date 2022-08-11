
//**** Classe cliente implementa os metodos da interface Autenticavel. E aqui eu implemento os metodos e a variavel.

public class Cliente implements Autenticavel {

	
	private Autenticador autenticador;
	
	//Construtor
	public Cliente() {
		this.autenticador = new Autenticador(); 
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha); //Deleguei a chamada para o autenticador 
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha); //Deleguei a chamada
		
	}
	
	
	

}
