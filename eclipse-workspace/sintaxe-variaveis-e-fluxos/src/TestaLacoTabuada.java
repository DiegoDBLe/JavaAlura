
public class TestaLacoTabuada {
	
	public static void main(String[] args) {
		
		
		
		for(int multiplicador = 1;multiplicador <= 10; multiplicador++ ) { // UM LA�O DENTRO DO OUTRO OU SEJA UM LA�O ENCADEADO, ANINHADOS UNS AOS OUTROS.
			System.out.println("TABUADA DO MULTIPLICADOR: " + multiplicador);
			for(int contador = 0; contador <= 10; contador++) {
				
				System.out.println( multiplicador + " x " + contador + " = " +  multiplicador * contador);
								
			} System.out.println();
		}
		
	}

}
