
public class Programa {
	
	public static void main(String[] args) {
		TestePessoa pessoa = new TestePessoa();
		pessoa.nome = "Diego Dantas Batista";
		pessoa.idade = 33;
		
		pessoa.endere�o.logadouro = "Av. Luiza Miranda Coelho";
		pessoa.endere�o.bairro = "Luciano cavalcante";
		pessoa.endere�o.cidade = "Fortaleza";
		pessoa.endere�o.numero = "400";
		
		System.out.println("Meu nome � " + pessoa.nome
				+ " Tenho : " + pessoa.idade + " anos" + 
				" e moro em " + pessoa.endere�o.cidade +" no Bairro: " + pessoa.endere�o.bairro
				+ " no Endere�o : " + pessoa.endere�o.logadouro + " n� " + pessoa.endere�o.numero);
				;
		
	}

}
