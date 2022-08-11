
public class TestaLacoForeIf {

	public static void main(String[] args) {

		// ABAIXO TEM USANDO A CONDICIONAL IF E O BREAK
		/*
		 * for (int linha = 0; linha < 10; linha++) { 
		 * for (int coluna = 0; coluna < 100; coluna++) { 
		 * if (coluna > linha) { 
		 * 			break;
		 *  } System.out.print("*");
		 * 
		 * } System.out.println(); }
		 */

		//ABAIXO TEM ATRUBUINDO LINHA A COLUNA JA NO FOR...EXE: COLUNA <= LINHA; SEM A NECESSIDADE DE CRIAR UM IF E BREAK.
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna <= linha; coluna++) {
				
				System.out.print("*");

			}
			System.out.println();

		}
	}
}
