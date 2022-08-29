package br.com.bytebanck.banco.tests;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura"; // Object literal
		
		//String outroNome = new String("Alura");  m� pratica. Apesar de ser uma classe, n�o se cria uma referencia assim.
		
		nome.toLowerCase();
		
		nome.replace("A", "a");
		System.out.println("nome: " + nome);		
		
		
		String outroNome = nome.replace("A", "a");
		System.out.println("nome: " + outroNome);
		
		// M�todo  Replace(); e suas duas varia��es:
		
		String name = "Diego";
		System.out.println("Come�ou com: " + name);
		
		String outroName = name.replace("Diego", "Levi");
		System.out.println("Replace para: " + outroName);
		
		String nomeLevi = outroName.replace('L','l');
		System.out.println("Alterando a primeira letra: " + nomeLevi);
		
		// M�todo charAt(); informa a letra da posi��o informada:
		
		char d = name.charAt(2);
		System.out.println("Letra na posi��o 2: " + d);
		
		
		// M�todo indexOf(); ao contr�rio do charAt ele informa a posi��o do caracter, retorna int.
		
		int posicao = name.indexOf("ie");
		System.out.println("posi��o: " + posicao);
		
		
		// M�todo substring(); Ele inicia a String do valor que passamos por parametro.
		
		String sub = name.substring(2);
		System.out.println(sub);
		
		
		// M�todo length(): Retorna o tamanho da String;
		
		System.out.println("Tamanho da String: " + name.length());
		
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
			
		}
		// M�todo isEmpty(): Retorna se uma String est� vazia(valor booleano) e o m�todo strip() e o trim(): retira os espa�os da String
			
		String vazio = " ".strip();
		
		if(vazio.isEmpty()) {
			System.out.println("Preencha os campos obrigat�rios.*");
		}
		
		
		// M�todo contains();  Retorna boleano e informa se contem ou n�o a informa��o que passamos no parametros.
		
		if(name.contains(nome)) {
			System.out.println("Cont�m!!");
		}else {
			System.out.println("N�o Cont�m!!");
		}
		
		// A Classe StringBuilder:  ajuda na concatena��o de Strings de forma mais eficiente.
		
		StringBuilder builder = new StringBuilder("Socorram");
		
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("�nibus ");
		builder.append("em ");
		builder.append("Marrocos");
		
		String texto = builder.toString();
		System.out.println(texto);
		
	}

}
