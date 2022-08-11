
public class TestaGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Levi");
		g1.setCpf("123456789");
		g1.setSalario(5000.0);
		
		System.out.println("Nome: " + g1.getNome());
		System.out.println("CPF: "  + g1.getCpf());
		System.out.println("Salário R$ " + g1.getSalario());
		
		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222); //Variavel criada para verificar se senha está correta.
		
		System.out.println("Senha: " + autenticou);
		System.out.println("Bonificação do Gerente: R$" + g1.getBonificacao());

	}

}
