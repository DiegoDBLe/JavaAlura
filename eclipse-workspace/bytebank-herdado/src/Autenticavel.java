// Contrato Autenticavel
	//quem assina esse contato, precisa implementar 
		//metodo setSenha
		//metodo autentica

//*** Interface é abstract e fica nela somente as assinaturas dos metodos e na classe que desejo implementar 
	// a |classe autenticavel eu faço a implementação dos metodos descritos na inteface.
	
//public abstract é default em uma interface, pode colocar ou não.

public interface Autenticavel{
	
	public abstract boolean autentica(int senha);

	public abstract void setSenha(int senha);
	
}
