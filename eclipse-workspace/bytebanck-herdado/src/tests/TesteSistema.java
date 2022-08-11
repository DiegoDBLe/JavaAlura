package tests;

import model.Administrador;
import model.Cliente;
import model.Gerente;
import model.SistemaInterno;

public class TesteSistema {
	
	public static void main(String[] args) {
	
	Gerente gerente = new Gerente();
    gerente.setSenha(14);

    Administrador administrador = new Administrador();
    administrador.setSenha(1234);

    Cliente cliente = new Cliente();
    cliente.setSenha(123);

    SistemaInterno si = new SistemaInterno();
    si.autentica(gerente);
    si.autentica(administrador);
    si.autentica(cliente);
    
	}

}
