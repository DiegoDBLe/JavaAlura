package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeiraConta: R$ " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta; // Referencia ao objeto primeiraConta
		System.out.println("Saldo segundaConta R$ " + segundaConta.saldo);

		segundaConta.saldo += 100;
		System.out.println("Saldo da segundaConta R$ " + segundaConta.saldo);
		System.out.println("Saldo da primairaConta R$ " + primeiraConta.saldo);

		if (primeiraConta == segundaConta) {
			primeiraConta.saldo += segundaConta.saldo;
			System.out.println("O Saldo total é de R$ " + primeiraConta.saldo);
		} else {
			System.out.println("[ERROR] Contas diferentes.");
		}
	}

}
