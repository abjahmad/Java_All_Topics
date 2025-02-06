package multithreading;

public class ByRunnableInterface implements Runnable {

	@Override
	public void run() {
		for(int i =0; i<=10; i++) {
			System.out.println(i);
		}
		
	}
public static void main(String[] args) {
	Thread t1 = new Thread(new ByRunnableInterface());
	t1.start();
	
	Thread t2 = new Thread(new ByRunnableInterface());
	t2.start();
}
}
