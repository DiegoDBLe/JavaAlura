package model;

public class SistemaInterno {
	
	private int senha = 1234;
	
	public void autentica(Autenticavel funcionarioAutenticavel) {
		boolean autenticou = funcionarioAutenticavel.autentica(this.senha);
		if (autenticou) {
			System.out.println("Acesso Autorizado!");
		}else {
			System.out.println("Acesso Negado!");
		}
	}

}
