
// Teste de Exercicio Alura:
// Na classe conta foi feita a reala��o da variavel titular com a classe Cliente e posteriormente atribuida a new cliente.
//Ou seja toda vez que uma conta for criada um "Cliente" � "criado" tbm ou seja seus atributos ficam disponiveis para acesso
public class TesteExercicio {
	
	public static void main(String[] args) {
		
		//Cria��o de uma nova conta e pegadno os dados la da classe conta
		Conta contaDoBilau = new Conta();
		contaDoBilau.depositar(500);
		System.out.println(contaDoBilau.getSaldo());
		
		//Como na classe conta eu atribui Cliente titular = new Cliente(); entao toda vez que criar uma conta ja cria um cliente e seus atibutos
		// abaixo seto a conta criada com as variaveis da classe cliente sem a necessidade de criar um cliente aqui pois ja foi criado quando criou a conta
		// aqui faco associa��o ao objeto e atribui��o de valores as variaveis da classe cliente
		contaDoBilau.titular.nome = "Bilau";
		contaDoBilau.titular.cpf  = "11111";
		contaDoBilau.titular.profissao = "fudedor";
		
		System.out.println("A conta de " + contaDoBilau.titular.nome + " Inscrito no CPF: " + contaDoBilau.titular.cpf + " proffissional da are de " + 
		contaDoBilau.titular.profissao + " tem na conta a quantida de R$ " + contaDoBilau.getSaldo());
		
		
		
		
	}

}
