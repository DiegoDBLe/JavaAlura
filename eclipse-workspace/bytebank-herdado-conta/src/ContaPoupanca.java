
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean sacar(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			return true;
		} else {
			return false;
		}

	}
}
