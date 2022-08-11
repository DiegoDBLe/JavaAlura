
public class ControleBonificacao {
	
	private double soma;
	
	// Polimorfismo � quando fazemos referencia a classe mae e reutilizamos para varios objetos. Nessa classe o controle de bonifica��o serve
	//para todos os tipos de cargos existentes e os que possam a vir ser criados. pois no metodo registra foi passado a referencia a classe me Funcionario.
	// O Polimorfismo permite que refer�ncias de tipos de classes mais genericas referenciam objetos mais especifios. ex: Funcionario (Classe mae,gerenrica) f (referencia) = 
	//new Gerente (Classe especifica) 
	
	
	
	//Implementa��o da classe abstrata getBonifica��o da classe mae
	public void registra(Funcionario f) { 
		double boni = f.getBonificacao();
		this.soma += boni;
	}
	
    
	
	public double getSoma() {
		return soma;
	}
	
	// ***** N�O � NECESSARIO CRIAR UM METODO PARA REGISTAR CADA TIPO DE FUNCIONARIO.. NO METODO REGISTRAR FAZ UMA LIGA��O COM A CLASSE FUNCIONARIO.
	// OU SEJA TODO FUNCIONARIO � REGISTRADO ATRAVAES DO METODO REGISTRAR, QUE NESSE EXEMPLO � A BOCIFICA��O 
	
	
	/*public void registra(Gerente g) {
	double boni = g.getBonificacao();
	this.soma = this.soma + boni;
}*/
	
	/*public void registra(EditorVideo ev) {
		double boni = ev.getBonificacao();
		this.soma = this.soma + boni;
	}*/
	
	
	
	
	

}
