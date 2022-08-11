
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(145, 778899); // Parametros referentes ao metodo construtor. Pois o metodo contrutor passa informações obrigatorias para a criação de um novo objeto
		// Nesse nosso caso a criação de uma nova conta so sera possivel quando passar o numero de agencia e numero.

		System.out.println("Agência: " + conta.getAgencia());

		System.out.println("Cc: " + conta.getNumero());
		

		Cliente cliente = new Cliente();

		conta.setTitular(cliente);// Viajando atraves das setinhas aqui eu digo que conta, vai ate titular e
									// recebe meu cliente criado acima.

		cliente.setNome("Diego Dantas Batista");
		System.out.println("Nome: " + conta.getTitular().getNome());

		cliente.setCpf("030.423.683.78");
		System.out.println("Inscrito no CPF: " + conta.getTitular().getCpf());

		cliente.setProfissao("Programador");
		System.out.println("Profissão: " + conta.getTitular().getProfissao());

		// System.out.println(cliente.getNome(""));
		// System.out.println("Inscrito no CPF: " + cliente.cpf);
		// System.out.println("Profissão: " + cliente.profissao);

		System.out.println("Deposito Realizado de R$ " + conta.depositar(500));
		System.out.println("Saque Realizado de R$ " + conta.sacar(50));
		System.out.println("Saldo em conta R$ " + conta.getSaldo());

		conta.getTitular().setNome("Levi"); // Quando dou um getter ele puxa o valor da variavel e o setter eu altero o
											// valor da variavel que eu selecionar
		System.out.println("Nome mudou para: " + conta.getTitular().getNome());

		conta.getTitular().setProfissao("Engenheiro de software");// Aqui eu dei um Getter em titular, naveguei ate
																	// profissão e setei uma nova profissão. tudo no
																	// mesmo cliente
		System.out.println("Profissão mudou para: " + conta.getTitular().getProfissao());
		System.out.println();
		
		Conta conta1 = new Conta(145, 778900);
		System.out.println("Agência: " + conta1.getAgencia());

		System.out.println("Cc: " + conta1.getNumero());
		
		Cliente cliente1 = new Cliente();
		conta1.setTitular(cliente1);
		
		cliente1.setNome("Levi Bezerra Dantas Batista");
		System.out.println("Nome: " + conta1.getTitular().getNome());
		
		cliente1.setCpf("111.222.333.45");
		System.out.println("Inscrito no CPF: " + conta1.getTitular().getCpf());
		
		cliente1.setProfissao("jogador");
		System.out.println("Profissão: " + conta1.getTitular().getProfissao());
		
		System.out.println("Deposito Realizado de R$ " + conta1.depositar(1000));
		System.out.println("Saque Realizado de R$ " + conta1.sacar(100));
		System.out.println("Saldo em Conta R$ " + conta1.getSaldo());
		System.out.println();
		System.out.println("O total de contas criadas ate o momento é : " + Conta.getTotal());//Conta é munha classe e getTotal é o metodo para acessar o atributo da classe
	}

}
