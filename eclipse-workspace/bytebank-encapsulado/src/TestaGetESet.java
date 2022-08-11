
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(145, 778899); // Parametros referentes ao metodo construtor. Pois o metodo contrutor passa informa��es obrigatorias para a cria��o de um novo objeto
		// Nesse nosso caso a cria��o de uma nova conta so sera possivel quando passar o numero de agencia e numero.

		System.out.println("Ag�ncia: " + conta.getAgencia());

		System.out.println("Cc: " + conta.getNumero());
		

		Cliente cliente = new Cliente();

		conta.setTitular(cliente);// Viajando atraves das setinhas aqui eu digo que conta, vai ate titular e
									// recebe meu cliente criado acima.

		cliente.setNome("Diego Dantas Batista");
		System.out.println("Nome: " + conta.getTitular().getNome());

		cliente.setCpf("030.423.683.78");
		System.out.println("Inscrito no CPF: " + conta.getTitular().getCpf());

		cliente.setProfissao("Programador");
		System.out.println("Profiss�o: " + conta.getTitular().getProfissao());

		// System.out.println(cliente.getNome(""));
		// System.out.println("Inscrito no CPF: " + cliente.cpf);
		// System.out.println("Profiss�o: " + cliente.profissao);

		System.out.println("Deposito Realizado de R$ " + conta.depositar(500));
		System.out.println("Saque Realizado de R$ " + conta.sacar(50));
		System.out.println("Saldo em conta R$ " + conta.getSaldo());

		conta.getTitular().setNome("Levi"); // Quando dou um getter ele puxa o valor da variavel e o setter eu altero o
											// valor da variavel que eu selecionar
		System.out.println("Nome mudou para: " + conta.getTitular().getNome());

		conta.getTitular().setProfissao("Engenheiro de software");// Aqui eu dei um Getter em titular, naveguei ate
																	// profiss�o e setei uma nova profiss�o. tudo no
																	// mesmo cliente
		System.out.println("Profiss�o mudou para: " + conta.getTitular().getProfissao());
		System.out.println();
		
		Conta conta1 = new Conta(145, 778900);
		System.out.println("Ag�ncia: " + conta1.getAgencia());

		System.out.println("Cc: " + conta1.getNumero());
		
		Cliente cliente1 = new Cliente();
		conta1.setTitular(cliente1);
		
		cliente1.setNome("Levi Bezerra Dantas Batista");
		System.out.println("Nome: " + conta1.getTitular().getNome());
		
		cliente1.setCpf("111.222.333.45");
		System.out.println("Inscrito no CPF: " + conta1.getTitular().getCpf());
		
		cliente1.setProfissao("jogador");
		System.out.println("Profiss�o: " + conta1.getTitular().getProfissao());
		
		System.out.println("Deposito Realizado de R$ " + conta1.depositar(1000));
		System.out.println("Saque Realizado de R$ " + conta1.sacar(100));
		System.out.println("Saldo em Conta R$ " + conta1.getSaldo());
		System.out.println();
		System.out.println("O total de contas criadas ate o momento � : " + Conta.getTotal());//Conta � munha classe e getTotal � o metodo para acessar o atributo da classe
	}

}
