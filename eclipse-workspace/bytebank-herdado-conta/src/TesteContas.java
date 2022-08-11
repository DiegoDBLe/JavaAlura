

public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.depositar(100);
		System.out.println("Saldo Atual da Conta Corrente: R$ " + cc.getSaldo());
		
		ContaCorrente tributos = new ContaCorrente(222,333);
		tributos.depositar(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println("Saldo R$ " + tributos.getSaldo() + "Seguro R$ " + calc.getTotalImposto() );
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.depositar(200);
		
		cc.transferir(10.0, cp);
		
		System.out.println("Transferiu dinheiro: ");
		
		System.out.println("Saldo atual CC R$ " + cc.getSaldo());
		System.out.println("Saldo atual CP R$ " + cp.getSaldo());
		
		System.out.println("Você realizou um saque de R$ " + cc.sacar(10.0) + " + Cobrança da taxa de saque  R$ " + cc.getTx()+ " centavos");
		System.out.println("Saldo atual CC R$ " + cc.getSaldo());
		
		cc.transferir(70.0, cp);
		
		System.out.println("Saldo atual CC R$ " + cc.getSaldo());
		System.out.println("Saldo atual CP R$ " + cp.getSaldo());

	}

}
