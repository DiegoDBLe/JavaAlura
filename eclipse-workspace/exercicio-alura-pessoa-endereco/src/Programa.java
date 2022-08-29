
public class Programa {
	
	public static void main(String[] args) {
		TestePessoa pessoa = new TestePessoa();
		pessoa.nome = "Diego Dantas Batista";
		pessoa.idade = 33;
		
		pessoa.endereço.logadouro = "Av. Luiza Miranda Coelho";
		pessoa.endereço.bairro = "Luciano cavalcante";
		pessoa.endereço.cidade = "Fortaleza";
		pessoa.endereço.numero = "400";
		
		System.out.println("Meu nome é " + pessoa.nome
				+ " Tenho : " + pessoa.idade + " anos" + 
				" e moro em " + pessoa.endereço.cidade +" no Bairro: " + pessoa.endereço.bairro
				+ " no Endereço : " + pessoa.endereço.logadouro + " n° " + pessoa.endereço.numero);
				;
		
	}

}
