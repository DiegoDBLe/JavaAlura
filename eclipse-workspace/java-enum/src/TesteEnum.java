
public class TesteEnum {

	public static void main(String[] args) {
		
		
			System.out.println("Thread.MAX_PRIORITY: " + Thread.MAX_PRIORITY);
	        System.out.println("Thread.Normal_PRIORITY: " + Thread.NORM_PRIORITY);
	        System.out.println("Thread.MIN_PRIORITY: " + Thread.MIN_PRIORITY);

	        Thread t = new Thread(() -> System.out.println("Sem prioridade..."));
	        t.start();

	        Thread thread = new Thread(() -> System.out.println("MAX rodando..."));
	        thread.setPriority(Thread.MAX_PRIORITY);
	        thread.start();

	        Thread thread1 = new Thread(() -> System.out.println("Prioridade minima..."));
	        thread1.setPriority(Thread.MIN_PRIORITY);
	        thread1.start();

	        Thread thread2 = new Thread(() -> System.out.println("Prioridade Normal..."));
	        thread2.setPriority(Thread.NORM_PRIORITY);
	        thread2.start();

	}

}
