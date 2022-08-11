//Composição de código: Aqui fica toda a implementação do metodo autentica e setsenha. 
//ou seja ao inves de estar em cada classe que precisa autenticar a senha criou-se essa classe onde quem precisar ou quem for usar senha e autenticar
// faz o instanciamento dela.


public class Autenticador {
	
	private int senha;

	public boolean autentica(int senha) {
		
			if(this.senha == senha) {
				return true;
			} else {
				return false;
			}

	}
	
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

}
