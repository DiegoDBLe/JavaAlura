package br.com.bytebanck.banco.tests;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura"; // Object literal
		
		//String outroNome = new String("Alura");  má pratica. Apesar de ser uma classe, não se cria uma referencia assim.
		
		nome.toLowerCase();
		
		nome.replace("A", "a");
		System.out.println("nome: " + nome);		
		
		
		String outroNome = nome.replace("A", "a");
		System.out.println("nome: " + outroNome);
		
		// Método  Replace(); e suas duas variações:
		
		String name = "Diego";
		System.out.println("Começou com: " + name);
		
		String outroName = name.replace("Diego", "Levi");
		System.out.println("Replace para: " + outroName);
		
		String nomeLevi = outroName.replace('L','l');
		System.out.println("Alterando a primeira letra: " + nomeLevi);
		
		// Método charAt(); informa a letra da posição informada:
		
		char d = name.charAt(2);
		System.out.println("Letra na posição 2: " + d);
		
		
		// Método indexOf(); ao contrário do charAt ele informa a posição do caracter, retorna int.
		
		int posicao = name.indexOf("ie");
		System.out.println("posição: " + posicao);
		
		
		// Método substring(); Ele inicia a String do valor que passamos por parametro.
		
		String sub = name.substring(2);
		System.out.println(sub);
		
		
		// Método length(): Retorna o tamanho da String;
		
		System.out.println("Tamanho da String: " + name.length());
		
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
			
		}
		// Método isEmpty(): Retorna se uma String está vazia(valor booleano) e o método strip() e o trim(): retira os espaços da String
			
		String vazio = " ".strip();
		
		if(vazio.isEmpty()) {
			System.out.println("Preencha os campos obrigatórios.*");
		}
		
		
		// Método contains();  Retorna boleano e informa se contem ou não a informação que passamos no parametros.
		
		if(name.contains(nome)) {
			System.out.println("Contém!!");
		}else {
			System.out.println("Não Contém!!");
		}
		
		// A Classe StringBuilder:  ajuda na concatenação de Strings de forma mais eficiente.
		
		StringBuilder builder = new StringBuilder("Socorram");
		
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		
		String texto = builder.toString();
		System.out.println(texto);
		
	}

}
