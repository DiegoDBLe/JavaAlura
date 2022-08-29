package br.com.bytebanck.banco.modelo;

public class GuardadorDeContas {
	
	// Criando uma variavel que é um array do tipo Conta, ou seja, um array de contas:
	private Conta[ ] referencias;
	
	// Criando uma variavel do tipo int que mostra o indice(posição) do elemento e vamos incrementar ela a cada posição.
	private int posicaoLivre;
	
	// Criando o construtor: Onde o atributo referencia é um array do tipo Conta  de 10 posições. e inicializando a variavel referencia e a variavel posicaoLivre
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
		
	}


	public void adiciona(Conta conta) {
		 this.referencias[this.posicaoLivre] = conta; // Pegando a posição do array
		this.posicaoLivre++;// Incrementando na posição do array.
		
	}


	public int getQuantidadeElementoArray() {
		return this.posicaoLivre; // Aqui vai dizer quantas posições estão ocupadas no array.
	}


	public Conta getReferencia(int posicao) { // Esse método retorna a posição da referencia. Qual referencia está na posição passada no parametro		
		return this.referencias[posicao] ;
	}

}
