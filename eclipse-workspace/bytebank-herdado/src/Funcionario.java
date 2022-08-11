
// Quando coloco uma classe Abstract quer dizer que ela não pode se tornar instanciar um objeto.. Ela é uma classe que serve somente de referencia para as demais
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario; // Protected libera informações para os filhos
	
	
	// Metodo esta abstract ou seja nada possui em seu bloco(corpo,body) sua implementação é feita nas classes filhas
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
