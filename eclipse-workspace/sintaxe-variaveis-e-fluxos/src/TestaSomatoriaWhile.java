
public class TestaSomatoriaWhile {
	
	public static void main(String[] args) {
		
		int contador = 0;
		int total = 0;
		
		while(contador <= 10) {
			total += contador; // O += SIGNIFICA QUE TOTAL RECEBE TOTAL...TOTAL = TOTAL + CONTADOR.. SINTAXE SUBSTITUIDA POR +=
			contador++;
			System.out.println(total);
		}
	}

}
