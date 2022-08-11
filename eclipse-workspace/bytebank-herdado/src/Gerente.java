
//*****Gerente eh um Funcionario e possui varios atributos em comun podendo herdar os mesmos atributos, Gerente herda(extends) da classe Funcionario
// ****Gerente � um funcionario e extend a classe funcionario e implements a classe autenticavel

public class Gerente extends Funcionario  implements Autenticavel{

	
	//Implementa��o da classe abstrata getBonifica��o da classe mae
	
	
	public double getBonificacao() {
		//return this.salario;  o this. quer dizer que o salario esta definido naquela classe especifica.
		System.out.println("Bonifica��o de Gerente");
		return super.getSalario() *2 ;
		
		
		// ***********************Quando se Herda uma classe ao inves de colocar this. colocasse super.   pois quem pegar o codigo para trabalhar sabera 
		//que o atributo E METODO � herdada DA CLASSE M�E.
		
		//Por que coloquei o super.getBonificacao() ?
		// Porque se o programador receber uma demanda dizendo que alterou o percentual da bofifica��o ele so precisa alterar no classe mae nesse caso na classe funcionario.
		// pois com a palavra chave super ele automaticamente vai mudar na classe gerente tbm  e nas classes filhas que pertencerrem a classe mae
		// Nesse caso se for alterado o percentual da bonifica��o para todos.
		//Se nao for para todos, entao cada classe altera seu percentual.
	}
	
	private Autenticador autenticador;
	
	public Gerente() {
		this.autenticador = new Autenticador();
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.autentica(senha);
		
	}

}
