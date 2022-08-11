
public enum PrioridadeEnum {
	
	MIN(1), NORMAL(5),  MAX(10);
	
	private int valor;
	
	PrioridadeEnum(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}

}
