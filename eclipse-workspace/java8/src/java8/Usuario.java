package java8;

public class Usuario {

	private String nome;
	private int idade;
	
	
	public Usuario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	@Override
	public String toString() {
		return "[Nome: " + this.getNome() + " - Idade: " + this.getIdade() + " ]";
	}

}
