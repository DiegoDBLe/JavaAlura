
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
		// Criação da conta 
		Conta contaDoLevi = new Conta();
		contaDoLevi.depositar(1000);
		System.out.println("Seu Saldo atual R$ " + contaDoLevi.getSaldo());
		
		// Aqui especifico que que a conta que foi criada acima la recebe um novo cliente ou seja ja fica disponivel os atributos para acesso do cliente
		// sem a necessidade de criar um novo cliente, fazer as atribuições e depois estanciar a conta com o cliente criado.
		contaDoLevi.titular = new Cliente();
				
		contaDoLevi.titular.nome = "Levi";
		contaDoLevi.titular.cpf  = "123.456.789.10"; 
		System.out.println(contaDoLevi.titular.nome);
		System.out.println(contaDoLevi.titular.cpf);
	}

}
