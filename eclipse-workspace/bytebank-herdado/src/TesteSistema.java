
public class TesteSistema {

	public static void main(String[] args) {
		
		Autenticavel g = new Gerente();
		g.setSenha(2222);
		
				
		Autenticavel adm = new Administrador();
		adm.setSenha(2222);
		
		Autenticavel cliente = new Cliente();
		cliente.setSenha(2222);
		
		Funcionario designer = new Designer();
		designer.setSalario(2500);
		designer.getBonificacao();
		
				
		SistemaInterno si = new SistemaInterno(); // Metodo autentica da classe sistema interno.
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);
		
		System.out.println("Salario de R$ " + designer.getSalario() + " Bonificação: R$ " + designer.getBonificacao());
		

	}

}
