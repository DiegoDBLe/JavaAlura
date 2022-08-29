package br.com.bytebanck.banco.modelo;

public class GuardadorDeReferenciaMaisGenerico {
	
	// Criando uma variavel que � um array do tipo Conta, ou seja, um array de contas:
	private Object[ ] referencias;
	
	// Criando uma variavel do tipo int que mostra o indice(posi��o) do elemento e vamos incrementar ela a cada posi��o.
	private int posicaoLivre;
	
	// Criando o construtor: Onde o atributo referencia � um array do tipo Conta  de 10 posi��es. e inicializando a variavel referencia e a variavel posicaoLivre
	public GuardadorDeReferenciaMaisGenerico() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
		
	}


	public void adiciona(Object conta) {
		 this.referencias[this.posicaoLivre] = conta; // Pegando a posi��o do array
		this.posicaoLivre++;// Incrementando na posi��o do array.
		
	}


	public int getQuantidadeElementoArray() {
		return this.posicaoLivre; // Aqui vai dizer quantas posi��es est�o ocupadas no array.
	}


	public Object getReferencia(int posicao) { // Esse m�todo retorna a posi��o da referencia. Qual referencia est� na posi��o passada no parametro		
		return this.referencias[posicao] ;
	}

}
