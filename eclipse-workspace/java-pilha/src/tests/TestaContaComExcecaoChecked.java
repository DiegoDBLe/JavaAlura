package tests;

import model.ContaFake;
import model.MinhaExcecao;

public class TestaContaComExcecaoChecked {

/*Como o m�todo deposita() � vazio, nenhuma exce��o ser� criada. Mas, basta colocar o throws MinhaExcecao na assinatura e o compilador saber�
    que o m�todo tem uma exce��o do tipo Checked na sua assinatura. Por isso, temos que tomar uma atitude: ou colocamos throws MinhaExcecao na
    assinatura de main(), ou utilizamos try-catch.*/
	
	public static void main(String[] args) {
		
		
		ContaFake contaFake = new ContaFake();
		
		try {
			contaFake.deposita();
		}catch (MinhaExcecao excecao) {
			System.out.println("Tratando exce��o...");
		}
	}

}
