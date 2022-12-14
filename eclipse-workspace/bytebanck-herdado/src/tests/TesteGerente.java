package tests;

import model.Funcionario;
import model.Gerente;

public class TesteGerente {

	public static void main(String[] args) {
		
		
		Funcionario gerente = new Gerente();
        gerente.setNome("DEDEGA");

        System.out.println("Nome: " + gerente.getNome());

        Gerente g1 = new Gerente();

        g1.setNome("Diego Gerente");
        g1.setCpf("0321456978");
        g1.setSalario(6900.0);

        System.out.println("Nome: " + g1.getNome());
        System.out.println("CPF: " + g1.getCpf());
        System.out.println("Sal?rio: R$ " + g1.getSalario());
        System.out.println("Bonifica??o: R$ " + g1.getBonificacao());

        g1.setSenha(1234);

        boolean autenticou = g1.autentica(1234);
        if(autenticou){
            System.out.println("Bem vindo!");
        }else {
            System.out.println("Senha incorreta!");
        }

	}

}
