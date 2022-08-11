

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Gerente();
		
		nico.setNome("Nico Steppat");
		nico.setCpf("12345678910");
		nico.setSalario(2600.00);
		
		System.out.println("Nome: " + nico.getNome());
		System.out.println("Salrio de R$ " + nico.getSalario() + " + "+ "Bonificação é o salario x2 Total: R$ " +  nico.getBonificacao());
		

	}

}
