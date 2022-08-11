
public class TestaVariaveis {

	public static void main(String[] args) {
		
		int idade = 33;
		double salario = 6754.20;
		
		if (idade >= 18) {

			System.out.println("Olá, mundo novamente, me chamo Diego e tenho " + idade + " anos e meu salário é de R$ " + salario);
		} else {
			System.out.println("Proibido a entrada de Menores.");
		}

		//Casting exemplo abaixo: quando quero converter forçando o compilador a converter um double para int
		
		int valor = (int)salario;
		
		System.out.println("Forçando o compilador a mostrar um Double em int R$ " + valor);
		
		/* Tamanho dos tipos primitivos 
		 * boolean - 1 bit
		 * byte    - 1 byte
		 * short   - 2 bytes
		 * char    - 2 bytes
		 * int     - 4 bytes
		 * float   - 4 bytes
		 * long    - 8 bytes
		 * double  - 8 bytes*/
		
		

	}

}
