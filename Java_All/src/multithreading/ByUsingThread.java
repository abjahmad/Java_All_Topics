package multithreading;

class Test extends Thread {
	public  void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
		}
	}
}

public class ByUsingThread  {
	public static void main(String[] args) {
		Test t = new Test();
		Test t2 = new Test();
		t.start();
		t2.start();
	}
}
