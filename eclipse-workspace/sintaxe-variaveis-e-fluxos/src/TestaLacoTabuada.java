
public class TestaLacoTabuada {
	
	public static void main(String[] args) {
		
		
		
		for(int multiplicador = 1;multiplicador <= 10; multiplicador++ ) { // UM LAÇO DENTRO DO OUTRO OU SEJA UM LAÇO ENCADEADO, ANINHADOS UNS AOS OUTROS.
			System.out.println("TABUADA DO MULTIPLICADOR: " + multiplicador);
			for(int contador = 0; contador <= 10; contador++) {
				
				System.out.println( multiplicador + " x " + contador + " = " +  multiplicador * contador);
								
			} System.out.println();
		}
		
	}

}
