
public class TestePrioridadeEnum {
	
	 public static void main(String[] args) {
		 
		 	PrioridadeEnum pMin = PrioridadeEnum.MIN;
		 	PrioridadeEnum pNormal = PrioridadeEnum.NORMAL;
		 	PrioridadeEnum pMax = PrioridadeEnum.MAX;

	        System.out.println(pMin.name());
	        System.out.println(pNormal.name());
	        System.out.println(pMax.name());

	        System.out.println(pMin.ordinal());
	        System.out.println(pNormal.ordinal());
	        System.out.println(pMax.ordinal());

	        System.out.println(pMin.getValor());
	        System.out.println(pNormal.getValor());
	        System.out.println(pMax.getValor());
	 }
}
