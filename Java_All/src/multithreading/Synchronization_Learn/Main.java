package multithreading.Synchronization_Learn;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		
	

	Test test = new Test();

	Thread t1 = new Thread(() -> {
		for (int i = 0; i <= 1000; i++)
			test.increment();
	});

	Thread t2 = new Thread(() -> {
		for (int i = 0; i <= 1000; i++)
			test.increment();
	});
	
	t1.start();
	t2.start();
	
	t1.join();
	t2.join();
	
	System.out.println(test.getCount());
	
	}
}
