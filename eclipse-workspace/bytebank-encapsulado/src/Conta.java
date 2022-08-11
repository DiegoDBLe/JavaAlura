
public class Conta {

	// ATRIBUTOS � como chamamos as caracteristicas de uma classe em Orienta��o a
	// Objetos.
	// OBJETO � uma instancia de uma classe onde podemos definir valores para seus
	// atributos.
	// E para instanciar um objeto a classe de atributos usamos a palavra NEW
	// Classe � uma especifica��o de um tipo, definindo atributos e comportamentos.

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; // Referencia a Classe cliente
	private static int total = 0; // static quer dizer que essa variavel � da classe conta ou seja � uma atributo ta classe Conta. normalmente atribuimos as variaveis locais 
	//toda vez que eu quiser atribuir algo a classe uso a palavra static. Nessa caso  static total � a variavel da classe quantas vezes classe deu new Conta. 

	
	// Metodo Construtor: Onde especifico que para criar um novo objeto � necessario
	// passar algumas informa��es. No caso abaixo s� � possivel criar uma nova conta
	// passando
	// Como paramentro numero de agencia e numero. E uma das principais
	// caracteristicas do Construtor � a inicializa��o dos atributos.

	public Conta(int agencia, int numero) {
		Conta.total++;

		this.agencia = agencia;
		this.numero = numero;
		System.out.println("ABERTURA DE CONTA:");

	}

	// Comportamento...Metodo de depositar
	public double depositar(double valor) {
		this.saldo += valor; // this.saldo este saldo que � atributo recebe o valor que � uma variavel do
								// m,etodo depositar.
		return valor;

	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}

	}

	public boolean transferir(double valor, Conta destino) { // PARAMENTROS � O QUE O METODO ACEITA
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);// REFERENCIA COMO PARAMENTRO DO METODO DEPOSITAR
			return true;
		}

		return false;

	}

	public double getSaldo() { // Metodo Getter = Recebe
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int novoNumero) { // Metodo Setter = Passa, setar informa��o. void s� pode ser em setter
		if (novoNumero <= 0) {
			System.out.println("[ERROR] NUMERO DE CONTA N�O PODE SER NEGATIVO OU IGUAL A ZERO");
			return;
		}

		this.numero = novoNumero; // Toda vez que tiver This significa que � este atributo recebe o parametro do
									// metodo.

	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) { // void s� pode ser em setter
		if (agencia <= 0) {
			System.out.println("[ERROR] NUMERO DE AG�NCIA N�O PODE SER NEGATIVO OU IGUAL A ZERO");
			return;
		}

		this.agencia = agencia; // O Atributo agencia recebe o parametro agencia que � uma variavel local.

	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() { //Metodo static quer dizer que � atributo da classe, nessa caso da classe Conta e atraves do getTotal eu consigo acessar em outra classe
		return Conta.total;
		
	}

}
