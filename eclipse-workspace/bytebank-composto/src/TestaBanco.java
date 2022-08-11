
public class TestaBanco {
	
	public static void main(String[] args) {
		
		//Referencia para Cliente
		Cliente diego = new Cliente();
		diego.nome = "Diego Dantas Batista";
		diego.cpf = "030.423.683.78";
		diego.profissao = "Programador";
		
		//Referencia a Conta
		Conta contaDoDiego = new Conta();
		contaDoDiego.depositar(1000);
		
		//Composição dos objetos Associa o cliente diego a conta contaDoDiego
		//contaDoDiego.titular = diego;
		contaDoDiego.titular = diego;
		System.out.println("Titular da Conta Sr(a)." + contaDoDiego.titular.nome);
		System.out.println("CPF:" + contaDoDiego.titular.cpf);
		System.out.println("Profissão:" + contaDoDiego.titular.profissao);
		System.out.println("Valor Total Disponivel: R$ " + contaDoDiego.getSaldo()); // Metodo passaSaldo para invocar (acessar) o saldo que é um atributo privado
	}

}
