package multithreading.Synchronization_Learn;

public class Test {
	
	private int count =0;
	
	public synchronized void increment() {
		count++;
	}
	
	public int getCount() {
		return count;
	}

}
