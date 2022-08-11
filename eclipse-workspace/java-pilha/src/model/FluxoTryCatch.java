package model;

public class FluxoTryCatch {

	public static void main(String[] args) {
		System.out.println("Inicio do main...");
		
		try {
			metodo1();
		}catch (Exception e) {
			System.out.println("Exception");
		}
		
		System.out.println("Fim do metodo main.");
	}

	private static void metodo1() {
		System.out.println("Inicio do m�todo1....");
		
		try{
			metodo2();
		}catch (Exception e) {
			System.out.println("Exception");
			
		}
		System.out.println("Fim do metodo1");
		
	}

	private static void metodo2() {
		System.out.println("Inicio do m�todo2...");
		for( int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0;
		}
		System.out.println("Fim do m�todo2...");
		
	}

}
