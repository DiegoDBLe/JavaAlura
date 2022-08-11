package tests;

import model.Gerente;
import model.ControleBonificacao;
import model.EditorDeVideo;


public class TesteReferencia {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
        gerente.setNome("Levi");
        gerente.setSalario(5000.0);

        EditorDeVideo editorDeVideo = new EditorDeVideo();
        editorDeVideo.setNome("Thyci");
        editorDeVideo.setSalario(3000.);

        Gerente funcionario = new Gerente();
        funcionario.setNome("Diego");
        funcionario.setSalario(2000.0);

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registra(gerente);
        controleBonificacao.registra(editorDeVideo);
        controleBonificacao.registra(funcionario);

        System.out.println("Bonifica��o do Gerente R$ " + gerente.getBonificacao());
        System.out.println("Bonifica��o do Editor de Video R$ " + editorDeVideo.getBonificacao());
        System.out.println("Bonifica��o do Funcion�rio R$ " + funcionario.getBonificacao());
        System.out.println("Bonifica��o Total R$ " + controleBonificacao.getSoma());

	}

}