package bytebank;

public class CriarConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta(); // Intanciamento Referencia do objeto a variavel primeira conta.
		primeiraConta.saldo = 200; // saldo da referencia conta, atribuição de um atributo
		System.out.println("Seu Saldo é: R$ " + primeiraConta.saldo);// Acesso de um atributo de um objeto
		
		primeiraConta.saldo += 100; // Referencia primeiraConta é uma referencia ao Objeto Conta
		
		Conta segundaConta = new Conta();// Criando uma nova conta atraves de referencia ao atributo conta 
		segundaConta.saldo = 500;
		
		System.out.println("A primeira conta tem R$ " + primeiraConta.saldo); 
		System.out.println("A segunda conta tem R$ " + segundaConta.saldo);
		
		if (primeiraConta.saldo > segundaConta.saldo) {
				System.out.println("Primeira conta tem mais dinheiro.");
		} else
			System.out.println("Segunda Conta tem mais dinheiro.");
		
	} 

}
