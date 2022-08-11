
public class TestaForeIfTrianguloNumerico {
	
	public static void main(String[] args) {
		for(int linha = 0; linha < 15; linha++) {
			for(int coluna = 0; coluna < 15; coluna++) {
				if(coluna > linha) {
					break;
				}
				System.out.print(coluna+1);
			} System.out.println();
		}		
	}

}
