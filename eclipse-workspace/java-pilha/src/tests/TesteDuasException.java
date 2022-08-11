package tests;

public class TesteDuasException {

	public static void main(String[] args) {
		System.out.println("Inicio do main!");
        try {
            metodo1();
        }catch (ArithmeticException | NullPointerException exception) {
            String msg = exception.getMessage();
            System.out.println("Mensagem do m�todo getMessage() --> " + msg);

            System.out.println("Locais que passou: ");
            exception.printStackTrace();

//        }catch (NullPointerException nullPointerException){
//            String msg = nullPointerException.getMessage();
//            System.out.println("Mensagem do m�todo getMessage() da classe NullPointerException --> " + msg);
//        }
        }
        System.out.println("Fim do main!");
    }

    private static void metodo1() {
        System.out.println("Inicio do m�todo1");
        metodo2();
        System.out.println("Fim do m�todo1");
    }

    private static void metodo2() {
        System.out.println("Inicio do m�todo2");
        for (int i = 1; i <=5; i++){
            System.out.println(i);
              int a = i / 0;
//
//            TesteDuasExceptions duasExceptions = null;
//            duasExceptions.testes();

        }
        System.out.println("Fim do m�todo2");

	}

}
