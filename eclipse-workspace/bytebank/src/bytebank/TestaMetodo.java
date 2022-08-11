package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoDiego = new Conta();
		contaDoDiego.saldo = (100);
		System.out.println("Seu Saldo é R$ " + contaDoDiego.saldo);				
		System.out.println("Voce depositou R$ " + contaDoDiego.depositar(100));
		System.out.println("Seu Novo saldo é R$ " + contaDoDiego.saldo);
		
		contaDoDiego.sacar(20);
		System.out.println("Você realizou um saque. "  + "Seu novo Saldo é R$ "+ contaDoDiego.saldo);
		
		Conta contaDoLevi = new Conta();
		contaDoLevi.depositar(1000);
		
		if(contaDoLevi.transferir(300, contaDoDiego)) {
			System.out.println("TRANSFERENCIA REALIZADA COM SUCESSO");
		} else {
			System.out.println("[ERROR]SALDO INSUFICIENTE");
		};
		System.out.println("Conta do Levi ficou com R$ " + contaDoLevi.saldo);
		System.out.println("Novo Saldo é de R$ " + contaDoDiego.saldo);
		
		contaDoDiego.titular = "Diego Dantas Batista";
		System.out.println(contaDoDiego.titular);
		
	}

}
