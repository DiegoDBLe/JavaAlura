// Contrato Autenticavel
	//quem assina esse contato, precisa implementar 
		//metodo setSenha
		//metodo autentica

//*** Interface � abstract e fica nela somente as assinaturas dos metodos e na classe que desejo implementar 
	// a |classe autenticavel eu fa�o a implementa��o dos metodos descritos na inteface.
	
//public abstract � default em uma interface, pode colocar ou n�o.

public interface Autenticavel{
	
	public abstract boolean autentica(int senha);

	public abstract void setSenha(int senha);
	
}
