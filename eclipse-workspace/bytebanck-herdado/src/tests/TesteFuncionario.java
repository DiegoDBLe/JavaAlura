package tests;

import model.Gerente;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente funcionario = new Gerente();

        funcionario.setNome("Diego");
        funcionario.setCpf("123.456.789-10");
        funcionario.setSalario(2600.0);

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Sal?rio: R$ " + funcionario.getSalario());
        System.out.println("Bonifica??o R$ " + funcionario.getBonificacao());
    }

}
