

public class Conta {

	// ATRIBUTOS � como chamamos as caracteristicas de uma classe em Orienta��o a
	// Objetos.
	// OBJETO � uma instancia de uma classe onde podemos definir valores para seus
	// atributos.
	// E para instanciar um objeto a classe de atributos usamos a palavra NEW
	// Classe � uma especifica��o de um tipo, definindo atributos e comportamentos.

	private double saldo;
	int agencia;
	int numero;
	Cliente titular; //Referencia a Classe cliente 

	//Comportamento...Metodo de depositar
	public double depositar(double valor) {
		this.saldo  += valor;
				return valor;

	}
	
	public boolean sacar(double valor){
		if (this.saldo >= valor ) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean transferir(double valor, Conta destino) { // PARAMENTROS � O QUE O METODO ACEITA
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);//REFERENCIA COMO PARAMENTRO DO METODO DEPOSITAR
			return true;
		} 
		
		return false;
		
		
	} public double getSaldo() { //Porque get ? 
		return this.saldo;
	}
	
	

}
