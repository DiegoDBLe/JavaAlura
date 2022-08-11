
public class ContaCorrente extends Conta  implements Tributavel{
	
	//************Esse contrutore abaixo é especifico da classe ContaCorrente. 
	//************Para herdar o construtor da classe mae coloco super() e os parametros do construtor.
 	double tx = 0.20;
	
	//*****Construtor
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override // *** Anotação de Sobre-escrever o metodo. Para sobre-escrever o metodo tem que ser igual o da classe mae em tudo.
	public boolean sacar(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor +(tx);
			return true;
		} else {
			return false;
		}

	}
	
	public double getTx() {
		return tx;
	}

	@Override
	public double getValorImposto() {
		
		return super.saldo * 0.01;
	}

		
	}
	



